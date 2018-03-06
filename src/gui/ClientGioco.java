
package gui;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.awt.*;


public class ClientGioco extends Frame{

    Button invia = new Button("Invia");
    TextField domanda = new TextField("");
    Label benvenuto = new Label("Domanda");
    
    public ClientGioco(){
        this.setLayout(null);
        
        this.add(invia);
        invia.setBounds(220,20,90,30);
        
        this.add(domanda);
        domanda.setBounds(20,20,200,80);
        
        this.add(benvenuto);
        benvenuto.setBounds(10,10,100,10);

        
        this.setTitle("TypeRace");
        this.setLocation(200, 200);
        this.setSize(400, 200);
        this.setVisible(true);
        
    }
      
    
    /*public static void main(String[] args) {
        new ClientGioco();
    }*/
    
}

