package calculator.mvc.versions.v2;


import javax.swing.*;
import java.util.Map;

public class ControllerV2 {
    protected ModelV2 model;
    protected ViewV2 view;

    public ControllerV2(ModelV2 model, ViewV2 view) {
        this.model = model;
        this.view = view;

        StringBuilder input = new StringBuilder();
        for (Map.Entry<String, JButton> entry : view.getAllButtons().entrySet()) {
            String label = entry.getKey();
            JButton button = entry.getValue();
            if (label.matches("\\d")) {
                button.addActionListener(e -> {
                    input.append(label);
                    view.getResultField().setText(input.toString());
                });
            }  else if (label.matches("[+\\-*/]")) {
                button.addActionListener(e -> {
                    if (input.length() > 0) {
                        input.append(label);
                        view.getResultField().setText(input.toString());
                    }
                });
            } else if (label.equals("C")) {
                button.addActionListener(e -> {
                    input.setLength(0);
                    view.getResultField().setText("");
                });
            }else if (label.equals("=")) {
                button.addActionListener(e -> {
                    String expression = view.getResultField().getText();
                    expression = expression.replaceAll("\\s+", "");
                    java.util.List<String> tokens = new java.util.ArrayList<>();
                    StringBuilder number = new StringBuilder();
                    char prevOp = '+';
                    for (int i = 0; i < expression.length(); i++) {
                        char c = expression.charAt(i);
                        if (c == '+' || c == '-') {
                            tokens.add(prevOp + number.toString());
                            number.setLength(0);
                            prevOp = c;
                        } else {
                            number.append(c);
                        }
                    }
                    tokens.add(prevOp + number.toString());

                    double result = 0.0;
                    for (String token : tokens) {
                        result += evaluateMulDiv(token);
                    }

                    view.getResultField().setText(String.valueOf(result));
                });
            }
        }
    }

    private static double evaluateMulDiv(String expression) {
        java.util.List<Double> numbers = new java.util.ArrayList<>();
        java.util.List<Character> ops = new java.util.ArrayList<>();

        StringBuilder number = new StringBuilder();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '*' || c == '/') {
                numbers.add(Double.parseDouble(number.toString()));
                number.setLength(0);
                ops.add(c);
            } else {
                number.append(c);
            }
        }
        numbers.add(Double.parseDouble(number.toString()));

        // Обчислюємо результат множення і ділення
        double result = numbers.get(0);
        for (int i = 0; i < ops.size(); i++) {
            if (ops.get(i) == '*') {
                result *= numbers.get(i + 1);
            } else {
                result /= numbers.get(i + 1);
            }
        }
        return result;
    }
}
