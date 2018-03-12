/*
 * Salvataggio dei quiz in un file (Se non c'è già, si crea)
 * Lettura file e caricamento in un'Array
 */
package server;

import commons.*;
import java.io.*;

/**
 * Per la gestione dell'array degli oggetti Quiz su di un file
 *
 * @author Gunea-Lasagno-Prisecaru
 */
public class ServerStorageManager implements java.io.Serializable {

    private static final String dir = "quizArray";
    private static final String ext = ".txt"; //estensione file

    /**
     * Salva un'array di Quiz su un file
     *
     * @param quizzes Array di Quiz da salvare
     */
    public static void saveArrayQuiz(Quiz[] quizzes) {
        try {

            //Inizializzazione dello stream di scrittura
            FileOutputStream saveFile = new FileOutputStream(dir + ext);
            ObjectOutputStream saveStream = new ObjectOutputStream(saveFile);

            //Salvataggio dell'array su file
            saveStream.writeObject(quizzes);

            //Chiusura del file
            saveStream.close();
            saveFile.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Carica un'array di Quiz da un file
     *
     * @return Array di Quiz caricato
     */
    public static Quiz[] loadArrayQuiz() {

        //Inizializzazione dell'array
        Quiz[] quizzes = new Quiz[0];

        //Caricamento del file
        try {
            //Inizializzazione dello stream di lettura
            FileInputStream loadFile = new FileInputStream(dir + ext);
            ObjectInputStream loadStream = new ObjectInputStream(loadFile);

            //Caricamento dei quiz sull'array
            quizzes = (Quiz[]) loadStream.readObject();

            //Chiusura del file
            loadStream.close();
            loadFile.close();

        } catch (FileNotFoundException ex) {
            //Restituzione di un array vuoto per la mancanza del file
            System.out.println("server storage: the file hasn't been created yet, creating a new file now");
            return quizzes;
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        //Restituzione dell'array caricato
        return quizzes;
    }

    /**
     * TEST - verifica funzionamento metodi
     *
     * @param args
     */
    public static void main(String[] args) {

        final int dim = 10;
        String[] asd = new String[2];
        asd[0] = "hi";
        asd[1] = "hello";

        Quiz[] arr = new Quiz[dim];
        Quiz[] arr2 = new Quiz[dim];

        for (int i = 0; i < dim; i++) {
            arr[i] = new Quiz("descrizione " + i, "aut " + i, asd, i);
        }

        saveArrayQuiz(arr);

        arr2 = loadArrayQuiz();

        if (arr2.length != 0) {
            for (int i = 0; i < dim; i++) {
                System.out.println(arr[i].toString());
            }
        } else {
            System.out.println("Array vuoto");
        }

    }

}
