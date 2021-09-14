package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExAction implements ActionListener {

    Point point = null;

    public ExAction(){

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton src = (JButton) e.getSource();
        String s[] = src.getName().split(" ");

        point=new Point(Integer.parseInt(s[0]),Integer.parseInt(s[1]));


    }
}
