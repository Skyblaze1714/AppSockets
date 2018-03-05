/*
 * Classe per la generazione di messagi tra client e server
 */
package commons;

import commons.exceptions.InvalidMessageMethodException;

/**
 *
 * @author Gunea-Lasagno-Prisecaru
 */
public class Message {
    
    //Attributi
    public final String method;
    public final Object content;
    
    
    //Costruttori
    /**
     * Constructor of Message class that has getQuiz as default method
     */
    public Message() {
        this.method = "getQuiz";
        content = null;
    }
    
    /**
     * Constructor of Message class that has getQuiz as default method and get the quiz with the requested id
     * @param id Id of the searched quiz
     */
    public Message(int id) {
        this.method = "getQuiz";
        content = id;
    }
    
    /**
     * Constructor of Message class that has postQuiz as default method
     * @param quiz Quiz to post
     */
    public Message(Quiz quiz) {
        this.method = "postQuiz";
        this.content = quiz;
    }
    
    /**
     * Constructor of Message class that has postQuiz as default method
     * @param quizzes Quiz to post
     */
    public Message(Quiz[] quizzes) {
        this.method = "postQuiz";
        this.content = quizzes;
    }
    
    /**
     * Constructor of Message class
     * @param method The message method, it can only be one of the following values: getQuiz, postQuiz, outcome
     * @param content The content of the message
     * @throws InvalidMessageMethodException
     */
    public Message(String method, Object content) throws InvalidMessageMethodException {
        switch(method){
            case "getQuiz":
            case "postQuiz":
            case "outcome":
                this.method = method;
                break;
            default:
                throw new InvalidMessageMethodException(method);
        }
        this.content = content;
    }
    
}
