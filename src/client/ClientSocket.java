/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.net.*;
import java.io.*;
import commons.*;
import server.SocketManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pryze
 */
public class ClientSocket implements Runnable{
    //String title, String Description, String uthor,
    //String[] answers, int corrcetAnswer;
    
    
    private int port;
    
    private ObjectOutputStream output;
    private ObjectInputStream input;
    
    private Socket clientSocket;
    
    ClientSocket (int port){
        this.port = port;
        try {
            clientSocket = new Socket("localhost", 1234);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    
      public void run() {
            
            try {
                setupStreams();
                output.writeObject(new Message());
                try {
                    Message msg = (Message) input.readObject();
                    System.out.println(msg.toString());
                } 
                catch (ClassNotFoundException ex) {
                    Logger.getLogger(ClientSocket.class.getName()).log(Level.SEVERE, null, ex);
                }   
            } 
            catch (IOException ex) {
                
                ex.printStackTrace();
                
            }
            
        
    }
      
          
          
    private void setupStreams() throws IOException {
        
        output = new ObjectOutputStream(clientSocket.getOutputStream());
        output.flush();//nel caso in cui si perdono byte si pulisce
        input = new ObjectInputStream(clientSocket.getInputStream());
        System.out.println("Streams setup completed!");
        
    }
    
    
    
    public static void main(){
        new SocketManager(1234);
        new ClientSocket(1234);
    }
}
