package com.company;

public class ConsoleView extends View{


    public void showMessage(String s) {
        System.out.println(s);
    }


    public void showBorder(int[][] border) {

        char c;

        for (int row = 0; row < border.length; row++) {
            System.out.print("\n+");
            for (int k =0; k<border.length;k++) System.out.print("---+");
            System.out.print("\n");
            for (int col = 0; col < border[0].length; col++) {
                if (border[row][col] == 0) c = ' ';
                else if (border[row][col] == 1) c = 'X';
                else c = 'O';
                System.out.print("| " + c + " ");
            }
            System.out.print("|");
        }
        System.out.print("\n+");
        for (int k =0; k<border.length;k++) System.out.print("---+");
        System.out.println();
    }
}
