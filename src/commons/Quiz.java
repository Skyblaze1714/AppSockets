/*
 * Classe per la rappresentazione di quiz come oggetti
 */
package commons;

/**
 *
 * @author Gunea-Lasagno-Prisecaru
 */
public class Quiz {
    
    //Attributi
    private String title;
    private String description;
    private final String author;
    private String[] answers;
    private Object correctAnswers;
    
    //Costruttore
    public Quiz(String title, String description, String author, String[] answers, int correctAnswer) {
        this.title = title;
        this.description = description;
        this.author = author;
        this.answers = answers;
        this.correctAnswers =  correctAnswer;
    }
    
    public Quiz(String title, String description, String author, String[] answers, int[] correctAnswers) {
        this.title = title;
        this.description = description;
        this.author = author;
        this.answers = answers;
        this.correctAnswers = correctAnswers.clone();
    }
    
}
