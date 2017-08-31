/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson_01;

/**
 *
 * @author menelaos
 */
public class page24 {
    public static void main (String[] args) {
        int x = 0;
        while (x < 1) {
            System.out.print("a");
            if (x < 1) {
                System.out.print(" ");
            }
            System.out.println("noise");
            if (x < 4) {
                System.out.println("annoys");
                x = x + 1;
            }
            if ( x == 1) {
                System.out.print("an");
            }
            if ( x > 0) {
                System.out.print(" oyster");
            }
            System.out.println("");
            x = x + 2;
        }
        
        // OR book solution
        
        x = 0;
        while (x < 4) {
            System.out.print("a");
            if (x < 1) {
                System.out.print(" ");
            }
            System.out.print("n");
            if (x > 1) {
                System.out.print(" oyster");
                x = x + 2;
            }
            if ( x == 1) {
                System.out.print("noys");
            }
            if ( x < 1) {
                System.out.print("oise");
            }
            System.out.println("");
            x = x + 1;
        }
    }
}
