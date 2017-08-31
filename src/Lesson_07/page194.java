/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson_07;

/**
 *
 * @author menelaos
 */
public class page194 {
    public static void main (String[] args) {
        Boat b1 = new Boat();
        Sailboat b2 = new Sailboat();
        Rowboat b3 = new Rowboat();
        b2.setLength(32);
        b1.move();
        b3.move();
        b2.move();
    }
}

class Boat {
    private int length;
    public void setLength(int len) {
        length = len;
    }
    public int getLength() {
        return length;
    }
    public void move() {
        System.out.print("drift ");
    }
}

class Rowboat extends Boat {
    public void rowTheBoat() {
        System.out.print(" stroke natasha");
    }
}

class Sailboat extends Boat {
    public void move() {
        System.out.print("hoist sail");
    }
}