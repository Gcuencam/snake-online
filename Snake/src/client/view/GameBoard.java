package client.view;

import client.controller.ThreadsController;
import java.awt.GridLayout;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import client.model.Position;
import client.model.Cell;
import client.controller.KeyboardListener;

public class GameBoard extends JFrame{
    public static ArrayList<ArrayList<Cell>> Grid;
    public static int rows = 20;
    public static int cols = 20;
    public static int white = 2;

    public GameBoard(){

        // Instanciar matriz de celdas
        Grid = new ArrayList<ArrayList<Cell>>();
        ArrayList<Cell> rowOfCells;

        // Rellenar matriz con filas de celdas
        for(int i=0;i<rows;i++){
            rowOfCells = new ArrayList<Cell>();
            for(int j=0;j<cols;j++){
                Cell cell = new Cell(white);
                rowOfCells.add(cell);
            }
            Grid.add(rowOfCells);
        }

        // Configurando GridLayout para el Juego
        getContentPane().setLayout(new GridLayout(rows,cols));

        // Comienza y pausa todos los hilos, añade cada celda del hilo al game panel
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                this.getContentPane().add(Grid.get(i).get(j).cell);
            }
        }

        // Posición inicial del snake
        Position position = new Position(10,10);
        // Pasar posicion del snake a la clase controladora
        ThreadsController controller = new ThreadsController(position);
        //Commenzar el juego
        controller.start();
        // Añadir el KeyboardListener a la ventana del juego
        this.addKeyListener((KeyListener) new KeyboardListener());
        
    }
}

