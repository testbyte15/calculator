package calculator.window.menu.commands;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CommandActionListener implements ActionListener {
    private Command command;

    public CommandActionListener(Command command) {
        this.command = command;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        command.execute();
    }
}
