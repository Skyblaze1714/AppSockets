/*
    In questa classe viene gestito il Client
 */
package client;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.awt.*;


public class Client_GUI extends Frame{

    Button gioca = new Button("gioca");
    TextField nome = new TextField("inserisce il tuo nome");
    Gest EU = new Gest();
    Label benvenuto = new Label("benvenuto");
    
    public Client_GUI(){
        this.setLayout(null);
        
        this.add(gioca);
        gioca.setBounds(220,20,90,30);
        gioca.addActionListener(EU);
        
        this.add(nome);
        nome.setBounds(20,20,200,80);
        
        this.add(benvenuto);
        benvenuto.setBounds(10,10,100,10);

        
        this.setTitle("TypeRace");
        this.setLocation(200, 200);
        this.setSize(400, 200);
        this.setVisible(true);
        
    }
    
class Gest implements ActionListener{
    
    public void actionPerformed(ActionEvent E) {
    
    }
}
    
    
    public static void main(String[] args) {
        new Client_GUI();
    }
    
}

    

