package com.company;

public class UserInterface_ViewJFrame_ControllerConsole extends UserInterface {
    TicTacFrame ticTacFrame = new TicTacFrame();

    public UserInterface_ViewJFrame_ControllerConsole(){
        view=new ViewJFrame(ticTacFrame.gf);
        controller=new ConsoleConrtoller();
        ticTacFrame.setVisible(true);
    }
}
