package client.view;

import client.controller.ThreadsController;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import client.model.Position;
import client.controller.KeyboardListener;

public class GameWindow extends JFrame{
    public SnakeBoard mainBoard;
    public GameWindow(){
        this.setTitle("Snake Game");
        this.setBounds(350, 100, 500, 500);
        this.addKeyListener((KeyListener) new KeyboardListener());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        mainBoard = new SnakeBoard();
        add(mainBoard);
        
        Position position = new Position(10,10);
        ThreadsController controller = new ThreadsController(position);
        controller.start();
    }
}
