/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.model;

import client.model.Counter;

/**
 *
 * @author cvs
 */
public class Player {

    private Counter score;
    private String namePlayer;

    public Player(String n) {
        this.namePlayer = n;
        this.score = new Counter();
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

}
