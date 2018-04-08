package client;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

/**
 *
 * @author ainhoamancera
 */

public class GridPanel extends JPanel{
    
    private int rows = 20;
    private int cols = 20;
    private JPanel[][] panelArray = new JPanel[rows][cols];
    
    public GridPanel() {
        
        this.setLayout(new GridLayout(rows,cols));
        
        for (int row=0; row < rows; row++) {
            for (int col=0; col < cols; col++){
                JPanel cell = new JPanel();
                //cell.setBorder(BorderFactory.createLineBorder(Color.gray));
                cell.setBackground(Color.white);
                this.add(cell);
                panelArray[row][col] = cell;
            }
        }
    }
    
    public JPanel[][] getPanelArray() {
        return panelArray;
    }
    
    
    
}