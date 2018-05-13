/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.IOException;
import server.controller.ServerSocketSnake;

/**
 *
 * @author gabrielcuenca
 */
public class Server {

    /* For main.Snake executation. */
    public static void main(String[] args) throws IOException {
        createServerSocket();
    }

    /* For only server executation. */
    public Server() throws IOException {
        createServerSocket();
    }

    private static void createServerSocket() throws IOException {
        ServerSocketSnake ss = new ServerSocketSnake();
    }

}
