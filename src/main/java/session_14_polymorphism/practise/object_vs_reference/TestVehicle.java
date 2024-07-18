package session_14_polymorphism.practise.object_vs_reference;

public class TestVehicle {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle truck = new Truck();
//ctrl-alt-B-->go to method implementations
        System.out.println(car.fueltype());
        System.out.println(truck.fueltype());
//explicit casting
        Car anotherVehicle =(Car)car;
    }
}
