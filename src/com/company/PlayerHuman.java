package com.company;

import java.awt.*;
import java.util.Scanner;

public class PlayerHuman extends Player {

    Controller controller;
    public PlayerHuman(int _sign,String name, Controller controller){
        super(_sign,name);
        this.controller=controller;
    }
    public Point makeMoveTo(int[][] mtr){




        return controller.reedUserMove(); // ЭТО РАБОТАЕТ ПО БОЖЕЙ ВОЛЕ, ПРОСТО

    }
}
