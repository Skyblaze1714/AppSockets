/*
 * Eccezione per aver inserito un metodo del messaggio non valido
 */
package commons.exceptions;

/**
 *
 * @author daniele.lasagno
 */
public class InvalidMessageMethodException extends Exception {
    //Costruttori
    public InvalidMessageMethodException() {
        super("The choosen message method is invalid, watch the valid types on Message javadoc");
    }
    
    public InvalidMessageMethodException(String invalidMethod) {
        super(invalidMethod + " is not a valid message method, watch the valid types on Message javadoc");
    }
}
