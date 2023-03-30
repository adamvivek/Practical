package com.cognizant.shapes;

public class Rectangle {
    private double length;
    private double breadth;
    
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    public void calculateArea() {
        double area = length * breadth;
        System.out.println("Area of rectangle is : " + area);
    }
}
