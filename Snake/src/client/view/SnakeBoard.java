package client.view;

import client.model.Cell;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;

// Snake Board composed of a grid of JPanels
public class SnakeBoard extends JPanel {

    public static ArrayList<ArrayList<Cell>> board;
    public static ArrayList<Cell> boardColumn;
    public static int rows = 20;
    public static int cols = 20;
    public static int white = 2;

    public SnakeBoard() {
        this.setLayout(new BorderLayout());

        //Create snake board, the game board itself
        JPanel snakeBoard = new JPanel();
        snakeBoard.setLayout(new GridLayout(rows, cols));
        board = new ArrayList<ArrayList<Cell>>();

        //Generate JPanel matrix
        for (int i = 0; i < rows; i++) {
            boardColumn = new ArrayList<Cell>();
            for (int j = 0; j < cols; j++) {
                boardColumn.add(new Cell(white));
            }
            board.add(boardColumn);
        }
        //Add JPanel Matrix to SnakeBoard
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                snakeBoard.add(board.get(i).get(j).cell);
            }
        }
        //Get focus on snakeBoard
        snakeBoard.setFocusable(true);
        this.add(snakeBoard, BorderLayout.CENTER);

        //Button that ends the game
        JButton finalButton = new JButton("Finalizar Juego");
        finalButton.addActionListener(e -> System.exit(0));
        finalButton.setFocusable(false);
        this.add(finalButton, BorderLayout.SOUTH);

    }

}
