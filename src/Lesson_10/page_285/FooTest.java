/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson_10.page_285;

import Lesson_10.page_285.Foo4;
import Lesson_10.page_285.Foo5;
import Lesson_10.page_285.Foo6;

/**
 *
 * @author menelaos
 */
public class FooTest {
    public static void main (String[] args) {
        System.out.println("\na");
        System.out.println("static int x");
        Foo a = new Foo();
        a.go();
        a.x = 5;
        a.go();
        
        System.out.println("\nb");
        System.out.println("static final int x = 12");
        Foo4 b = new Foo4();
        b.go();
        // b.x = 5;
        
        System.out.println("\nc");
        System.out.println("static final int x = 12");
        Foo5 c = new Foo5();
        c.go(5);
        // c.x = 5;
        
        System.out.println("\nd");
        Foo6 d = new Foo6();
        System.out.println("int x = 12");
        d.go(5);
        d.x = 15;
        d.go(d.x);
    }
}


