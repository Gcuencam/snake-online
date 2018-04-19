/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import client.controller.ClientSocket;
import client.view.Login;
import java.io.IOException;

/**
 *
 * @author gabrielcuenca
 */
public class Client {

    /* For main.Snake executation. */
    public static void main(String[] args) throws IOException {
        Login login = new Login();
        login.setVisible(true);
        createClientSocket();
    }

    /* For only client executation. */
    public Client() throws IOException {
        Login login = new Login();
        login.setVisible(true);
        createClientSocket();
    }
    
    private static void createClientSocket() throws IOException {
        /* Debe inicializarse cuando el usuario pulse start, 
           con los datos que el usuario haya metido.
        */
        ClientSocket cs = new ClientSocket();
    }
}
