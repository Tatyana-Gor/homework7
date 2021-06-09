package lesson7;

import lesson7.view.IUserInterface;
import lesson7.view.UserInterface;

public class Main {
    public static void main(String[] args) {
        IUserInterface userInterface = new UserInterface();
        userInterface.showUI();
    }
}