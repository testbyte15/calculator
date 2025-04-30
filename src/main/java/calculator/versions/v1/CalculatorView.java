package calculator.versions.v1;

import calculator.window.SingletonFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalculatorView {

    private JButton multipleButton;
    private JButton divideButton;
    private JFrame frame;
    private JTextField textField1;
    private JTextField textField2;
    private JButton addButton;
    private JButton minusButton;
    private JLabel resultLabel;

    public CalculatorView(){
        this.frame = SingletonFrame.getInstance().getFrame();
        Container pane = frame.getContentPane();
        pane.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;

        textField1 = new JTextField();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        pane.add(textField1, gbc);

        textField2 = new JTextField();
        gbc.gridx = 1;
        gbc.gridy = 0;
        pane.add(textField2, gbc);

        addButton = new JButton("+");
        gbc.gridwidth = 1;
        gbc.gridy = 1;
        gbc.gridx = 0;
        pane.add(addButton, gbc);

        minusButton = new JButton("-");
        gbc.gridwidth = 1;
        gbc.gridy = 1;
        gbc.gridx = 1;
        pane.add(minusButton, gbc);

        multipleButton = new JButton("*");
        gbc.gridwidth = 1;
        gbc.gridy = 2;
        gbc.gridx = 0;
        pane.add(multipleButton, gbc);

        divideButton = new JButton("/");
        gbc.gridwidth = 1;
        gbc.gridy = 2;
        gbc.gridx = 1;
        pane.add(divideButton, gbc);

        resultLabel = new JLabel("Result: ");
        resultLabel.setHorizontalAlignment(SwingConstants.CENTER);
        gbc.gridwidth = 2;
        gbc.gridx = 0;
        gbc.gridy = 3;
        pane.add(resultLabel, gbc);
    }

    public String getFirstNumber() {
        return textField1.getText();
    }

    public String getSecondNumber() {
        return textField2.getText();
    }

    public void setResult(String result) {
        resultLabel.setText("Result: " + result);
    }

    public void listenerForAdd(ActionListener listener) {addButton.addActionListener(listener);}

    public void listenerForMinus(ActionListener listener) {
        minusButton.addActionListener(listener);
    }

    public void listenerForMultiple(ActionListener listener) {
        multipleButton.addActionListener(listener);
    }

    public void listenerForDivide(ActionListener listener) {
        divideButton.addActionListener(listener);
    }

    public void show() {
        frame.setVisible(true);
    }
}
