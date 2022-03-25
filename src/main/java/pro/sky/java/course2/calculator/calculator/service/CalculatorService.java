package pro.sky.java.course2.calculator.calculator.service;

public interface CalculatorService {
    String getWelcome();

    int getSum(int num1, int num2);

    int getMinus(int num1, int num2);

    int getMultiply(int num1, int num2);

    float getDivide(int num1, int num2);
}
