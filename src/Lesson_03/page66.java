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
public class page66 {
    int id = 0;
    public static void main (String[] args) {
        int x = 0;
        page66[] hq = new page66[5];
        while (x < 3) {
            hq[x] = new page66();
            hq[x].id = x;
            x = x + 1;
        }
        
        hq[3] = hq[1];
        hq[4] = hq[1];
        hq[3] = null;
        hq[4] = hq[0];
        hq[0] = hq[3];
        hq[3] = hq[2];
        hq[2] = hq[0];
        
        for (int y =0;y < 5;y++) {
            if (hq[y]==null) {
                System.out.println("hq[" + y + "] id = null");
            } else {
            System.out.println("hq[" + y + "] id = " + hq[y].id);
            }
        }
    }
}
