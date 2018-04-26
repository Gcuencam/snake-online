package client.model;

import java.util.ArrayList;
import java.awt.Color;
import client.view.JPanelCell;

public class Cell {
    //ArrayList de Colores
    ArrayList<Color> C =new ArrayList<Color>();
    int color; 
    public JPanelCell cell;
    public Cell(int col){
        //Añadir color al ArrayList
        C.add(Color.darkGray);  //0
        C.add(Color.green);    //1 
        C.add(Color.white);   //2
        color= col;
        cell = new JPanelCell(C.get(color));
    }
    public void UpdateColor(int c){
        cell.ChangeColor(C.get(c));
    }
}