/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson_02;

/**
 *
 * @author menelaos
 */
class Page43 {
    boolean topHat = true;
    boolean snare = true;
    
    void playTopHat() {
        System.out.println("ding ding da-ding");
    }
    
    void playSnare() {
        System.out.println("bang bang ba-bang");
    }
}

class Page43Test {
        
    public static void main (String[] args) {
        Page43 d = new Page43();
        d.playSnare();
        d.playTopHat();
        d.snare = false;
        if (d.snare == true) {
            d.playSnare();
        }
    }
}
