package client;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

/**
 *
 * @author ainhoamancera
 */

public class BoardPanel extends JPanel{
    
    private int rows = 20;
    private int cols = 20;
    private JPanel[] panelArray = new JPanel[rows*cols];
    
    public BoardPanel() {
        
        this.setLayout(new GridLayout(rows,cols));
        
        for (int i=0; i < rows*cols; i++) {
                panelArray[i] = new JPanel();
                panelArray[i].setBorder(BorderFactory.createLineBorder(Color.gray));
                panelArray[i].setBackground(Color.white);
                this.add(panelArray[i]);
        }
        
        this.panelArray[225].setBackground(Color.red);
        
        
    }
    
}
