package binarysearch;

import java.util.Scanner;

/**
 * Binary Search algorithm implementation in a guessing game.
 * (Program asks questions to narrow down range of available numbers until it finds the user guess)
 * 
 * @author Vita
 */
public class BinarySearch {

    /**
     * Main thread of execution.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {          
        Scanner scn = new Scanner(System.in);
        int start = 0, end = 100, diff, step;
        boolean solved = false;
        
        do {
            step = (end-start)/2;
            diff = step + start;
            
//            System.out.println("Start: " + start);
//            System.out.println("End: " + end);
//            System.out.println("Diff: " + diff);
            
            System.out.print("Is your guess " + diff + "? (y/n)");
            String answer = scn.nextLine();
            if (answer.equals("y")) {
                solved = true;
                System.out.println("Your number is: " + diff);
            }
            else {
                System.out.print("Is your number bigger than " + diff + "? (y/n)");
                String ans = scn.nextLine();
                if (ans.equals("y")) {
                    start = diff + 1; 
                } else if (ans.equals("n")) {
                    end = diff;
                } 
            } 
        } while (!solved);
          
    }
}
