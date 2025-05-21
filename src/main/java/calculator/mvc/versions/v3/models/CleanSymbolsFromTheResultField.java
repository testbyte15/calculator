package calculator.mvc.versions.v3.models;
import calculator.mvc.versions.v3.commands.Clean;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CleanSymbolsFromTheResultField implements ActionListener {
    private JTextField resultField;

    public CleanSymbolsFromTheResultField() {}

    public CleanSymbolsFromTheResultField(JTextField resultField) {
        this.resultField = resultField;
    }

    public void setResultField(JTextField resultField) {
        this.resultField = resultField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new Clean(e, resultField).execute();
    }
}
