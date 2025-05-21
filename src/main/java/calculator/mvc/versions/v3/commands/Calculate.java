package calculator.mvc.versions.v3.commands;

import org.mariuszgromada.math.mxparser.Expression;

import javax.swing.*;

public class Calculate implements Comand {
    private JTextField resultField;

    public Calculate(JTextField resultField) {
        this.resultField = resultField;
    }

    @Override
    public void execute() {
//        new PrintSymbol("", resultField).execute();
//        new PrintSymbol(String.valueOf(new Expression(resultField.getText().replaceAll("\\s+", "")).calculate()), resultField).execute();
        new PrintResult(String.valueOf(new Expression(resultField.getText().replaceAll("\\s+", "")).calculate()), resultField).execute();
//        resultField.setText(String.valueOf(new Expression(resultField.getText().replaceAll("\\s+", "")).calculate()));
    }
}
