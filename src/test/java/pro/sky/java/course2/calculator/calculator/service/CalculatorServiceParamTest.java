package pro.sky.java.course2.calculator.calculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class CalculatorServiceParamTest {

    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    public static Stream<Arguments> provideParamsForSumTests() {
        return Stream.of(
                Arguments.of(-1, 5, 4),
                Arguments.of(-1, 1, 0),
                Arguments.of(5, 5, 10),
                Arguments.of(0, 4, 4)
        );
    }

    public static Stream<Arguments> provideParamsForMinusTests() {
        return Stream.of(
                Arguments.of(-1, 5, -6),
                Arguments.of(-1, 1, -2),
                Arguments.of(5, 5, 0),
                Arguments.of(0, 4, -4)
        );
    }

    public static Stream<Arguments> provideParamsForMultiplyTests() {
        return Stream.of(
                Arguments.of(-1, 5, -5),
                Arguments.of(-1, 1, -1),
                Arguments.of(5, 5, 25),
                Arguments.of(0, 4, 0)
        );
    }

    public static Stream<Arguments> provideParamsForDivideTests() {
        return Stream.of(
                Arguments.of(-1, 5, (float) -0.2),
                Arguments.of(-1, 1, -1),
                Arguments.of(5, 5, 1),
                Arguments.of(0, 4, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForSumTests")
    public void shouldReturnCorrectSum(int num1, int num2, int result) {
        Assertions.assertEquals(out.getSum(num1, num2), result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMinusTests")
    public void shouldReturnCorrectMinus(int num1, int num2, int result) {
        Assertions.assertEquals(out.getMinus(num1, num2), result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMultiplyTests")
    public void shouldReturnCorrectMultiply(int num1, int num2, int result) {
        Assertions.assertEquals(out.getMultiply(num1, num2), result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForDivideTests")
    public void shouldReturnCorrectDivide(int num1, int num2, float result) {
        Assertions.assertEquals(out.getDivide(num1, num2), result);
    }
}