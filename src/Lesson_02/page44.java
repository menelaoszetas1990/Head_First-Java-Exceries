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
public class page44 {
    int count = 0;
    
    void hello () {
        System.out.println("helloooo...");
    }
}

class page44Test {
    public static void main (String[] args) {
        page44 e1 = new page44();
        //gia to 24 e2 = e1
        page44 e2 = new page44();
        int x = 0;
        while (x < 4) {
            e1.hello();
            e1.count = e1.count + 1;
            if (x == 3) {
                e2.count = e2.count + 1;
            }
            if (x > 0) {
                e2.count = e2.count + e1.count;
            }
            x = x + 1;
        }
        System.out.println(e2.count);
    }
}
