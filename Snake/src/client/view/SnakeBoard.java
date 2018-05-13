package client.view;

import client.model.Cell;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;

public class SnakeBoard extends JPanel{
    public static ArrayList<ArrayList<Cell>> board;
    public static ArrayList<Cell> boardColumn;
    public static int rows = 20;
    public static int cols = 20;
    public static int white = 2;
 
    public SnakeBoard() {
        
        JPanel snakeBoard = new JPanel();
        snakeBoard.setLayout(new GridLayout(rows,cols));
        board = new ArrayList<ArrayList<Cell>>();

        for(int i=0;i<rows;i++){
            boardColumn = new ArrayList<Cell>();
            for(int j=0;j<cols;j++){ 
                boardColumn.add(new Cell(white));
            }
            board.add(boardColumn);
        }
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                snakeBoard.add(board.get(i).get(j).cell);
            }
        }
        
        this.setLayout(new BorderLayout());      
        this.add(snakeBoard, BorderLayout.CENTER);
        JButton finJuego = new JButton("Finalizar Juego");
        this.add(finJuego, BorderLayout.SOUTH);

    }
    
}
