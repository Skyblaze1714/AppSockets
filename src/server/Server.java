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
    private ServerSocketManager socket;
    
    //Dati
    private Quiz[] quizzes;
    
    
    //Costruttore
    public Server() {
        quizzes = ServerStorageManager.loadArrayQuiz();
        socket = new ServerSocketManager();
    }
    
    
    //Metodi
    
    
    //Main
    public static void main(String[] args) {
        //Inizializzazione del server
        Server server = new Server();
    }
    
}
