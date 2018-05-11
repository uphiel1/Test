package com.wangfei.lecture;

import javax.swing.*;

import java.util.concurrent.TimeUnit;
import java.util.LinkedList;
import java.util.List;

import com.wangfei.mindview.util.*;

public class SubmitSwingProgram_fw extends JFrame {

    public SubmitSwingProgram_fw() {
        super("Hello Swing");
    }

    public static void main(String[] args) throws Exception {
        System.out.println("ddd");
        final List<JLabel> labels = getLabelList(2);
        SubmitSwingProgram_fw ssp = new SubmitSwingProgram_fw();
        SwingConsole.run(ssp, 300, 100);
        for(JLabel label : labels){
            ssp.add(label);
        }
        TimeUnit.SECONDS.sleep(1);
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                for(JLabel label : labels){
                    label.setText("Hey! This is Differernt!");
                }
            }
        });
    }
    public static List<JLabel> getLabelList(int num){
        List<JLabel> labels = new LinkedList<JLabel>();
        for(int i = 0; i < num; i++){
            labels.add(new JLabel(num + "A Label"));
        }
        return labels;
    }
}
