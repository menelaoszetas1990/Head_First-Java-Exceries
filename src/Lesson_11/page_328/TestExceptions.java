/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson_11.page_328;

/**
 *
 * @author menelaos
 */
public class TestExceptions {
    public static void main (String [] args) {
        String test = "yes";
        try {
            System.out.println("start try");
            doRisky(test);
            System.out.println("end try");
        } catch (ScaryException se) {
            System.out.println("scary esxception");
        } finally {
            System.out.println("finally");
        }
        System.out.println("end of main");
    }
    
    static void doRisky(String test) throws ScaryException {
        System.out.println("start risky");
        if ("yes".equals(test)) {
            throw new ScaryException();
        }
        System.out.println("end risky");
        return;
    }

    private static class ScaryException extends Exception {

        public ScaryException() {
        }
    }
}
