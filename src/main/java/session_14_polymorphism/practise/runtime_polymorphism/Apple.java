package session_14_polymorphism.practise.runtime_polymorphism;

public class Apple extends Fruit {

    @Override
    public String taste() {
        return "apple tastes sweet";
    }

    @Override
    public String colour() {
        return "apple is red";
    }
}
