/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ninja
 */
import java.util.*;

public class BirdDatabase {
    private ArrayList<Bird> birds;
    
    public BirdDatabase(){
        this.birds= new ArrayList<Bird>();
    }
    
    public void addBird(Bird bird){
        birds.add(bird);
    }
    
    public void printAll(){
        for (Bird bird : birds){
            System.out.println(bird);
        }
    }
    
    public boolean contains(String compare){
        for (Bird bird: birds){
            if (bird.getName().equals(compare)){
                return true;
            }
            
        }
        
                return false;
            
    }
    
    public Bird getByName(String name){
        for (Bird bird: birds){
            if (bird.getName().equals(name)){
                return bird;
            }
            
        }
        ///This should never get retured - just want to satisfy compiler
        Bird tempBird=new Bird("name", "name");
        return tempBird;
    }
    
}
