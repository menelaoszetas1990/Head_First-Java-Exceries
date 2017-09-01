/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson_10.page_291;

/**
 *
 * @author menelaos
 */
public class TestBox {
    Integer i;
    int j;
    
    public static void main (String[] args) {
        TestBox t = new TestBox();
        t.go();
    }
    
    public void go() {
//        i = new Integer(null);
//        j = i;

// douleuei i = j;

        i = new Integer(j);     // h oti allh timh thelw sth thesh tou j
        System.out.println("Class of i: " + i.getClass());
        // j can not be dereferenced error
        //System.out.println("Class of j: " + j.getClass());
        j = i;
        // j keeps the int type
        //System.out.println("Class of j: " + j.getClass());
        
        System.out.println(j);
        System.out.println(i);
    }
}
