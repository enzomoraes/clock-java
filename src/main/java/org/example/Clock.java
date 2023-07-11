package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Clock {
    static JFrame frame;

    public static void start() {
        frame = new JFrame("Clock");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DrawClock clockDrawer = new DrawClock();

        frame.getContentPane().add(clockDrawer);
        frame.pack();
        frame.setVisible(true);
        frame.setName("Clock");

        Clock.startTimer();
    }

    private static void startTimer() {
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.repaint();
            }
        });
        timer.start();
    }
}
