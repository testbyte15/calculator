package calculator.window.menu.commands;

import calculator.window.SingletonFrame;

import javax.swing.*;

public class ClickItemMenuVersionTwo implements Command {
    private JFrame frame;

    public ClickItemMenuVersionTwo() {
        this.frame = SingletonFrame.getInstance().getFrame();
    }

    @Override
    public void execute() {
        frame.getContentPane().removeAll();
        frame.getContentPane().revalidate();
        frame.getContentPane().repaint();
    }
}
