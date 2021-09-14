package com.company;

import java.awt.*;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
//        TicTacFrame ticTacFrame = new TicTacFrame();
//        ticTacFrame.setVisible(true);
//        UserInterface ui = new ConsoleInterface();
//        View v = ui.getView();
//        Controller c =ui.getController();
//
//        int[][] mtr = new int[5][4];
//        v.showMessage("Введите х у");
//        Point p = c.reedUserMove();
//        mtr[p.x][p.y]=1;
//        v.showBorder(mtr);
////        Scanner s = new Scanner(ticTacFrame.);
        Game game = new Game(new UserInterfaceJFrame());

        while (true)
        {
            game.game();
        }// 8 ЧАСОВ НЕ ЗРЯ!(НУ ПОЧТИ)





    }
}
