package calculator.mvc.versions.v3;

import calculator.window.SingletonFrame;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ViewV3 {
    private JFrame frame;
    private JTextField resultField;
    private ArrayList<JButton> buttons = new ArrayList<>();

    public ViewV3() {
        this.frame = SingletonFrame.getInstance().getFrame();
        frame.setLayout(new GridBagLayout());
        frame.getContentPane().setBackground(new Color(245, 245, 250)); // Світло-сірий фон

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);

        // Результат
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weighty = 0.2;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        resultField = new JTextField();
        resultField.setEditable(false);
        resultField.setFont(new Font("Segoe UI", Font.PLAIN, 26));
        resultField.setBackground(new Color(255, 255, 255));
        resultField.setForeground(Color.DARK_GRAY);
        resultField.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(180, 180, 180), 2),
                BorderFactory.createEmptyBorder(10, 10, 10, 10)
        ));
        frame.add(resultField, gbc);

        // Кнопки
        JPanel buttonPanel = new JPanel(new GridLayout(4, 4, 8, 8));
        buttonPanel.setBackground(new Color(245, 245, 250));

        String[] buttonLabels = {
                "7", "8", "9", "+",
                "4", "5", "6", "-",
                "1", "2", "3", "*",
                "0", "=", "C", "/"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Segoe UI", Font.BOLD, 18));
            button.setFocusPainted(false);
            button.setBackground(new Color(230, 230, 250)); // Світло-фіолетовий
            button.setForeground(new Color(50, 50, 50));
            button.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 220)));
            button.setCursor(new Cursor(Cursor.HAND_CURSOR));

            // Акцентні кольори
            if (label.equals("=")) {
                button.setBackground(new Color(100, 149, 237)); // Cornflower Blue
                button.setForeground(Color.WHITE);
            } else if (label.equals("C")) {
                button.setBackground(new Color(255, 99, 71)); // Tomato
                button.setForeground(Color.WHITE);
            }

            buttons.add(button);
            buttonPanel.add(button);
        }

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1;
        gbc.weighty = 0.8;
        gbc.fill = GridBagConstraints.BOTH;
        frame.add(buttonPanel, gbc);
    }

    public ArrayList<JButton> getButtons() {
        return buttons;
    }

    public JTextField getResultField() {
        return resultField;
    }
}
