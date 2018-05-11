package com.wangfei.lecture;

import javax.swing.*;

import java.util.concurrent.TimeUnit;
import java.util.LinkedList;
import java.util.List;
import java.awt.FlowLayout;

public class SubmitSwingProgram extends JFrame {
    static List<JLabel> labels = new LinkedList<JLabel>();

    public SubmitSwingProgram() {
        super("Hello Swing");
        int num = (int) (Math.random() * 10);
        System.out.println("num: " + num);
        for(int i = 0; i < 2; i++){
            labels.add(new JLabel(num + "A Label"));
            System.out.println(i);
        }
        for(JLabel label : labels){
            add(label);
            // label.setBorder(BorderFactory.createEtchedBorder());
        }
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        setVisible(true);
    }

    static SubmitSwingProgram ssp;

    public static void main(String[] args) throws Exception {
        System.out.println("ddd");
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                ssp = new SubmitSwingProgram();
            }
        });
        TimeUnit.SECONDS.sleep(1);
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                for(JLabel label : labels){
                    label.setText("Hey! This is Differernt!");
                }
            }
        });
    }
}
