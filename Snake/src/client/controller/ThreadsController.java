package client.controller;

import java.util.ArrayList;
import client.model.Position;
import client.model.Cell;
import client.view.SnakeBoard;

public class ThreadsController extends Thread {
    ArrayList<ArrayList<Cell>> Cells = new ArrayList<ArrayList<Cell>>();
    Position headSnakePos;
    int sizeSnake=2;
    long speed = 100;
    public static int directionSnake ;

    ArrayList<Position> positions = new ArrayList<Position>();
    Position foodPosition;

    //Constructor of ControllerThread 
    public ThreadsController(Position positionDepart){
        //Get all the threads
        Cells = SnakeBoard.board;

        headSnakePos=new Position(positionDepart.x,positionDepart.y);
        directionSnake = 1;

        //Pointer
        Position headPos = new Position(headSnakePos.getX(),headSnakePos.getY());
        positions.add(headPos);

        foodPosition= new Position(SnakeBoard.cols-2,SnakeBoard.rows-4);
        addFood(foodPosition);

    }

    //Logic part:
    public void run() {
        while(true){
            moveInterne(directionSnake);
            checkCollision();
            moveExterne();
            deleteTail();
            pauser();
        }
    }

    //delay between each move of the snake
    private void pauser(){
        try {
            sleep(speed);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //Checking if the snake bites itself or is eating
    private void checkCollision() {
        Position posCritique = positions.get(positions.size()-1);
        for(int i = 0;i<=positions.size()-2;i++){
            boolean biteItself = posCritique.getX()==positions.get(i).getX() && posCritique.getY()==positions.get(i).getY();
            if(biteItself){
                stopGame();
            }
        }

        boolean eatingFood = posCritique.getX()==foodPosition.y && posCritique.getY()==foodPosition.x;
        if(eatingFood){
            System.out.println("Tasty!");
            sizeSnake=sizeSnake+1;
                   foodPosition = getValAleaNotInSnake();

            addFood(foodPosition);	
        }
    }

    //Stops The Game
    private void stopGame(){
        System.out.println("COLISION! \n");
        while(true){
                pauser();
        }
    }

    //Put food in a position and displays it
    private void addFood(Position foodPositionIn){
        Cells.get(foodPositionIn.x).get(foodPositionIn.y).UpdateColor(1);
    }

    //return a position not occupied by the snake
    private Position getValAleaNotInSnake(){
        Position p ;
        int ranX= 0 + (int)(Math.random()*19); 
        int ranY= 0 + (int)(Math.random()*19); 
        p=new Position(ranX,ranY);
        for(int i = 0;i<=positions.size()-1;i++){
            if(p.getY()==positions.get(i).getX() && p.getX()==positions.get(i).getY()){
                ranX= 0 + (int)(Math.random()*19); 
                ranY= 0 + (int)(Math.random()*19); 
                p=new Position(ranX,ranY);
                i=0;
            }
        }
        return p;
    }

    //Moves the head of the snake and refreshes the positions in the arraylist
    //1:right 2:left 3:top 4:bottom 0:nothing
    private void moveInterne(int dir){
        switch(dir){
            case 4:
                headSnakePos.ChangePos(headSnakePos.x,(headSnakePos.y+1)%20);
                positions.add(new Position(headSnakePos.x,headSnakePos.y));
                break;
            case 3:
                if(headSnakePos.y-1<0){
                    headSnakePos.ChangePos(headSnakePos.x,19);
                 }
                else{
                    headSnakePos.ChangePos(headSnakePos.x,Math.abs(headSnakePos.y-1)%20);
                }
                positions.add(new Position(headSnakePos.x,headSnakePos.y));
                break;
            case 2:
                if(headSnakePos.x-1<0){
                    headSnakePos.ChangePos(19,headSnakePos.y);
                }
                else{
                    headSnakePos.ChangePos(Math.abs(headSnakePos.x-1)%20,headSnakePos.y);
                } 
               positions.add(new Position(headSnakePos.x,headSnakePos.y));
               break;
            case 1:
                headSnakePos.ChangePos(Math.abs(headSnakePos.x+1)%20,headSnakePos.y);
                positions.add(new Position(headSnakePos.x,headSnakePos.y));
                break;
        }
    }

    //Refresh the cells that needs to be 
    private void moveExterne(){
        for(Position t : positions){
            int y = t.getX();
            int x = t.getY();
            Cells.get(x).get(y).UpdateColor(0);
        }
    }

    //Refreshes the tail of the snake, by removing the superfluous data in positions arraylist
    //and refreshing the display of the things that is removed
    private void deleteTail(){
        int cmpt = sizeSnake;
        for(int i = positions.size()-1;i>=0;i--){
            if(cmpt==0){
                Position t = positions.get(i);
                Cells.get(t.y).get(t.x).UpdateColor(2);
            }
            else{
                cmpt--;
            }
        }
        cmpt = sizeSnake;
        for(int i = positions.size()-1;i>=0;i--){
            if(cmpt==0){
                positions.remove(i);
            }
            else{
                cmpt--;
            }
        }
    }
}

