/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson_10.page_310;

/**
 *
 * @author menelaos
 */
public class StaticTests extends StaticSuper {
    static int rand;
    
    static {
        rand = (int) (Math.random() * 6);
        System.out.println("static block " + rand);
    }
    
    // constructor
    StaticTests() {
        System.out.println("constructor");
    }
    
    public static void main (String[] args) {
        System.out.println("in main");
        StaticTests st = new StaticTests();     // 8a treksei prwta o constructor tou parent
    }
}

