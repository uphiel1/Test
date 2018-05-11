package com.wangfei.lecture;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.FlowLayout;

import javax.swing.JButton;

class TestJlabel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello Swing");
        JLabel label1 = new JLabel("A Label");
        JLabel label2 = new JLabel("A Label");
        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        frame.add(label1);
        frame.add(label2);
        frame.add(b1);
        frame.add(b2);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);
        frame.setVisible(true);
    }
}