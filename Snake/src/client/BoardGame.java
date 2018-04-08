package client;

import javax.swing.JFrame;

/**
 *
 * @author ainhoamancera
 */

public class BoardGame extends JFrame{

    public BoardGame() {
        this.setBounds(350, 100, 500, 500);
        
        this.setTitle("Snake dashboard");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        BoardPanel gamePanel = new BoardPanel();
        this.add(gamePanel);
        
        this.setResizable(false);
        this.setVisible(true);
    }
        
    public static void main(String[] args) {
        BoardGame boardGame = new BoardGame();    
    }
}
