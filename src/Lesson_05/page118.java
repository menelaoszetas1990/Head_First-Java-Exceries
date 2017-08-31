/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson_05;

/**
 *
 * @author menelaos
 */
public class page118 {
    public static void main (String[] args) {
        page118 o = new page118();
        o.go();
    }
    
    void go() {
        int y = 7;
        for (int x = 1; x < 8 ; x++) {
            y++;
            if (x > 4) {
                System.out.print(++y + " ");
            }
            if (y > 14) {
                System.out.println(" x = " + x);
                break;
            }
        }
    }
}
