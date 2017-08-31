/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson_04;

/**
 *
 * @author menelaos
 */
public class page90 {
    int counter =0;
    public static void main (String[] args) {
        int count = 0;
        page90[] m4a = new page90[20];
        int x = 0;
//        x < 9
//        x < 20
//        x < 7
//        x < 19
        while (x < 19) {
            m4a[x] = new page90();
            m4a[x].counter = m4a[x].counter + 1;
            count = count + 1;
            count = count + m4a[x].maybeNew(x);
            x = x + 1;
        }
        System.out.println(count + " " + m4a[1].counter);
    }
    
    public int maybeNew (int index) {
//        index < 5
//        index < 5
//        index < 7
//        index < 1
        if (index < 1) {
            page90 m4 = new page90();
            m4.counter = m4.counter + 1;
            return 1;
        }
        return 0;
    }
}
