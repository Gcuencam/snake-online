/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.model;

import java.util.Observable;

/**
 * Class that implements the singleton and observable pattern.
 */
public class Player extends Observable {

    private final Counter score;
    private String namePlayer;
    private static Player player;

    private Player(String n) {
        this.namePlayer = n;
        this.score = new Counter();
    }

    public static Player createSingletonInstance(String n) {
        if (player == null){
            player = new Player(n);
        }
        return player;
    }
    
    public static Player getSingletonInstance() {
        return player;
    }

    public String getPlayerName() {
        return this.namePlayer;
    }

    public void setPlayerName(String n) {
        this.namePlayer = n;
    }

    public int getScore() {
        return this.score.getCounter();
    }

    public void setScore(Counter c) {
        this.score.setCounter(c);
    }
    
    public void incrementScore() {
        this.score.increment();
        this.setChanged();
        this.notifyObservers();
    }

}
