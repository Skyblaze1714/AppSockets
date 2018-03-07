/*
 * Classe per l'invio di richieste al server tramite socket
 */
package client;

import java.net.*;
import java.io.*;

import commons.*;

/**
 *
 * @author Gunea-Lasagno-Prisecaru
 */
public class ClientSocketManager {
    
    //Attributi
    //Porta
    private final int port;
    
    //Oggetti per lo stream
    private ObjectOutputStream output;
    private ObjectInputStream input;
    
    //Socket
    private Socket socket;
    
    
    //Costruttori
    /**
     * Costruisce un oggetto della classe ClientSocketManager
     * @param port Porta da utilizzare per la trasmissione
     */
    ClientSocketManager (int port){
        this.port = port;
        start();
    }
    
    /**
     * Costruisce un oggetto della classe ClientSocketManager con una porta di default (1234)
     */
    ClientSocketManager (){
        this.port = 1234;
        start();
    }
    
    
    //Metodi
    /**
     * Inizializza il socket per la trasmissione
     */
    private void start() {
        //Inizializzazione del socket
        try {
            socket = new Socket("localhost", port);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    /**
     * Trasmette la richiesta al server
     * @param request Richiesta da trasmettere
     * @return Risposta del server 
     */
    public Message run(Message request) {
        System.out.println("client socket: running");
        Message msg = new Message("outcome", false);
        
        try {
            //Inizializzazione degli oggetti di stream
            setupStreams();
            
            //Invio dei dati al server
            System.out.println("client socket: data transfer started");
            output.writeObject(request);
            
            //Ricezione dei dati dal server
            msg = (Message) input.readObject();
        } 
        catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        
        System.out.println("client socket: data transfer completed");
        return msg;
    }
    
    /**
     * Inizializza gli stream di output e input
     * @throws IOException
     */
    private void setupStreams() throws IOException {
        //Inizializzazione dello stream di output
        output = new ObjectOutputStream(socket.getOutputStream());
        output.flush();//Pulizia dello stream di output
        
        //Inizializzazione dello stream di input
        input = new ObjectInputStream(socket.getInputStream());
        
        System.out.println("client socket: streams setup completed!");
    }
    
    //TEST - Main di prova per simulare un client
    public static void main(String[] args) {
        ClientSocketManager socket = new ClientSocketManager();
        //TEST - Oggetto ricevuto
        System.out.println(socket.run(new Message()).toString());
    }
}
