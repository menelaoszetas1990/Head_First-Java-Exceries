/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson_10;

/**
 *
 * @author menelaos
 */
public class page310 extends StaticSuper {
    static int rand;
    
    static {
        rand = (int) (Math.random() * 6);
        System.out.println("static block " + rand);
    }
    
    // constructor
    page310() {
        System.out.println("constructor");
    }
    
    public static void main (String[] args) {
        System.out.println("in main");
        page310 st = new page310();     // 8a treksei prwta o constructor tou parent
    }
}

class StaticSuper {
    static {
        System.out.println("super static block");
    }
    
    // constructor
    StaticSuper () {
        System.out.println("super constructor");
    }
}