package calculator.mvc.versions.v3.models;

import calculator.mvc.versions.v3.commands.PrintSymbol;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrintSymbolToTheResultField implements ActionListener {
    private JTextField resultField;

    public PrintSymbolToTheResultField() {}

    public PrintSymbolToTheResultField(JTextField resultField) {
        this.resultField = resultField;
    }

    public void setResultField(JTextField resultField) {
        this.resultField = resultField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new PrintSymbol(e, resultField).execute();
    }
}
