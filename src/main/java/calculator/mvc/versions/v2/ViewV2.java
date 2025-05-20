package calculator.mvc.versions.v2;

import calculator.window.SingletonFrame;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class ViewV2 {
    private JFrame frame;
    private JTextField resultField;
    private Map<String, JButton> buttons;

    public ViewV2() {
        this.frame = SingletonFrame.getInstance().getFrame();
        frame.setLayout(new GridBagLayout());
        Container pane = frame.getContentPane();

        buttons = new HashMap<>();

        GridBagConstraints mainGbc = new GridBagConstraints();
        mainGbc.insets = new Insets(5, 5, 5, 5);
        mainGbc.fill = GridBagConstraints.BOTH;
        mainGbc.weightx = 1.0;
        mainGbc.weighty = 1.0;

        resultField = new JTextField();
        resultField.setEditable(false);
        resultField.setFont(new Font("Arial", Font.PLAIN, 24));
        resultField.setHorizontalAlignment(JTextField.RIGHT);
        resultField.setBackground(Color.WHITE);
        resultField.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        mainGbc.gridx = 0;
        mainGbc.gridy = 0;
        mainGbc.gridwidth = 2;
        pane.add(resultField, mainGbc);

        JPanel buttonPanel = new JPanel(new GridLayout(4, 4, 5, 5));
        String[] buttonLabels = {
                "7", "8", "9", "+",
                "4", "5", "6", "-",
                "1", "2", "3", "*",
                "0", "=", "C", "/"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.BOLD, 18));
            buttons.put(label, button);
            buttonPanel.add(button);
        }

        mainGbc.gridx = 0;
        mainGbc.gridy = 1;
        mainGbc.gridwidth = 2;
        pane.add(buttonPanel, mainGbc);
    }

    public JTextField getResultField() {
        return resultField;
    }

    public JButton getButton(String label) {
        return buttons.get(label);
    }

    public Map<String, JButton> getAllButtons() {
        return buttons;
    }
}
