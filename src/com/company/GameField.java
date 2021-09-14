package com.company;
import javax.swing.*;
import java.awt.*;

public class GameField extends JPanel {
    public JButton[][] buttons;
    int sizeX,sizeY;
    ExAction ex = new ExAction();
    public GameField(int sizeX,int sizeY){
        this.sizeX=sizeX;
        this.sizeY=sizeY;
        init();
    }
    public void init(){
        this.setLayout(new GridLayout(sizeX,sizeY));
        buttons = new JButton[sizeX][sizeY];

        for(int i = 0; i<sizeX;i++)
        {
            for(int j = 0; j<sizeY;j++)
            {
                buttons[i][j]=new JButton("|   |");
                buttons[i][j].setFont(new Font("1",1,26));
                buttons[i][j].setName(i+" "+j);
                buttons[i][j].addActionListener(ex);
                add(buttons[i][j]);
            }
        }
    }



    public void setState(int[][] s){
        String c;

        for(int i = 0; i<sizeX;i++) {
            for (int j = 0; j < sizeY; j++) {
                if (s[i][j] == 0) c = " ";
                else if (s[i][j] == 1) c = "X";
                else c = "O";
                buttons[i][j].setText(c);
            }
        }
    }

    public void clear(){
        for(int i = 0; i<sizeX;i++) {
            for (int j = 0; j < sizeY; j++) {

                buttons[i][j].setText("_");

            }
        }
    }

}
