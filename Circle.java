package com.cognizant.shapes;

public class Circle {
    private float radius; // Access restricted to class level
    float pi; // Package level access

    private Circle() { // Access restricted to class level
        this(1.5f);
    }

    Circle(float radius) { // Package level access
        this(radius, 3.5f);
    }

    public Circle(float radius, float pi) {
        this.radius = radius;
        this.pi = pi;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getPi() {
        return pi;
    }

    public void setPi(float pi) {
        this.pi = pi;
    }
    public static void main(String[] args) {
        Circle circle1 = new Circle(); // Constructor 1 not accessible outside Circle class
        Circle circle2 = new Circle(2.0f); // Constructor 2 accessible only within com.cognizant.shapes package
        Circle circle3 = new Circle(3.0f, 3.14f); // Constructor 3 accessible to all classes

        circle1.setRadius(1.0f); // Access restricted to class level
        System.out.println("Circle 1 radius: " + circle1.getRadius()); // Access restricted to class level

        circle2.setPi(3.0f); // Package level access
        System.out.println("Circle 2 radius: " + circle2.getRadius()); // Package level access
        System.out.println("Circle 2 pi: " + circle2.getPi()); // Package level access

        System.out.println("Circle 3 radius: " + circle3.getRadius()); // Accessible to all classes
        System.out.println("Circle 3 pi: " + circle3.getPi()); // Accessible to all classes
    }

}
