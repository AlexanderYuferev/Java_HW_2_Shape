package com.company;
public class Main{
    public static void main(String[] args) {

        Circle   circle_1   = new Circle(5.0, "blue");
        Ellipse  ellipse_1  = new Ellipse(7.0, 3.2, "orange");
        Square   square_1   = new Square(4.5, "black");
        Triangle triangle_1 = new Triangle(5.5, 3.4, 6, "green");

        System.out.println("circle_1.gatArea() = " + circle_1.getArea());
        System.out.println("circle_1.toString() = " + circle_1.toString() + "\n");

        System.out.println("ellipse_1.gatArea() = " + ellipse_1.getArea());
        System.out.println("ellipse_1.toString() = " + ellipse_1.toString() + "\n");

        System.out.println("square_1.gatArea() = " + square_1.getArea());
        System.out.println("square_1.toString() = " + square_1.toString() + "\n");

        System.out.println("triangle_1.gatArea() = " + triangle_1.getArea());
        System.out.println("triangle_1.toString() = " + triangle_1.toString() + "\n");
    }
}