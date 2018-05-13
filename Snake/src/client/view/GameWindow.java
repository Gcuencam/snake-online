package client.view;

import client.controller.ThreadsController;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import client.model.Position;
import client.controller.KeyboardListener;

//The game window itself, it starts the game
public class GameWindow extends JFrame {

    public GameWindow() {
        //Customize Game Window (the JFrame)
        this.setTitle("Snake Game");
        this.setBounds(350, 100, 500, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SnakeBoard mainBoard = new SnakeBoard();

        this.setFocusable(false);
        mainBoard.setFocusable(true);

        mainBoard.addKeyListener((KeyListener) new KeyboardListener());
        mainBoard.requestFocus();

        add(mainBoard);
        //Initialize the snake in a specific position (10,10) and starts the thread
        Position position = new Position(10, 10);
        ThreadsController controller = new ThreadsController(position);
        controller.start();
    }
}
