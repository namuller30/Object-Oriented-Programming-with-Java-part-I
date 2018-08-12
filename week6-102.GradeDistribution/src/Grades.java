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

public class Grades {
    private int allScores;
    private ArrayList<Integer> allGrades;
    private int acceptedScores;
    
    public Grades(){
    this.allScores=0;
    this.allGrades= new ArrayList<Integer>();
    this.acceptedScores=0;
    }
    
    
    
    public void addGrade(int score){
        allScores+=1;
        
        if (score>=0 && score<=29){
            allGrades.add(0);
            
        }
        else if (score<=34){
            allGrades.add(1);
            acceptedScores+=1;
        }
        else if (score<=39){
            allGrades.add(2);
            acceptedScores+=1;
        }
        else if (score<=44){
            allGrades.add(3);
            acceptedScores+=1;
        }
        else if (score<=49){
            allGrades.add(4);
            acceptedScores+=1;
        }
        else if (score<=60){
            allGrades.add(5);
            acceptedScores+=1;
        }    
    }
    
    public void printGrades(){
        System.out.println("Grade distribution:");
        for (int i=0;i<6;i++){
            int tempnumber=5-i;
            System.out.print(""+tempnumber+": ");
            for (int j=0;j<allGrades.size();j++){
               if (allGrades.get(j)==tempnumber){
                   System.out.print("*");
               }
            }
            System.out.println("");
        }
    }
    
    public double calculateAcceptance(){
        double acceptance=(100.0*acceptedScores)/allScores;
        return acceptance;
    }
    
    
}
