package client.view;

import java.awt.Color;
import javax.swing.JPanel;

//JPanel contained in the cell of the Snake Board
public class JPanelCell extends JPanel {

    public JPanelCell(Color c) {
        this.setBackground(c);
    }

    public void changeColor(Color c) {
        this.setBackground(c);
        this.repaint();
    }

}
