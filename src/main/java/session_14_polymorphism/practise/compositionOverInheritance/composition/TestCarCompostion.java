package session_14_polymorphism.practise.compositionOverInheritance.composition;

public class TestCarCompostion {
    public static void main(String[] args) {
        Engine carEngine =new Engine();
        Car car = new Car(carEngine);
        car.carStart();
    }
}
