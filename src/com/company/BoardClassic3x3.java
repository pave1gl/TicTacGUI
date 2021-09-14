package com.company;

import java.awt.*;

public class BoardClassic3x3 extends Board {

    public BoardClassic3x3()
    {
        super();
        mtr=new int[3][3];
    }


    public  boolean checkWin(int sign){
        boolean ans=false;
        for (int i = 0; i < 3; i++)
            if ((mtr[i][0] == sign && mtr[i][1] == sign &&
                    mtr[i][2] == sign) ||
                    (mtr[0][i] == sign && mtr[1][i] == sign &&
                            mtr[2][i] == sign))
                ans=true;
        if ((mtr[0][0] == sign && mtr[1][1] == sign &&
                mtr[2][2] == sign) ||
                (mtr[2][0] == sign && mtr[1][1] == sign &&
                        mtr[0][2] == sign))
            ans=true;

        return ans;
    }

    public boolean isTableFull() {
        boolean empty = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (mtr[i][j] == 0) empty = false;
            }
        }
        return empty;
    }





    protected boolean checkODZ(Point p){
        if (p.x<3 && p.x>=0 && p.y<3 && p.y>=0)
            return true;
        else
            return false;
    }

}
