package com.company;

import java.awt.*;
import java.util.Scanner;

public class ConsoleConrtoller extends Controller {
    Scanner console;
    public ConsoleConrtoller(){
        console = new Scanner(System.in);
    }

    public  Point reedUserMove(){
        Point p = new Point();
        p.x= console.nextInt()-1;
        p.y= console.nextInt()-1;
        return p;
    }
}
