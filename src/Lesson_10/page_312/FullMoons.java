/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson_10.page_312;

import static java.lang.System.out;
import java.util.Calendar;

/**
 *
 * @author menelaos
 */
class FullMoons {
    static int DAY_IM = 1000 * 60 * 60 * 24;
    
    public static void main (String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2004,0,7,15,40);
        long day1 = c.getTimeInMillis();
        for (int x = 0; x < 170; x++) {
            day1 += (DAY_IM * 29.52);
            c.setTimeInMillis(day1);
            out.println(String.format("full moon on %tc", c));
        }
    }
}
