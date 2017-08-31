/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson_06;

/**
 *
 * @author menelaos
 */
import java.util.*;

public class page161 {
    public static void main (String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add(0, "zero");
        a.add(1, "one");
        a.add(2, "two");
        a.add(3, "three");
        printAL(a);
        if (a.contains("three")) {
            a.add("four");
        }
        System.out.println("\nIndex of \"four\" before the remove: " + a.indexOf("four"));
        a.remove(2);
        System.out.println("Index of \"four\" after the remove: " + a.indexOf("four") + "\n");
        printAL(a);
        if (a.indexOf("four") != 4) {
            a.add(4, "4.2");
        }
        printAL(a);
        if (a.contains("two")) {
            a.add("2.2");
        }
        printAL(a);
    }
     
    public static void printAL (ArrayList<String> al) {
        for (String element: al) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
    }
}
