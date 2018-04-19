/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import client.view.Login;

/**
 *
 * @author gabrielcuenca
 */
public class Client {

    /* For main.Snake executation. */
    public static void main(String[] args) {
        Login login = new Login();
        login.setVisible(true);
    }

    /* For only client executation. */
    public Client() {
        Login login = new Login();
        login.setVisible(true);
    }
}
