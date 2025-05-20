package calculator.window.menu.commands;

import calculator.mvc.versions.v1.ControllerV1;
import calculator.mvc.versions.v1.ModelV1;
import calculator.mvc.versions.v1.ViewV1;
import calculator.window.SingletonFrame;

import javax.swing.*;

public class ClickItemMenuVersionOne implements Command {
    private JFrame frame;

    public ClickItemMenuVersionOne() {
        this.frame = SingletonFrame.getInstance().getFrame();
    }

    @Override
    public void execute() {
        frame.getContentPane().removeAll();
        frame.getContentPane().revalidate();
        frame.getContentPane().repaint();

        new ControllerV1(new ModelV1(), new ViewV1());
    }
}
