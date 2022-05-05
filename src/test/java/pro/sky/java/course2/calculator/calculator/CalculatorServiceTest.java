package pro.sky.java.course2.calculator.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.java.course2.calculator.calculator.service.CalculatorServiceImpl;

public class CalculatorServiceTest {

    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenNum2IsNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> out.getDivide(1, 0));
    }

    @Test
    public void ShouldReturnCorrectSum() {
        int num1 = -1;
        int num2 = 5;
        int sum = num1 + num2;
        Assertions.assertEquals(out.getSum(num1, num2), sum);
    }

    @Test
    public void sumShouldNotBeNull() {
        Assertions.assertNotNull(out.getSum(5, 5));
    }

    @Test
    public void shouldReturnCorrectMinus() {
        int num1 = -1;
        int num2 = 1;
        int minus = num1 - num2;
        Assertions.assertEquals(out.getMinus(num1, num2), minus);
    }

    @Test
    public void minusShouldNotBeNull() {
        Assertions.assertNotNull(out.getMinus(5, 5));
    }

    @Test
    public void shouldReturnCorrectMultiply() {
        int num1 = -1;
        int num2 = 5;
        int multiply = num1 * num2;
        Assertions.assertEquals(out.getMultiply(num1, num2), multiply);
    }

    @Test
    public void multiplyShouldNotBeNull() {
        Assertions.assertNotNull(out.getMultiply(0, 4));
    }

    @Test
    public void shouldReturnCorrectDivide() {
        int num1 = -1;
        int num2 = 5;
        float divide = (float) num1 / num2;
        Assertions.assertEquals(out.getDivide(num1, num2), divide);
    }

    @Test
    public void divideShouldNotBeNull() {
        Assertions.assertNotNull(out.getDivide(0, 4));
    }
}
