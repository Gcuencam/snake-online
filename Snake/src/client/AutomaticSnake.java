package client;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author ainhoamancera
 */
public class AutomaticSnake implements Runnable {
    private JPanel gamePanel;
    private JPanel[][] panelArray;
    
    public AutomaticSnake(GridPanel gamePanel) {
        this.gamePanel = gamePanel;
        this.panelArray = gamePanel.getPanelArray();
    }
    
    @Override
    public void run() {
        System.out.println(panelArray[0].length);
        while(true){
            for (int row=0; row < panelArray[0].length; row++) {
                for (int col= 1; col < panelArray[0].length; col++){
                    panelArray[row][col].setBackground(Color.red);
                    panelArray[row][col-1].setBackground(Color.white);
                    System.out.println("" + row + col);
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                panelArray[row][panelArray[0].length-1].setBackground(Color.white);
            }
            
        }

    }
    
}
