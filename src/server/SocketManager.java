/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.net.*;
import java.io.*;
import commons.*;

/**
 *
 * @author Gunea-Lasagno-Prisecaru
 */
public class SocketManager {
    
    //Attributi
    private int port;
    
    private ObjectOutputStream output;
    private ObjectInputStream input;
    
    private ServerSocket server;
    private Socket client;
    
    
    //Costruttore
    public SocketManager(int port) {
        
        this.port = port;
        start();
        
    }
    
    
    //Metodi
    private boolean start() {
        
        try {
            
            server = new ServerSocket(port);
            
        } catch (IOException ex) {
            
            ex.printStackTrace();
            return false;
            
        }
        
        System.out.println("Server created with success!");
        return true;
        
    } 
    
    private void run(){
        
        while (true) {
            
            try {
                
                waitForConnections();
                setupStreams();
                Message msg = (Message) input.readObject();
                
                
            } catch (IOException | ClassNotFoundException ex) {
                
                ex.printStackTrace();
                
            }
            
        }
        
    }
    
    private void waitForConnections() throws IOException {
        
        System.out.println("Waiting for someone to connect...");
        client = server.accept();
        System.out.println("Connected!");
        
    }
    
    private void setupStreams() throws IOException {
        
        output = new ObjectOutputStream(client.getOutputStream());
        output.flush();
        input = new ObjectInputStream(client.getInputStream());
        System.out.println("Streams setup completed!");
        
    }
    
}
