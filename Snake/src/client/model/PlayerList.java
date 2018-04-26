/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.model;

import java.util.Vector;

/**
 *
 * @author cvs
 */
public class PlayerList {
    Vector<Player> playerList;
    
    
    public PlayerList(){
        this.playerList=new Vector();
    }
    
    public void addJugador(Player player){
        this.playerList.add(player);
    }
    
    public void addPlayerString(Player player){
        this.playerList.add(player);
    }
    
    public void setPlayerList(Vector<Player> playerList){
        this.playerList=playerList;
    }
    
    public Vector<Player> getPlayerList(){
        return this.playerList;
    }
    
    
    
    
}
