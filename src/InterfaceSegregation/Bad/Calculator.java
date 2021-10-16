package InterfaceSegregation.Bad;

import InterfaceSegregation.Polynomial;

public interface Calculator {
    int add(int a, int b);
    int subtract(int a, int b);
    int multiply(int a, int b);
    int divide(int a, int b);
    void drawFunction(Polynomial f);
}
