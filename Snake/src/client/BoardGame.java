package client;

import javax.swing.JFrame;

/**
 *
 * @author ainhoamancera
 */

public class BoardGame extends JFrame{
    private GridPanel gamePanel;
    
    public BoardGame() {
        this.setBounds(350, 100, 500, 500);
        
        this.setTitle("Snake dashboard");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        gamePanel = new GridPanel();
        this.add(gamePanel);
        
        this.setResizable(false);
        this.setVisible(true);
    }

    public GridPanel getGamePanel() {
        return gamePanel;
    }
    
    public static void main(String[] args) {
        BoardGame boardGame = new BoardGame();
        GridPanel gamePanel = boardGame.getGamePanel();
        Runnable r = new AutomaticSnake(gamePanel);
        Thread t = new Thread(r);
        t.start();
        
    }
}