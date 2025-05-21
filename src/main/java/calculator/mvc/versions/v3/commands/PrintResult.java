package calculator.mvc.versions.v3.commands;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class PrintResult implements Comand {
    private JTextField resultField;
    private String result;

    public PrintResult(String result, JTextField resultField) {
        this.result = result;
        this.resultField = resultField;
    }
    @Override
    public void execute() {
        resultField.setText(result);
    }
}
