package client.controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import static java.awt.event.KeyEvent.VK_DOWN;
import static java.awt.event.KeyEvent.VK_LEFT;
import static java.awt.event.KeyEvent.VK_RIGHT;
import static java.awt.event.KeyEvent.VK_UP;

 public class KeyboardListener extends KeyAdapter{
    public void keyPressed(KeyEvent e){
        switch(e.getKeyCode()){
            case VK_RIGHT: 
                //if the position if not the oposite one
                if(ThreadsController.directionSnake!=2) 
                        ThreadsController.directionSnake=1;
                break;
            case VK_UP:
                if(ThreadsController.directionSnake!=4) 
                        ThreadsController.directionSnake=3;
                break;

            case VK_LEFT: 
                if(ThreadsController.directionSnake!=1)
                        ThreadsController.directionSnake=2;
                break;

            case VK_DOWN:
                if(ThreadsController.directionSnake!=3)
                        ThreadsController.directionSnake=4;
                break;

            default: 	
                break;
        }
    }
 	
 }

