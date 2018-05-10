package com.wangfei.lecture;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class BoxObserver {
    public static void main(String[] args) throws Exception{
        System.out.println("d");
        JFrame frame = new JFrame("Hello Swing");
        final JLabel label = new JLabel("A Label");
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);
        frame.setVisible(true);
        TimeUnit.SECONDS.sleep(1);
//        label.setText("Hey! This is Different!");
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                label.setText("Hey! This is Differernt!");
            }
        });
    }
}
