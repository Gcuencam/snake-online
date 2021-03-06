package client.controller;

import client.view.ScoreWindow;
import client.view.GameWindow;
import client.model.Player;
import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClientSocket extends Thread {

    private String host;
    private int port;
    private String username;
    private Player player;

    public void run() {
        try {
            this.initSocket();
        } catch (IOException ex) {
            Logger.getLogger(ClientSocket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ClientSocket(String host, int port, String username) throws IOException {
        this.host = host;
        this.port = port;
        this.username = username;
    }

    public void initSocket() throws IOException {
        Socket kkSocket = null;
        PrintWriter out = null;
        BufferedReader in = null;

        try {
            kkSocket = new Socket(host, port);

            out = new PrintWriter(kkSocket.getOutputStream(), true);

            in = new BufferedReader(new InputStreamReader(kkSocket.getInputStream()));

        } catch (UnknownHostException e) {
            System.err.println("Don't know about host: " + host);
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection to: " + host);
            System.exit(1);
        }

        player = Player.createSingletonInstance(username);
        ScoreWindow sw = new ScoreWindow();
        GameWindow gb = new GameWindow();
        gb.setResizable(false);
        gb.setVisible(true);
        player.addObserver(sw);

        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
        String fromServer;
        String fromUser;

        while ((fromServer = in.readLine()) != null) {
            if (fromServer.equals("Bye.")) {
                break;
            }

            fromUser = stdIn.readLine();
            if (fromUser != null) {
                out.println(fromUser);
            }
        }

        out.close();
        in.close();
        stdIn.close();
        kkSocket.close();
    }
}
