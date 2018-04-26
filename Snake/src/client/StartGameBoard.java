package client;

import javax.swing.JFrame;
import client.view.GameBoard;

public class StartGameBoard {

    public static void main(String[] args) {

        //Creando nuevo juego
        GameBoard gameBoard = new GameBoard();
        
        //Configurando Ventana del Juego
        gameBoard.setTitle("Snake Game");
        gameBoard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        gameBoard.setBounds(350, 100, 500, 500);
        gameBoard.setResizable(false);
        gameBoard.setVisible(true);

    }
}

        