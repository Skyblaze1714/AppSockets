/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.net.*;
import java.io.*;

import commons.*;

/**
 *
 * @author Gunea-Lasagno-Prisecaru
 */
public class SocketManager {

    //Attributi
    //Porta
    private int port;
    
    //Oggetti per lo stream
    private ObjectOutputStream output;
    private ObjectInputStream input;

    //Oggetti per il socket
    private ServerSocket server;
    private Socket client;

    //Costruttore
    public SocketManager(int port) {
        this.port = port;
        start();    //Inizializzazione del server socket
        run();      //Avvio del server socket
    }

    //Metodi
    private boolean start() {

        try {

            server = new ServerSocket(port);

        } catch (IOException ex) {

            ex.printStackTrace();
            return false;

        }

        System.out.println("Server created with success!");
        return true;

    }

    private void run() {
        while (true) {
            try {
                //Preparazione alla trasmissione
                waitForConnections();   //Attesa di una connessione
                setupStreams();         //Inizializzazione degli stream
                
                //Ricezione dei dati dal client
                Message request = (Message) input.readObject();

                //Risposta al client
                Message response;
                
                switch (request.method) {
                    case "getQuiz":
                        response = new Message(new Quiz());
                        break;
                    case "postQuiz":
                        response = new Message("outcome", true);
                        break;
                    default:
                        response = new Message("outcome", false);
                        break;
                }

                //Invio risposta al client
                output.writeObject(response);
                
                System.out.println("server socket: connection closed!");
                
            } catch (IOException | ClassNotFoundException ex) {
                ex.printStackTrace();
            }
        }
    }

    /**
     * Attende la connesione di qualcuno al server e poi inizializza il socket del client
     * @throws IOException 
     */
    private void waitForConnections() throws IOException {
        //Attesa di una connesione
        System.out.println("server socket: waiting for someone to connect...");
        client = server.accept(); //Accettazione della connesione
        System.out.println("server socket: connected!");
    }

    /**
     * Inizializza gli stream di output e input
     * @throws IOException
     */
    private void setupStreams() throws IOException {
        //Inizializzazione dello stream di output
        output = new ObjectOutputStream(client.getOutputStream());
        output.flush();//Pulizia dello stream di output
        
        //Inizializzazione dello stream di input
        input = new ObjectInputStream(client.getInputStream());
        
        System.out.println("server socket: streams setup completed!");
    }
    
    
    public static void main(String[] args) {
        new SocketManager(1234);
    }

}
