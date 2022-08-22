import java.util.stream.DoubleStream;

public class Calculator {

    static double add(double... operands) {
        return DoubleStream.of(operands)
                .sum();
    }

    static double multiply(double... operands) {
        return DoubleStream.of(operands)
                .reduce(1, (a, b) -> a * b);
    }

    static double multiplyInAdd(double... operands) {
        return add(
                DoubleStream.of(operands).reduce(1, (a, b) -> a * b),
                2);
    }
}