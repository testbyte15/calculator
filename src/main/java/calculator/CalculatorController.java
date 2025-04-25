package calculator;

import calculator.operations.*;
import calculator.operations.Math;

public class CalculatorController {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;

        view.listenerForAdd(e -> handleOperation(new AddNumbers()));
        view.listenerForMinus(e -> handleOperation(new MinusNumbers()));
        view.listenerForDivide(e -> handleOperation(new DivideNumbers()));
        view.listenerForMultiple(e -> handleOperation(new MultipleNumbers()));
    }

    private void handleOperation(Math operation) {
        double result = model.setOperation(operation).performOperation(Double.parseDouble(view.getFirstNumber()), Double.parseDouble(view.getSecondNumber()));
        view.setResult(String.valueOf(result));
    }

    public void start() {
        view.show();
    }
}
