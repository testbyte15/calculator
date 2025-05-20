package calculator.mvc.versions.v1.operations;

public class MinusNumbers implements Math {
    @Override
    public double execute(double a, double b) {
        return a - b;
    }
}
