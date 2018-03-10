/*
 * Classe per la messa in funzione e la gestione del server
 */
package server;

import commons.*;

/**
 *
 * @author Gunea-Lasagno-Prisecaru
 */
public class Server {
    
    //Attributi
    //Manager
    private ServerSocketManager serverSocket;
    private ServerStorageManager storage;
    
    //Dati
    private Quiz[] quizzes;
    
    
    //Costruttore
    public Server() {
        serverSocket = new ServerSocketManager();
    }
    
    
    //Metodi
    
    
    //Main
    public static void main(String[] args) {
        //Inizializzazione del server
        Server server = new Server();
    }
    
}
