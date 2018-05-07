/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.model;

/**
 *
 * @author cvs
 */
public class Counter {

    private int c;
    private final int minValue = 0;

    public Counter() {
        this.c = 0;

    }

    public void increment() {
        this.c++;
    }

    public void decrement() {
        if (this.c > minValue) {
            this.c--;
        }

    }

    public int getCounter() {
        return this.c;
    }

    public void setCounter(int c) {
        this.c = c;
    }

    public String getCounterString() {
        return Integer.toString(this.c);
    }

    void setCounter(Counter c) {
        this.c = c.c;
    }

}
