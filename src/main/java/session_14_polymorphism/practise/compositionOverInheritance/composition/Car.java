package session_14_polymorphism.practise.compositionOverInheritance.composition;

public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }
    void carStart(){engine.engineStart();}
    //Car HAS-A(n) Engine


}
