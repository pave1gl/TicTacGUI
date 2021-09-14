package com.company;

import java.awt.*;

public abstract class Player {
    int sign;
    String name;
    public Player(int _sign, String _name){
        sign=_sign;
        name=_name;
    }
    public abstract Point makeMoveTo(int[][] mtr);
}
