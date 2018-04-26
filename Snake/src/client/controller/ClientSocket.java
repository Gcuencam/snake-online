package client.controller;
import client.ScoreWindow;
import client.StartGameBoard;
import client.view.Login;
import java.io.*;
import java.net.*;

public class ClientSocket {
  public ClientSocket(String host, int port) throws IOException {

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
    
    BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
    String fromServer;
    String fromUser;

    while ((fromServer = in.readLine()) != null) {
      System.out.println("Server: " + fromServer);
      if (fromServer.equals("Bye."))
        break;
        
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