/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.controller;

import java.net.*;
import java.io.*;
import server.controller.ServerThread;

/**
 *
 * @author gabrielcuenca
 */
public class ServerSocketSnake {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = null;
        boolean listening = true;

        try {
            serverSocket = new ServerSocket(8000);
        } catch (IOException e) {
            System.err.println("Could not listen on port: 8000.");
            System.exit(-1);
        }

        while (listening)
          new ServerThread(serverSocket.accept()).start();

        serverSocket.close();
    }
}
