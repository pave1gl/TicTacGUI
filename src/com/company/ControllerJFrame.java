package com.company;

import java.awt.*;

public class ControllerJFrame extends Controller{
    Point lastPoint = null;
    ExAction ex;
    ControllerJFrame(ExAction ex){
        this.ex=ex;
    }

    public Point reedUserMove() {

        if(ex.point==null){
            return null;
        }
        Point p = (Point) ex.point.clone();
        ex.point=null;
        return p;
    }
}
