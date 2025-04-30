package calculator.window.menu.commands;

import calculator.versions.v1.CalculatorVersionOneFactory;
import calculator.window.SingletonFrame;
import calculator.versions.v1.CalculatorController;
import calculator.versions.v1.CalculatorView;
import calculator.versions.v1.operations.CalculatorModel;

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

        new CalculatorVersionOneFactory().createController();
    }
}
