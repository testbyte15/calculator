package calculator.versions.v1;

import calculator.versions.CalculatorVersionFactory;
import calculator.versions.v1.operations.CalculatorModel;

public class CalculatorVersionOneFactory implements CalculatorVersionFactory {
    @Override
    public CalculatorController createController() {
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        return new CalculatorController(model, view);
    }
}
