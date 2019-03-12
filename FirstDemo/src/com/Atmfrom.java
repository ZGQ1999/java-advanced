
package com;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Atmfrom {
    private JPanel mainPanel;

    public Atmfrom() {
        确定Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Atmfrom");
        frame.setContentPane(new Atmfrom().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JLabel bgjJabel;
    private JTextField textField1;
    private JTextField textField2;
    private JButton 确定Button;

}
