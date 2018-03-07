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
    private int id;
    private String title;
    private String description;
    private final String author;
    private String[] answers;
    private int correctAnswer;
    
    //Costruttore
    public Quiz(String title, String description, String author, String[] answers, int correctAnswer) {
        this.title = title;
        this.description = description;
        this.author = author;
        this.answers = answers;
        this.correctAnswer =  correctAnswer;
    }
    
    //Test
    public Quiz(){
        author = "abs";
    }
    
    
    //Metodi
    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getAnswers() {
        return answers;
    }

    public void setAnswers(String[] answers) {
        this.answers = answers;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
    
}
