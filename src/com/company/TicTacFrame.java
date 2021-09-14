package com.company;

import javax.swing.*;
import java.awt.*;

public class TicTacFrame extends JFrame{
    GameField gf;
    public TicTacFrame(){
        setTitle("TicTac");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        // container.add(new AuthPanel(),BorderLayout.NORTH);
        gf=new GameField(3,3);
        container.add(gf,BorderLayout.CENTER);
    }
}
