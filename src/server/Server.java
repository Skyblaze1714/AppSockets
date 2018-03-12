/*
 * Classe per la messa in funzione e la gestione del server
 */
package server;

import commons.*;
import java.util.ArrayList;

/**
 *
 * @author Gunea-Lasagno-Prisecaru
 */
public class Server {

    //Attributi
    private static Quiz[] quizzes;
    private static ServerSocketManager socket;

    //Metodi
    /**
     * Inizializza il server
     */
    private static void init() {
        quizzes = ServerStorageManager.loadArrayQuiz();
        socket = new ServerSocketManager();
    }

    /**
     * Elabora il messaggio di richiesta e genera un messaggio di risposta
     *
     * @param request Messaggio contenente la richiesta
     * @return Messaggio contenente la risposta
     */
    private static Message elaborateRequest(Message request) {
        //Inizializzazione del messaggio risposta
        Message response;

        //Scelta della risposta
        switch (request.method) {
            //Invio dei quiz al client
            case "getQuiz":
                System.out.println("server socket: sending quizzes to the client");
                response = new Message(quizzes.clone());
                break;

            //Aggiunta di un quiz all'array del server
            case "postQuiz":
                //Aggiunta di un quiz solo se tale
                if (request.content instanceof Quiz) {
                    System.out.println("server socket: received a quiz = " + request.content.toString());
                    addQuiz((Quiz) request.content);
                    ServerStorageManager.saveArrayQuiz(quizzes);
                    response = new Message("outcome", true);
                } //Se il contenuto del messaggio di richiesta non è un quiz allora la risposta è un'esito negativo
                else {
                    System.out.println("server socket: received wrong content");
                    response = new Message("outcome", false);
                }
                break;

            default:
                System.out.println("server socket: failed to elaborate request");
                response = new Message("outcome", false);
                break;
        }

        //Restituzione della risposta
        return response;
    }

    /**
     * Aggiunge un quiz all'array
     *
     * @param quiz Quiz da aggiungere all'array
     */
    private static void addQuiz(Quiz quiz) {
        //Inizializzazione del nuovo array
        Quiz[] newQuizzes = new Quiz[quizzes.length + 1];

        //Copia del vecchio arry in quello nuovo
        for (int i = 0; i < quizzes.length; i++) {
            newQuizzes[i] = quizzes[i];
        }
        //Aggiunta del nuovo quiz
        newQuizzes[quizzes.length] = quiz;

        //Riscrittura dell'array con quello nuovo
        quizzes = newQuizzes;
    }

    //Main
    public static void main(String[] args) {
        /*/TEST
        Quiz[] quizzes1 = {
            new Quiz("domanda", "autore", null, 1),
            new Quiz("domanda","autore", null, 1),
            new Quiz("domanda", "autore", null, 1)
        };
        ServerStorageManager.saveArrayQuiz(quizzes1);*/

        //Inizializzazione del server
        init();

        /*/TEST
        if (quizzes.length != 0) {
            for (int i = 0; i < quizzes.length; i++) {
                System.out.println(quizzes[i].toString());
            }
        } else {
            System.out.println("Array vuoto");
        }*/
        //Ciclo per la ricezione delle richiesquizzes1te al server
        while (true) {
            Message request = socket.waitForRequest();

            Message response = elaborateRequest(request);

            socket.sendResponse(response);
        }
    }

}
