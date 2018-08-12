/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ninja
 */
public class Player {
    private String playerName;
    private int goals;
    
    public Player(String playerName){
        this(playerName, 0);
    }
    
    public Player(String playerName, int goals){
        this.goals=goals;
        this.playerName=playerName;
    }
    
    public String getName(){
        return this.playerName;
    }
    
    public int goals(){
        return this.goals;
    }
    
    public String toString(){
        return ""+this.playerName+", goals "+this.goals;
    }
}



