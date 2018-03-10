/*
 * Salvataggio dei quiz in un file (Se non c'è già, si crea)
 * Lettura file e caricamento in un'Array
 */
package server;

import commons.*; 
import java.io.*;

/**
 * @author Gunea-Lasagno-Prisecaru
 */
public class StorageManager implements java.io.Serializable {
    
    private static final String dir = "C:\\Users\\Pryze\\Documents\\0Scuola\\asdtesttest\\QuizSaveN_";
    private static final String est = ".txt"; //estensione file
    //private static BufferedReader in;
    
    

    public static void saveQuiz(Quiz q, int w) throws IOException{
        try{
        FileOutputStream saveFile = new FileOutputStream(dir+w+est);
        ObjectOutputStream save = new ObjectOutputStream(saveFile);
        
        save.writeObject(q);
        save.close();
        }catch(Exception exc){
            exc.printStackTrace();
        }
        
    }
    
    public static Quiz loadQuiz(int w){

    Quiz q = new Quiz();
        try{
        FileInputStream saveFile = new FileInputStream(dir+w+est);
        ObjectInputStream restore = new ObjectInputStream(saveFile);
        
        //Object obj = restore.readObject(); per un oggetto generico
        q = (Quiz) restore.readObject();
        //System.out.println(q.toString());
        
        restore.close();
        }catch(Exception exc){
            exc.printStackTrace();
        }
        
        return q;
    }
    
    public static void main(String[] args) throws ClassNotFoundException {

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
                    saveQuiz(arr[i],i);
                }

                //prendo dal file
                for(int i=0; i<dim; i++){
                    arr[i] = (Quiz) loadQuiz(i);
                    System.out.println(arr[i].toString());
                }
                
        } catch (IOException ex) {
            ex.printStackTrace();
        } 


}
    
    
    
    
    
    
    
    
    
}
