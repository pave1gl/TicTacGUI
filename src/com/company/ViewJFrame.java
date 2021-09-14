package com.company;
import com.company.View;

import javax.swing.*;

public class ViewJFrame extends View {
    GameField gameField;

    ViewJFrame(GameField gameField){
        this.gameField=gameField;
    }

    public void showMessage(String s) {
        EndGameDialog endGameDialog =new EndGameDialog("ms",s);
        endGameDialog.setVisible(true);
    }


    public void showBorder(int[][] board) {
        gameField.setState(board);

    }
}
