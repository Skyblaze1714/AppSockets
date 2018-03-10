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
        
        //FileOutputStream f = new FileOutputStream(new File("myObjects.txt"));
        //ObjectOutputStream o = new ObjectOutputStream(f);
        
        //o.writeObject( q );
        //o.write(Paths.get("myObjects.txt"),(q.toString()).getBytes(), StandardOpenOption.APPEND);
        
        //o.close();
	//f.close();
        
        /* Lasa
        try(FileWriter fw = new FileWriter(dir, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw)) 
        {
            out.println(q);
            out.close();
        }catch(IOException e){
            System.out.println("Error initializing stream");
        }
        */
        
        //Terzo tentativo
                
        FileOutputStream fout = null;
        ObjectOutputStream oos = null;
        
        try{
        fout = new FileOutputStream(dir);
        oos = new ObjectOutputStream(fout);
        
        oos.writeObject(q.getDescription() );
        oos.writeObject(q.getAuthor() );
        //oos.writeObject(q.getCorrectAnswer() );
        //os.writeObject(q.getAnswers() );
        
        
        }catch (Exception ex) {
            ex.printStackTrace();
        } finally{
            //non so a cosa serva questo
            if (fout != null || oos != null){
                try{
                    oos.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        
        }
        
        
    }
    
    public static Quiz loadQuiz (int i) throws IOException, ClassNotFoundException{
        
        //FileInputStream fi = new FileInputStream(new File("C:\Users\Pryze\Documents\0Scuola\asdtesttest\MyObjexts.txt"));
        //ObjectInputStream oi = new ObjectInputStream(fi);
        
        //Quiz pr1 = (Quiz) oi.readObject();
        //System.out.println(pr1.toString());
        
        //fi.close();
        //oi.close();
        
        
        
        //String line = in.readLine();
        //System.out.println(line);
        //in.skip(line.length());
        
        //Terza prova
        
        FileInputStream fin = null;
        ObjectInputStream ios = null;

        fin = new FileInputStream(dir);
        ios = new ObjectInputStream(fin);
        
        
        //ios.readObject();
        //Quarta prova
        String titolo = (String) ios.readObject();
        String descrizione = (String) ios.readObject();
        String autore = (String) ios.readObject();
        //String[] risposte = (String[]) ios.readObject();
        //int risposteCorrette = (int) ios.readObject();
        
        //Quiz asd = new Quiz(titolo, descrizione, autore, risposte, risposteCorrette);
        Quiz asd = new Quiz(descrizione, autore);
        
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
