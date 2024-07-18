package session_14_polymorphism.practise.runtime_polymorphism;

public class Orange extends Fruit{
    @Override
    public String taste() {
        return "orange is sour";
    }

    @Override
    public String colour() {
        return "orange is portocalie";
    }
}
