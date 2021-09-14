package com.company;

import java.awt.*;
import java.util.Random;


public class Game {
    Random random;
    Player player1;
    Player player2;
    Board board;
    View view;
    Controller controller;
    public boolean humanTurn;
    public Game(UserInterface ui) {
        random = new Random();
        view=ui.getView();
        controller=ui.getController();

    }
    private void init(){
        board = new BoardClassic3x3();
        int x = random.nextInt(2);
        if(x==1) {
            player1 = new PlayerComputerRandom(1,"playerComputer");
            player2 = new PlayerHuman(2,"playerHuman",controller);
        }
        else{
            player1 = new PlayerHuman(1,"playerHuman",controller);;
            player2 = new PlayerComputerRandom(2,"playerComputer");
        }
    }



    void game() {
        init();
        view.showBorder(board.getStateMat());
        while (true) {
            nexTurn(player1);
            view.showBorder(board.getStateMat());
            if(board.checkWin(player1.sign)){
                view.showMessage(player1.name+" Wins!");
                break;
            }
            else if (board.isTableFull()){
                view.showMessage("Draw");
                break;
            }
            else {
                Player tmp = player1;
                player1=player2;
                player2=tmp;

            }


        }



    }
    void nexTurn(Player player){
        Point p;
        while(true){
            p = player.makeMoveTo(board.getStateMat());
           if(p!=null)
            if(board.writeSign(p, player.sign)) break;
       }
    }

}
