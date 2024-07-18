package session_14_polymorphism.practise.compiletime_polymorphism;

public class Geometry {
    public double circleArea(double radius){
        return Math.PI * radius;
    }
    public double triangleArea (double base, double height){
        return base*height*0.5;
    }
}
