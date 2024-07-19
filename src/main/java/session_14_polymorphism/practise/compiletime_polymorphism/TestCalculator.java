package session_14_polymorphism.practise.compiletime_polymorphism;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(2,10);

        System.out.println(calculator.add(1,2,10));
    }
}
