/*
 * Classe per la generazione di messagi tra client e server
 */
package commons;

import commons.exceptions.InvalidMessageMethodException;

/**
 *
 * @author Dani
 */
public class Message {
    //Attributi
    public final String method;
    public final Object content;
    
    
    //Costruttori
    public Message() {
        this.method = "getQuiz";
        content = null;
    }
    
    public Message(int id) {
        this.method = "getQuiz";
        content = id;
    }
    
    public Message(Quiz quiz) {
        this.method = "postQuiz";
        this.content = quiz;
    }
    
    public Message(String method, Object content) throws InvalidMessageMethodException {
        switch(method){
            case "getQuiz":
            case "postQuiz":
            case "postAnswer":
            case "postScore":
                this.method = method;
                break;
            default:
                throw new InvalidMessageMethodException(method);
        }
        this.content = content;
    }
}
