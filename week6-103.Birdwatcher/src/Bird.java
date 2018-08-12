/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ninja
 */
public class Bird {
    private String name;
    private String latinName;
    private int obeservations;
    
    public Bird(String name, String latinName){
        this.name=name;
        this.latinName=latinName;
    }
    
    public void observe(){
        this.obeservations++;
    }
    
    public int getObservations(){
        return this.obeservations;
    }
    
    public String toString(){
        return ""+this.name+" ("+this.latinName+"): "+this.obeservations+"observations";
    }
    
    public String getName(){
        return this.name;
    }
    
}
