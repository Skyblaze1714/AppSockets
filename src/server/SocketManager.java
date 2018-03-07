/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.net.*;
import java.io.*;

import commons.*;
import commons.exceptions.InvalidMessageMethodException;

/**
 *
 * @author Gunea-Lasagno-Prisecaru
 */
public class SocketManager {

    //Attributi
    //Porta
    private int port;
    
    //Oggetti per lo stream
    private ObjectOutputStream output;
    private ObjectInputStream input;

    //Oggetti per il socket
    private ServerSocket server;
    private Socket client;

    //Costruttore
    public SocketManager(int port) throws InvalidMessageMethodException {

        this.port = port;
        start();
        run();

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

    private void run() throws InvalidMessageMethodException {

        while (true) {

            try {

                waitForConnections();
                setupStreams();
                Message request = (Message) input.readObject();

                Message response;
                switch (request.method) {
                    case "getQuiz":
                        response = new Message(new Quiz());
                        break;
                    case "postQuiz":
                        response = new Message("outcome", true);
                        break;
                    default:
                        response = new Message("outcome", false);
                        break;
                }

                output.writeObject(response);

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
    
    
    public static void main(String[] args) throws InvalidMessageMethodException{
        new SocketManager(1234);
    }

}
