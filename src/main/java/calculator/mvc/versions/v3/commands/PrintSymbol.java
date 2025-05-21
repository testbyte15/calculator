package calculator.mvc.versions.v3.commands;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class PrintSymbol implements Comand {
    private JTextField resultField;
    private String symbol;

    public PrintSymbol(ActionEvent e, JTextField resultField) {
        this.symbol = ((JButton) e.getSource()).getText();
        this.resultField = resultField;
    }
    @Override
    public void execute() {
        resultField.setText(resultField.getText() + symbol);
    }
}
