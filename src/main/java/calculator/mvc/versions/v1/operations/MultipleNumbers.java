package calculator.mvc.versions.v1.operations;

public class MultipleNumbers implements Math {
    @Override
    public double execute(double a, double b) {
        return a*b;
    }
}
