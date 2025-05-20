package calculator.mvc.versions.v1;

import calculator.mvc.versions.v1.operations.Math;

public class ModelV1 {
    protected Math operation;

    public ModelV1 setOperationVersionOne(Math operation) {
        this.operation = operation;
        return this;
    }

    public double performOperation(double a, double b) {
        return operation.execute(a, b);
    }
}
