package client.model;

public class Position { 
    public  int x; 
    public  int y; 

    public Position(int x, int y) { 
      this.x = x; 
      this.y = y; 
    } 
    public void ChangePos(int x, int y){
        this.x = x; 
        this.y = y; 
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
		  
} 