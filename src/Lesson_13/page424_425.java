package Lesson_13;

import javax.swing.*;
import java.awt.*;

public class page424_425 {
    public static void main (String[] args) {
        JFrame frame = new JFrame("page424_425");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);
        JButton button = new JButton("tesuji");
        JButton buttonTwo = new JButton("watari");
        frame.getContentPane().add(BorderLayout.NORTH, panel);
        panel.add(buttonTwo);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setSize(300, 300);
        frame.setVisible(true);


        JFrame frame2 = new JFrame("B");
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.DARK_GRAY);
        JButton button2 = new JButton("tesuji");
        JButton buttonTwo2 = new JButton("watari");
        panel2.add(buttonTwo2);
        frame2.getContentPane().add(BorderLayout.CENTER, button2);
        frame2.getContentPane().add(BorderLayout.EAST, panel2);
        frame2.setSize(300, 300);
        frame2.setVisible(true);

        JFrame frame3 = new JFrame("C");
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.DARK_GRAY);
        JButton button3 = new JButton("tesuji");
        JButton buttonTwo3 = new JButton("watari");
        panel3.add(buttonTwo3);
        frame3.getContentPane().add(BorderLayout.CENTER, button3);
        frame3.setSize(300, 300);
        frame3.setVisible(true);

        JFrame frame4 = new JFrame("A");
        frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel4 = new JPanel();
        panel4.setBackground(Color.DARK_GRAY);
        JButton button4 = new JButton("tesuji");
        JButton buttonTwo4 = new JButton("watari");
        panel4.add(button4);
        frame4.getContentPane().add(BorderLayout.NORTH, buttonTwo4);
        frame4.getContentPane().add(BorderLayout.EAST, panel4);
        frame4.setSize(300, 300);
        frame4.setVisible(true);

        JFrame frame5 = new JFrame("E");
        frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel5 = new JPanel();
        panel5.setBackground(Color.DARK_GRAY);
        JButton button5 = new JButton("tesuji");
        JButton buttonTwo5 = new JButton("watari");
        frame5.getContentPane().add(BorderLayout.SOUTH, panel5);
        panel5.add(buttonTwo5);
        frame5.getContentPane().add(BorderLayout.NORTH, button5);
        frame5.setSize(300, 300);
        frame5.setVisible(true);

    }
}
