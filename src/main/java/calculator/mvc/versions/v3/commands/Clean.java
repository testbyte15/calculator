package calculator.mvc.versions.v3.commands;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Clean implements Comand {
    private JTextField resultField;
    private ActionEvent e;

    public Clean(ActionEvent e, JTextField resultField) {
        this.e = e;
        this.resultField = resultField;
    }

    @Override
    public void execute() {
        resultField.setText("");
    }
}
