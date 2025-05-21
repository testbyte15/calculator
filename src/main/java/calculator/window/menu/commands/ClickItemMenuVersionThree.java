package calculator.window.menu.commands;

import calculator.mvc.versions.v3.ControllerV3;
import calculator.mvc.versions.v3.ViewV3;
import calculator.window.SingletonFrame;

import javax.swing.*;

public class ClickItemMenuVersionThree implements Command {
    private JFrame frame;

    public ClickItemMenuVersionThree() {
        this.frame = SingletonFrame.getInstance().getFrame();
    }

    @Override
    public void execute() {
        frame.getContentPane().removeAll();
        frame.getContentPane().revalidate();
        frame.getContentPane().repaint();

        new ControllerV3(new ViewV3());
    }
}
