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
    
    private static final String dir = "C:\\Users\\Pryze\\Documents\\0Scuola\\asdtesttest\\MyObjects.txt";
    private static BufferedReader in;
    
    

    public static void saveQuiz(Quiz q) throws IOException{
        try{
        FileOutputStream saveFile = new FileOutputStream(dir);
        ObjectOutputStream save = ObjectOutputStream(saveFile);
        
        save.writeObject(q);
        save.close();
        }catch(Exception exc){
            exc.printStackTrace();
        }
        
    }
    
    public static Quiz loadQuiz (int i) throws IOException, ClassNotFoundException{

        try{
        FileInputStream saveFile = new FileInputStream(dir);
        ObjectInputStream restore = ObjectInputStream(saveFile);
        
        //Object obj = restore.readObject(); per un oggetto generico
        Quiz asd = (Quiz) restore.readObject();
        restore.close();
        }catch(Exception exc){
            exc.printStackTrace();
        }
        return null;
        
    }
    
    public static void main(String[] args) throws ClassNotFoundException {


                
        final int dim = 10;
        String[] asd = new String[2];
        asd[0] = "hi";
        asd[1] = "hello";
                
        Quiz[] arr = new Quiz[dim];



        try {
                //FileOutputStream f = new FileOutputStream(new File("myObjects.txt"));
                //ObjectOutputStream o = new ObjectOutputStream(f);


                for(int i=0; i<dim; i++){
                    arr[i] = new Quiz("descrizione "+i, "aut "+i, asd, i);
                    saveQuiz(arr[i]);
                }

                // Write objects to file
                /*
                o.writeObject(quiz1);
                o.writeObject(quiz2);
                */


                //o.close();
                //f.close();

                //FileInputStream fi = new FileInputStream(new File("myObjects.txt"));
                //ObjectInputStream oi = new ObjectInputStream(fi);

                // Read objects
                /*
                Quiz pr1 = (Quiz) oi.readObject();
                Quiz pr2 = (Quiz) oi.readObject();
                */

                in = new BufferedReader(new FileReader(dir));
                        
                for(int i=0; i<dim; i++){
                    //Quiz pr1 = (Quiz) oi.readObject();
                    //System.out.println(pr1.toString());
                    loadQuiz(i);
                }
                /*
                System.out.println(pr1.toString());
                System.out.println(pr1.toString());
                System.out.println(pr2.toString());0
                */


                //oi.close();
                //fi.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        } 


}
    
    
    
    
    
    
    
    
    
}
