/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson_03;

/**
 *
 * @author menelaos
 */
public class page65 {
    double area;
    int height;
    int length;
    public static void main (String[] args) {
        int x = 0;
        page65[] ta = new page65[4];
        while (x < 4) {
            ta[x] = new page65();
            ta[x].height = (x + 1) * 2;
            ta[x].length = x + 4;
            ta[x].setArea();
            System.out.print("triangle " + x + ", area");
            System.out.println(" = " + ta[x].area);
            x = x + 1;
        }
        int y = x;
        x = 27;
        page65 t5 = ta[2];
        ta[2].area = 343;
        System.out.print("y = " + y);
        System.out.println(", t5 area = " + t5.area);
    }
    
    void setArea() {
        area = (height * length) / 2;
    }
}
