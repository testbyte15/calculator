package calculator.operations;

public class CalculatorModel {
    protected Math operation;


    public CalculatorModel setOperation(Math operation) {
        this.operation = operation;
        return this;
    }

    public double performOperation(double a, double b) {
        return operation.execute(a, b);
    }

}
