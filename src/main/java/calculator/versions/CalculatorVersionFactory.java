package calculator.versions;

import calculator.versions.v1.CalculatorController;

public interface CalculatorVersionFactory {
    CalculatorController createController();
}
