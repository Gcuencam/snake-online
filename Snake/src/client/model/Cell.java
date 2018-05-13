package client.model;

import java.util.ArrayList;
import java.awt.Color;
import client.view.JPanelCell;

public class Cell {

    public JPanelCell cell;
    //color arrayslit
    ArrayList<Color> C = new ArrayList<Color>();
    int color;

    public Cell(int col) {
        //Add color to arraylist
        C.add(Color.darkGray); //0
        C.add(Color.green); //1 
        C.add(Color.white); //2
        color = col;
        cell = new JPanelCell(C.get(color));
    }

    public void updateColor(int c) {
        cell.changeColor(C.get(c));
    }
}
