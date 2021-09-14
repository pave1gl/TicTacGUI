package com.company;

public class UserInterface_ViewConsole_ControllerJFrame extends UserInterface{
    TicTacFrame ticTacFrame;
    UserInterface_ViewConsole_ControllerJFrame(){
        view= new ConsoleView();
        ticTacFrame = new TicTacFrame();
        controller=new ControllerJFrame(ticTacFrame.gf.ex);
        ticTacFrame.setVisible(true);
    }

}
