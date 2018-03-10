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
    
    private String question;
    private final String author;
    
    private String[] answers;
    private int correctAnswer;
    
    //Costruttore
    /**
     * Costruisce un oggetto della classe Quiz
     * @param title Titolo
     * @param question Descrizione
     * @param author Autore
     * @param answers Risposte
     * @param correctAnswer Risposta corretta
     */
    public Quiz(String question, String author, String[] answers, int correctAnswer) {
        this.question = question;
        this.author = author;
        this.answers = (answers == null)? null : answers.clone();
        this.correctAnswer =  correctAnswer;
    }
    //prova
        public Quiz(String question, String author) {
        this.question = question;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
    
    //TEST - costruttore di prova
    public Quiz(){
        author = "abs";
    }
    
    
    //Metodi
    public String getDescription() {
        return question;
    }

    public void setDescription(String description) {
        this.question = description;
    }

    public String[] getAnswers() {
        return answers.clone();
    }

    public void setAnswers(String[] answers) {
        this.answers = (answers == null)? null : answers.clone();
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    @Override
    public String toString() {
        return "Quiz{" + "description=" + question + ", author=" + author + ", answers=" + answers + ", correctAnswer=" + correctAnswer + '}';
    }
    
}
