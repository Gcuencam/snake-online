package client.view;

import java.awt.Color;
import javax.swing.JPanel;

public class JPanelCell extends JPanel{
	
    public JPanelCell(Color c){
            this.setBackground(c);
    }
    public void ChangeColor(Color c){
            this.setBackground(c);
            this.repaint();
    }
	
}

