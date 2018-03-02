/*
 * Classe per la rappresentazione di quiz come oggetti
 */
package Commons;

/**
 *
 * @author Dani
 */
public class Quiz {
    //Attributi
    private String title;
    private String description;
    private final String author;
    private String[] answers;
    
    //Costruttore
    public Quiz(String title, String description, String author, String[] answers) {
        this.title = title;
        this.description = description;
        this.author = author;
        this.answers = answers;
    }
    
}
