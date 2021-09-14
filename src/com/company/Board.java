package com.company;

import java.awt.*;

public abstract class Board {

protected int[][] mtr;
int turn=0;

    public Board() {

    }

    public Board(int[][] _mtr) {

    }

    public boolean writeSign(Point p, int _sign){
        if(mtr[p.x][p.y]==0 && checkODZ(p)){
            mtr[p.x][p.y]=_sign;
            return true;
        }
        else return false;

    }
    protected abstract boolean checkODZ(Point p);
    public abstract boolean checkWin(int sign);
    public abstract boolean isTableFull();

    public int[][] getStateMat(){
            return mtr.clone();
        }
}

