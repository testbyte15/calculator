package calculator.window.menu.items;

import calculator.window.SingletonFrame;
import calculator.window.menu.commands.Command;
import calculator.window.menu.commands.CommandActionListener;

import javax.swing.*;

public class VersionMenu implements Menu {

    private final JMenu menu;

    public VersionMenu() {
        menu = new JMenu("Versions");
        SingletonFrame.getInstance().getMenuBar().add(menu);
    }

    public void add(String name, Command command){
        JMenuItem item = new JMenuItem(name);
        item.addActionListener(new CommandActionListener(command));
        menu.add(item);
    }
}
