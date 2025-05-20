package calculator.mvc.versions.v1;


import calculator.mvc.versions.v1.operations.*;
import calculator.mvc.versions.v1.operations.Math;

public class ControllerV1 {
    protected ModelV1 model;
    protected ViewV1 view;

    public ControllerV1(ModelV1 model, ViewV1 view) {
        this.model = model;
        this.view = view;

        view.listenerForAdd(e -> handleOperation(new AddNumbers()));
        view.listenerForMinus(e -> handleOperation(new MinusNumbers()));
        view.listenerForDivide(e -> handleOperation(new DivideNumbers()));
        view.listenerForMultiple(e -> handleOperation(new MultipleNumbers()));
    }

    protected void handleOperation(Math operation) {
        double result = model.setOperationVersionOne(operation).performOperation(Double.parseDouble(view.getFirstNumber()), Double.parseDouble(view.getSecondNumber()));
        view.setResult(String.valueOf(result));
    }
}
