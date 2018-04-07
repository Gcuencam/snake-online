/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.net.*;
import java.io.*;
/**
 *
 * @author gabrielcuenca
 */
public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(8000);
	    System.out.println("Server socket created on port 8000.");
        } catch (IOException e) {
            System.err.println("Could not listen on port: 8000.");
            System.exit(1);
        }

        Socket clientSocket = null;
        try {
            clientSocket = serverSocket.accept();
	    System.out.println("Client accepted.");
        } catch (IOException e) {
            System.err.println("Accept failed.");
            System.exit(1);
        }

        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(
				new InputStreamReader(
				clientSocket.getInputStream()));
        String inputLine, outputLine;
        ServerProtocol sp = new ServerProtocol();

        outputLine = sp.processInput(null);
        out.println(outputLine);

        while ((inputLine = in.readLine()) != null) {
             outputLine = sp.processInput(inputLine);
             out.println(outputLine);
             if (outputLine.equals("Bye."))
                break;
        }
        out.close();
        in.close();
        clientSocket.close();
        serverSocket.close();
    }
}