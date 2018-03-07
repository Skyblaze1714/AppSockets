/*
 * Salvataggio dei quiz in un file (Se non c'è già, si crea)
 * Lettura file e caricamento in un'Array
 * 
 */
package server;

import commons.*; 

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author Gunea-Lasagno-Prisecaru
 */
public class StorageManager {
    
    
    
    
    public static void main(String[] args) {

        
        String[] asd = new String[2];
        asd[0] = "hi";
        asd[1] = "hello";
        
		Quiz quiz1 = new Quiz("Titolo 1 ", "descrizione 1 ", "asdasd", asd, 2);
		Quiz quiz2 = new Quiz("Titolo 2 ", "descrizione 2 ", "Female", asd, 4);

		try {
			FileOutputStream f = new FileOutputStream(new File("C:\\Users\\Pryze\\Desktop\\aseprite\\myObjects.txt"));
			ObjectOutputStream o = new ObjectOutputStream(f);

			// Write objects to file
			o.writeObject(quiz1);
			o.writeObject(quiz2);

			o.close();
			f.close();

			FileInputStream fi = new FileInputStream(new File("myObjects.txt"));
			ObjectInputStream oi = new ObjectInputStream(fi);

			// Read objects
			Quiz pr1 = (Quiz) oi.readObject();
			Quiz pr2 = (Quiz) oi.readObject();

			System.out.println(pr1.toString());
			System.out.println(pr2.toString());

			oi.close();
			fi.close();

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Error initializing stream");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
    
    
    
    
    
    
    
    
    
}
