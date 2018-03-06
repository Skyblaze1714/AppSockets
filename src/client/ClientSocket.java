/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.net.*;
import java.io.*;

import commons.*;
import commons.exceptions.InvalidMessageMethodException;
import server.SocketManager;

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
        run();
    }
    
    
      public void run() {
            System.out.println("t1");
            try {
                setupStreams();
                System.out.println("t4");
                output.writeObject(new Message());
                System.out.println("t5");
                try {
                    Message msg = (Message) input.readObject();
                    System.out.println("t6");
                    System.out.println(msg.toString());
                } 
                catch (ClassNotFoundException ex) {
                    ex.printStackTrace();
                }   
            } 
            catch (IOException ex) {
                
                ex.printStackTrace();
                
            }
            
        
    }
      
          
          
    private void setupStreams() throws IOException {
        System.out.println("t2");
        output = new ObjectOutputStream(clientSocket.getOutputStream());
        output.flush();//nel caso in cui si perdono byte si pulisce
        System.out.println("t3");
        input = new ObjectInputStream(clientSocket.getInputStream());
        System.out.println("Streams setup completed!");
        
    }
    
    
    
    public static void main(String[] args) throws InvalidMessageMethodException{
        //new SocketManager(1234);
        new ClientSocket(1234);
    }
}
