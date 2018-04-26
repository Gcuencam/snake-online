package server.controller;
import java.net.*;
import java.io.*;

public class ServerSocketSnake {
    public ServerSocketSnake() throws IOException {

        ServerSocket serverSocket = null;
        boolean listening = true;
        try {
            serverSocket = new ServerSocket(8000);
	    System.out.println("estoy después de crear el socket");
        } catch (IOException e) {
            System.err.println("Could not listen on port: 4444.");
            System.exit(1);
        }
        
        while (listening) 
            new ServerThread(serverSocket.accept()).start();
        
        
        serverSocket.close();

    }
}