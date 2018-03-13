/*
 * Classe per la rappresentazione dei quiz come oggetti
 */
package commons;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Gunea-Lasagno-Prisecaru
 */
public class Quiz implements Serializable {

    //Attributi
    private String question;
    private final String author;
    private String[] answers;
    private int correctAnswer;

    
    //Costruttore
    /**
     * Costruisce un oggetto della classe Quiz
     *
     * @param question Domanda del quiz
     * @param author Autore del quiz
     * @param answers Risposte del quiz
     * @param correctAnswer Risposta corretta del quiz
     */
    public Quiz(String question, String author, String[] answers, int correctAnswer) {
        this.question = question;
        this.author = author;
        this.answers = (answers == null) ? null : answers.clone();
        this.correctAnswer = correctAnswer;
    }

    
    //Getters e setters
    /**
     * Restituisce l'autore del quiz
     *
     * @return Autore del quiz
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Restituisce la domanda del quiz
     *
     * @return Domanda del quiz
     */
    public String getQuestion() {
        return question;
    }

    /**
     * Sostituisce la domanda del quiz
     *
     * @param question Nuova domanda del quiz
     */
    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     * Restituisce le risposte del quiz
     *
     * @return Array con le risposte del quiz
     */
    public String[] getAnswers() {
        return answers.clone();
    }

    /**
     * Sostituisce le risposte del quiz
     *
     * @param answers Array con le nuove risposte del quiz
     */
    public void setAnswers(String[] answers) {
        this.answers = (answers == null) ? new String[0] : answers.clone();
    }

    /**
     * Restituisce la risposta corretta
     *
     * @return Indice della risposta corretta 1
     */
    public int getCorrectAnswer() {
        return correctAnswer;
    }

    /**
     * Sostituisce la risposta corretta
     *
     * @param correctAnswer Indice della nuova risposta corretta 1
     */
    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    
    //Metodi
    /**
     * Restituisce una stringa contenente i dettagli riguardanti l'oggetto
     *
     * @return Stringa contenente le informazioni dell'oggetto
     */
    @Override
    public String toString() {
        return "Quiz{" + "description=" + question + ", author=" + author + ", answers=" + answers + ", correctAnswer=" + correctAnswer + '}';
    }

    /**
     * Confronta due quiz
     *
     * @param obj Quiz da confrontare
     * @return true se i quiz sono uguali, altrimenti false
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        final Quiz other = (Quiz) obj;

        if (!Objects.equals(this.question, other.question)) {
            return false;
        }
        if (!Objects.equals(this.author, other.author)) {
            return false;
        }
        if (!Arrays.deepEquals(this.answers, other.answers)) {
            return false;
        }

        return true;
    }

}
