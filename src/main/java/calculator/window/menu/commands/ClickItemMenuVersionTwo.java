package calculator.window.menu.commands;

import calculator.mvc.versions.v1.ControllerV1;
import calculator.mvc.versions.v1.ModelV1;
import calculator.mvc.versions.v1.ViewV1;
import calculator.mvc.versions.v2.ControllerV2;
import calculator.mvc.versions.v2.ModelV2;
import calculator.mvc.versions.v2.ViewV2;
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
        new ControllerV2(new ModelV2(), new ViewV2());
    }
}
