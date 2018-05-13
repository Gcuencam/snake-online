package client.controller;

import java.util.ArrayList;
import client.model.Position;
import client.model.Cell;
import client.view.SnakeBoard;

public class ThreadsController extends Thread {
    ArrayList<ArrayList<Cell>> Cells = new ArrayList<ArrayList<Cell>>();
    long speedSnake = 100;
    Position SnakeHead;
    int sizeSnake=2;
    public static int directionSnake;

    ArrayList<Position> positions = new ArrayList<Position>();
    Position foodPosition;

    public ThreadsController(Position initialPos){
        
        Cells = SnakeBoard.board;
        SnakeHead=new Position(initialPos.x,initialPos.y);
        directionSnake = 1;

        Position headPos = new Position(SnakeHead.getX(),SnakeHead.getY());
        positions.add(headPos);
        foodPosition= new Position(SnakeBoard.cols-2,SnakeBoard.rows-4);
        addFood(foodPosition);

    }
    //Logic part:
    public void run() {
        while(true){
            moveSnake(directionSnake);
            checkCollision();
            updateBoard();
            deleteTail();
            pauser();
        }
    }

    //Checking if the snake bites itself or is eating
    private void checkCollision() {
        Position posCritique = positions.get(positions.size()-1);
        for(int i = 0;i<=positions.size()-2;i++){
            boolean biteItself = posCritique.getX()==positions.get(i).getX() && posCritique.getY()==positions.get(i).getY();
            if(biteItself){
                finishGame();
            }
        }
        boolean eatingFood = posCritique.getX()==foodPosition.y && posCritique.getY()==foodPosition.x;
        if(eatingFood){
            System.out.println("Tasty!");
            sizeSnake=sizeSnake+1;
                   foodPosition = getFreePos();
            addFood(foodPosition);	
        }
    }

    //Put food in a position and displays it
    private void addFood(Position foodPositionIn){
        Cells.get(foodPositionIn.x).get(foodPositionIn.y).updateColor(1);
    }

    //return a free position
    private Position getFreePos(){
        Position pos ;
        int ranX= 0 + (int)(Math.random()*19); 
        int ranY= 0 + (int)(Math.random()*19); 
        pos=new Position(ranX,ranY);
        for(int i = 0;i<=positions.size()-1;i++){
            if(pos.getY()==positions.get(i).getX() && pos.getX()==positions.get(i).getY()){
                ranX= 0 + (int)(Math.random()*19); 
                ranY= 0 + (int)(Math.random()*19); 
                pos=new Position(ranX,ranY);
                i=0;
            }
        }
        return pos;
    }

    //Moves the head of the snake => 1:right 2:left 3:top 4:bottom 0:nothing
    private void moveSnake(int dir){
        switch(dir){
            case 4:
                SnakeHead.changeSnakePos(SnakeHead.x,(SnakeHead.y+1)%20);
                positions.add(new Position(SnakeHead.x,SnakeHead.y));
                break;
                
            case 3:
                if(SnakeHead.y-1<0){
                    SnakeHead.changeSnakePos(SnakeHead.x,19);
                 }
                else{
                    SnakeHead.changeSnakePos(SnakeHead.x,Math.abs(SnakeHead.y-1)%20);
                }
                positions.add(new Position(SnakeHead.x,SnakeHead.y));
                break;
            case 2:
                if(SnakeHead.x-1<0){
                    SnakeHead.changeSnakePos(19,SnakeHead.y);
                }
                else{
                    SnakeHead.changeSnakePos(Math.abs(SnakeHead.x-1)%20,SnakeHead.y);
                } 
               positions.add(new Position(SnakeHead.x,SnakeHead.y));
               break;
            case 1:
                SnakeHead.changeSnakePos(Math.abs(SnakeHead.x+1)%20,SnakeHead.y);
                positions.add(new Position(SnakeHead.x,SnakeHead.y));
                break;
        }
    }

    //Update board 
    private void updateBoard(){
        for(Position pos : positions){
            int y = pos.getX();
            int x = pos.getY();
            Cells.get(x).get(y).updateColor(0);
        }
    }

    //Change snake tail position, deleting it
    private void deleteTail(){
        int cont = sizeSnake;
        for(int i = positions.size()-1;i>=0;i--){
            if(cont==0){
                Position t = positions.get(i);
                Cells.get(t.y).get(t.x).updateColor(2);
            }
            else{
                cont--;
            }
        }
        cont = sizeSnake;
        for(int i = positions.size()-1;i>=0;i--){
            if(cont==0){
                positions.remove(i);
            }
            else{
                cont--;
            }
        }
    }
    
    //delay between each move of the snake
    private void pauser(){
        try {
            sleep(speedSnake);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    //Ends the game
    private void finishGame(){
        System.out.println("COLISION! \n");
        while(true){
                pauser();
        }
    }
}

