package com.company;
import java.awt.*;
import javax.swing.*;

public class UserInterfaceJFrame extends UserInterface{
    TicTacFrame ticTacFrame = new TicTacFrame();

    public UserInterfaceJFrame(){
        view=new ViewJFrame(ticTacFrame.gf);
        controller=new ControllerJFrame(ticTacFrame.gf.ex);
        ticTacFrame.setVisible(true);
    }




}
class EndGameDialog extends JDialog {
    public EndGameDialog(final String caption, final String outcome){
        setTitle(caption);
        setSize(100, 100);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JPanel p = new JPanel();
        p.add(new JLabel(outcome));
        JButton close = new JButton("Выход");
        close.addActionListener(actionEvent -> dispose());
        p.add(close);
        add(p);
    }
}
