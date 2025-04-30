package calculator.window.menu;

import calculator.window.SingletonFrame;
import calculator.window.menu.commands.Command;
import calculator.window.menu.items.Menu;

import javax.swing.*;

public class BarMenu {
    private final JMenuBar menuBar;
    private final JFrame frame;
    private Menu menu;


    public BarMenu() {
        frame = SingletonFrame.getInstance().getFrame();
        menuBar = SingletonFrame.getInstance().getMenuBar();
    }

    public void setBarMenu(){
        frame.setJMenuBar(menuBar);
    }

    public void setMenu(Menu menu){
        this.menu = menu;
    }

    public void addItemToMenu(String name, Command command){
        menu.add(name, command);
    }

}
