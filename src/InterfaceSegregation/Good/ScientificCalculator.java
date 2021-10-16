package InterfaceSegregation.Good;

import InterfaceSegregation.Polynomial;

public class ScientificCalculator implements ISimpleCalculator, IGraphing {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public int divide(int a, int b) {
        return a / b;
    }

    @Override
    public void drawFunction(Polynomial f) {
        System.out.println("Drawing function...");
    }
}
