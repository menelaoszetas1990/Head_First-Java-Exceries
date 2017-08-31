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
public class page193 {
    public static void main (String[] args) {
        Monster[] ma = new Monster[3];
        ma[0] = new Vampire();
        ma[1] = new Dragon();
        ma[2] = new Monster();
        for (int x = 0; x < 3; x++) {
            ma[x].frighten(x);
        }
    }
}
    
class Monster {
//    boolean frighten (int d) {
//        System.out.println("arrrgh");
//        return true;
//    }
    
//    boolean frighten (int x) {
//            System.out.println("arrrgh");
//            return true;
//    }
    
//    boolean frighten (int x) {
//            System.out.println("arrrgh");
//            return false;
//    }
    
    boolean frighten (int z) {
            System.out.println("arrrgh");
            return true;
    }
}

class Vampire extends Monster {
//     boolean frighten (int x) {
//        System.out.println("a bite?");
//        return false;
//    }
    
//    boolean frighten (int f) {
//            System.out.println("a bite?");
//            return 1;
//    }
    
//    boolean scare (int x) {
//            System.out.println("a bite?");
//            return true;
//    }
    
    boolean frighten (byte b) {
            System.out.println("a bite");
            return true;
    }
}

class Dragon extends Monster {
    boolean frighten (int degree) {
        System.out.println("breath fire");
        return true;
    }
}

