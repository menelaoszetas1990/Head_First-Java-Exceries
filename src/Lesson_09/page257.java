/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson_09;

/**
 *
 * @author menelaos
 */
public class page257 extends Boo {
    public page257() {
        super("boo");
    }
    
    public page257(int i) {
        super("Fred");
    }
    
    public page257(String s) {
        super(42);
    }
    
//    public page257(int i, String s) {
//    }
    
//    public page257(String a, String b, String c) {
//        super(a, b);
//    }
    
    public page257(int i, int j) {
        super("man", j);
    }
    
//    public page257(int i, int x, int y) {
//        super(i, "star");
//    }
}

class Boo {
    public Boo(int i) {}
    public Boo(String s) {}
    public Boo(String s, int i) {}
}