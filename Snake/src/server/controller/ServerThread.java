/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.controller;

import java.net.*;
import java.io.*;
import server.ServerProtocol;

public class ServerThread extends Thread {

    private Socket socket = null;

    public ServerThread(Socket socket) {
        super("ServerThread");
        this.socket = socket;
    }

    public void run() {
        try {
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println("Te has conectado correctamente puto cliente.");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                            socket.getInputStream()));

            String inputLine = in.readLine();
            ServerProtocol kp = new ServerProtocol();
            String outputLine = kp.processInput(inputLine);
            out.println(outputLine);

            while ((inputLine = in.readLine()) != null) {
                outputLine = kp.processInput(inputLine);
                out.println(outputLine);
                if (outputLine.equals("Bye")) {
                    break;
                }
            }
            out.close();
            in.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
