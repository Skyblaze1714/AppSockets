/*
 * Salvataggio dei quiz in un file (Se non c'è già, si crea)
 * Lettura file e caricamento in un'Array
 */
package server;

import commons.*; 
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Gunea-Lasagno-Prisecaru
 */
public class ServerStorageManager implements java.io.Serializable {
    
    private static final String dir = "/home/jcm/lolfilexd";
    private static final String est = ".txt"; //estensione file
    //private static BufferedReader in;
    
    
    //=================================================================
    /**
     * saveArrayQuiz serve per salvare l'array di oggetti Quiz
     * @param q
     * @throws IOException 
     */
    public static void saveArrayQuiz(Quiz[] q) throws IOException{
        try{
        FileOutputStream saveFile = new FileOutputStream(dir+est);
        ObjectOutputStream save = new ObjectOutputStream(saveFile);
        save.writeObject(q);
        save.close();
        
        
        }catch(Exception exc){
            exc.printStackTrace();
        }
        
    }
    //====================================================================
    /**
     * LoadArrayQuiz serve per prendere l'arrai di oggetti
     * Quiz dal file precedentemente creato
     * @param dim per sapere la dimensione del vettore di Quiz
     * @return 
     */
 public static Quiz[] loadArrayQuiz(){

        Quiz[] q = null;
        
        try{
            
            FileInputStream loadFile = new FileInputStream(dir+est);
            ObjectInputStream loadStream = new ObjectInputStream(loadFile);

            q= (Quiz[]) loadStream.readObject();

            loadStream.close();

        }catch(FileNotFoundException ex){
            return q;
        }catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        
        return q;
}
/**
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


        try {            
                //carico sul file
                
                for(int i=0; i<dim; i++){
                    arr[i] = new Quiz("descrizione "+i, "aut "+i, asd, i);
                    //saveQuiz(arr[i],i);
                }
                
                saveArrayQuiz(arr);
                
                arr2 = loadArrayQuiz();
                
                if(arr2 != null){
                    for(int i=0; i<dim; i++){
                        //arr[i] = (Quiz) loadArrayQuiz(dim,i);
                        System.out.println(arr[i].toString());
                    }
                }
                else{
                    System.out.println("Array vuoto");
                }
                

                //prendo dal file
                /*
                for(int i=0; i<dim; i++){
                    arr[i] = (Quiz) loadArrayQuiz(dim,i);
                    System.out.println(arr[i].toString());
                }*/
                
                
        } catch (Exception ex) {
            ex.printStackTrace();
        } 


        //prendo dal file
        /*
        for(int i=0; i<dim; i++){
            arr[i] = (Quiz) loadQuiz(i);
            System.out.println(arr[i].toString());
        }*/
        
    }
    
}
