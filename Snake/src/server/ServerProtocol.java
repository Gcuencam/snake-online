/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.net.*;
import java.io.*;

public class ServerProtocol {

    public String processInput(String theInput) throws IOException {

        String theOutput = null;

        switch (theInput) {
            case "UP":
                theOutput = "arriba";
                break;

            case "DOWN":
                theOutput = "abajo";
                break;

            case "LEFT":
                theOutput = "izquierda";
                break;

            case "RIGHT":
                theOutput = "derecha";
                ;
                break;

            default:
                System.out.println("No has elegido una direccion correcta");
                break;

        }
        return theOutput;
    }
}
