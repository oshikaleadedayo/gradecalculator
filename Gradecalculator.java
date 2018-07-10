/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradecalculator;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class Gradecalculator {

    /**
     * @param args the command line arguments
     */
    // == (is equal to)
        // != (not equal to)
        // > greater than
        // < less than
        // >= (greater than or equal to)
        // <= (less than or equal to)
        // % modules
        // &&
        // or ||
     
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("input your score ");
     int score = input.nextInt();
    //System.out.println(score); it is commentout becuse i dont want it to print the score, i wnt only the grde
   // int range = 70-100;
   // int range1 = 60-69;
   // int range2 = 50-59;
   // int range3 = 45-49;
   // int range4= 40-45;
    //int range5 = 0-39;
       if (score>=70 && score<=100){
       System.out.println("A");
   } else if (score<=69 && score>=60){
       System.out.println ("B");
   }else if (score<=59 && score>=50){
       System.out.println ("C");
   }else if (score<=49 && score>=45){
       System.out.println ("D");
   }else if (score<=44 && score>=40){
       System.out.println ("E");
   } else if (score<=39 && score>=0){
       System.out.println ("F");
   } else{
       System.out.println ("Missing script");
    
   
    
    }
    }
}
