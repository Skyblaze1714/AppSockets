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

/**
 *
 * @author Pryze
 */
public class ClientSocket implements Runnable{
    
    //Attributi
    //Porta
    private int port;
    
    //Oggetti per lo stream
    private ObjectOutputStream output;
    private ObjectInputStream input;
    
    //Socket
    private Socket clientSocket;
    
    
    //Costruttore
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
        System.out.println("Client socket: running");
        
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
        new ClientSocket(1234);
    }
}
