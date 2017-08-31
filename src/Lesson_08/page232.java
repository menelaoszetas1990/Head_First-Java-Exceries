/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson_08;

/**
 *
 * @author menelaos
 */

interface Nose {
    public int iMethod();
}

abstract class page232 implements Nose {
    public int iMethod () {
        return 7;
    }
}

class Clowns extends page232 {}

class Acts extends page232 {
    public int iMethod () {
        return 5;
    }
}

class Of76 extends Clowns {
    public static void main (String[] args) {
        Nose[] i = new Nose[3];
        i[0] = new Acts();
        i[1] = new Clowns();
        i[2] = new Of76();
        for (int x = 0; x < 3; x++) {
            System.out.println(i[x].iMethod() + " " + i[x].getClass());
        }
    }
}