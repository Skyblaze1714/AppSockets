/*
 * Classe per la rappresentazione di quiz come oggetti
 */
package commons;

import java.io.Serializable;

/**
 *
 * @author Gunea-Lasagno-Prisecaru
 */
public class Quiz implements Serializable {
    
    //Attributi
    private String title;
    private String description;
    private final String author;
    
    private String[] answers;
    private int correctAnswer;
    
    //Costruttore
    /**
     * Costruisce un oggetto della classe Quiz
     * @param title Titolo
     * @param description Descrizione
     * @param author Autore
     * @param answers Risposte
     * @param correctAnswer Risposta corretta
     */
    public Quiz(String title, String description, String author, String[] answers, int correctAnswer) {
        this.title = title;
        this.description = description;
        this.author = author;
        this.answers = answers.clone();
        this.correctAnswer =  correctAnswer;
    }
    
    //TEST - costruttore di prova
    public Quiz(){
        author = "abs";
    }
    
    
    //Metodi
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
        return answers.clone();
    }

    public void setAnswers(String[] answers) {
        this.answers = answers.clone();
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    @Override
    public String toString() {
        return "Quiz{" + " title=" + title + ", description=" + description + ", author=" + author + ", answers=" + answers + ", correctAnswer=" + correctAnswer + '}';
    }
    
}
