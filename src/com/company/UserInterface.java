package com.company;

public abstract class UserInterface {
    View view;
    Controller controller;

    public View getView(){
        return view;
    }
    public Controller getController(){
        return controller;
    }

}
