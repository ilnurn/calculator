package pro.sky.java.course2.calculator.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String getWelcome() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public int getSum(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int getMinus(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int getMultiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public float getDivide(int num1, int num2) {
        return (float) num1 / num2;
    }
}
