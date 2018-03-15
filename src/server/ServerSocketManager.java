/*
 * Classe per la gestione delle richieste al server
 */
package server;

import java.net.*;
import java.io.*;

import commons.*;

/**
 *
 * @author Gunea-Lasagno-Prisecaru
 */
public class ServerSocketManager {

    //Attributi
    //Porta
    private int port;

    //Oggetti per lo stream
    private ObjectOutputStream output;
    private ObjectInputStream input;

    //Oggetti per il socket
    private ServerSocket server;
    private Socket client;

    
    //Costruttori
    /**
     * Costruisce un oggetto della classe ServerSocketManager
     *
     * @param port Porta da utilizzare per la trasmissione
     */
    public ServerSocketManager(int port) {
        this.port = port;
        start();    //Inizializzazione del server socket
        //run();      //Avvio del server socket
    }

    /**
     * Costruisce un oggetto della classe ServerSocketManager con una porta di
     * default (1234)
     */
    public ServerSocketManager() {
        this.port = 1234;
        start();    //Inizializzazione del server socket
        //run();      //Avvio del server socket
    }

    
    //Metodi
    /**
     * Inizializza il socket del server e restituisce true se l'esito è
     * positivo, o false se negativo
     *
     * @return Esito dell'operazione
     */
    private boolean start() {
        //Inizializza il ServerSocket
        try {
            server = new ServerSocket(port);
        } catch (IOException ex) {
            ex.printStackTrace();
            return false;
        }

        System.out.println("Server created with success!");
        return true;
    }

    /**
     * Aspetta la connessione di un socket e restituisce la sua richiesta
     *
     * @return Recieved request
     */
    public Message waitForRequest() {
        Message request = null;

        try {

            //Preparazione alla trasmissione
            waitForConnections();   //Attesa di una connessione
            setupStreams();         //Inizializzazione degli stream

            //Ricezione dei dati dal client
            request = (Message) input.readObject();

        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        return request;
    }

    /**
     * Risponde al socket che ha iniziato la connesione
     *
     * @param response Riposta da inviare
     */
    public void sendResponse(Message response) {
        try {

            //Invio risposta al client
            output.writeObject(response);

            System.out.println("server socket: connection closed!");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Attende la connesione di qualcuno al server e poi inizializza il socket
     * del client
     *
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
     *
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
    
}
