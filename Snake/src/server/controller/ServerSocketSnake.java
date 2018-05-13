package server.controller;
import java.net.*;
import java.io.*;

public class ServerSocketSnake {
    public ServerSocketSnake() throws IOException {

        ServerSocket serverSocket = null;
        boolean listening = true;
        try {
            serverSocket = new ServerSocket(8000);
	    System.out.println("Socket creado.");
        } catch (IOException e) {
            System.err.println("No ha sido posible realizar la conexión en el puerto 8000.");
            System.exit(1);
        }
        
        while (listening) 
            new ServerThread(serverSocket.accept()).start();
        
        
        serverSocket.close();

    }
}