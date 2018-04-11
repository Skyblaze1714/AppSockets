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
public class ServerStorageManager{

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
            try {
                quizzes = (Quiz[]) loadStream.readObject();
            } catch(InvalidClassException ex){
                System.out.println("server storage: ivalid class of the quiz array, loading an empty array");
            }
            

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

}
