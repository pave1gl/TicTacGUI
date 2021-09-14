package com.company;

import java.awt.*;
import java.util.Random;

public class PlayerComputerRandom extends Player {

    Random random = new Random();

    public PlayerComputerRandom(int _sign,String name){
        super(_sign,name);
    }
    public Point makeMoveTo(int[][] mtr){

        int x, y;
        do {
            x = random.nextInt(mtr.length);
            y = random.nextInt(mtr[0].length);
        } while (mtr[x][y]!=0);
        return new Point(x,y);

    }
}
