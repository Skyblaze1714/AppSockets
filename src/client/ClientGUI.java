
package client;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.awt.*;



public class ClientGUI extends Frame{

    //Button invia = new Button("+");
    Button invia = new Button("      +      ");
    //TextField domanda = new TextField("");
    Label lista = new Label("Lista Domande");
    GridBagConstraints gbc = new GridBagConstraints();
    

    
    public ClientGUI(){
        this.setLayout(new GridBagLayout());
        

       add(invia, new GridBagConstraints(
                0, // gridx
                0, // gridy
                1, // gridwidth
                1, // gridheight
                1, // weightx
                1, // weighty
                GridBagConstraints.NORTHWEST, // anchor <------------
                GridBagConstraints.NONE, // fill
                new Insets(0, // inset top
                0, // inset left
                0, // inset bottom
                0), // inset right
                0, // ipadx
                0)); // ipady

add(lista, new GridBagConstraints(
                100, // gridx
                100, // gridy
                100, // gridwidth
                100, // gridheight
                100, // weightx
                100, // weighty
                GridBagConstraints.NORTHWEST, // anchor <------------
                GridBagConstraints.NONE, // fill
                new Insets(0, // inset top
                100, // inset left
                100, // inset bottom
                100), // inset right
                100, // ipadx
                100)); // ipady

        this.setTitle("TypeRace");
        this.setLocation(200, 200);
        this.setSize(400, 400);
        this.setVisible(true);
        
    }
      
     public static void main(String[] args) {
         new ClientGUI();
     }

    
}

