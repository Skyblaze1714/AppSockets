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
    private static Quiz[] quizzes;
    private static ServerSocketManager socket;
    
    //Metodi
    private static void init(){
        quizzes = ServerStorageManager.loadArrayQuiz();
        socket = new ServerSocketManager();
    }
    
    private static Message elaborateRequest(Message request){
        Message response;
            
        switch (request.method) {
            case "getQuiz":
                System.out.println("server socket: sending quizzes to the client");
                response = new Message(quizzes.clone());
                break;
                
            case "postQuiz":
                System.out.println("server socket: recivied a quiz = " + request.content.toString());
                quizzes.clone();
                response = new Message("outcome", true);
                break;
                
            default:
                System.out.println("server socket: failed to elaborate request");
                response = new Message("outcome", false);
                break;
        }
        
        return response;
    }
    
    private void addQuiz(Quiz quiz){
        //Inizializzazione del nuovo array
        Quiz[] newQuizzes = new Quiz[quizzes.length + 1];
        
        //Copia del vecchio arry in quello nuovo
        for(int i = 0; i quizzes.length; i++){
            
        }
    }
    
    
    //Main
    public static void main(String[] args) {
        //Inizializzazione del server
        init();
        
        //TEST
        Quiz[] quizzes1 = {
            new Quiz("domanda", "autore", null, 1),
            new Quiz("domanda","autore", null, 1),
            new Quiz("domanda", "autore", null, 1)
        };
        quizzes = quizzes1;
        
        //Ciclo per la ricezione delle richiesquizzes1te al server
        while(true) {
            Message request = socket.waitForRequest();
            
            Message response = elaborateRequest(request);
            
            socket.sendResponse(response);
        }
    }
    
}
