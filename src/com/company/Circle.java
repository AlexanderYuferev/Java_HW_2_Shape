package com.company;
class Circle implements Shape {

    double radius;
    String color;

    public Circle()                            { this.radius = 1;                this.color = "red"; }
    public Circle(double radius)               { this.radius = Math.abs(radius); this.color = "red"; }
    public Circle(double radius, String color) { this.radius = Math.abs(radius); this.color = color; }

    public double getRadius()      { return this.radius; }
    public void setRadius(double radius)  { this.radius = Math.abs(radius); }

    public String getColor()    { return this.color; }
    public void setColor(String color) { this.color = color; }

    @Override
    public double getArea()  {
        return 2 * 3.14159 * this.radius * this.radius;
    }
    @Override
    public String toString() {
        return "Circle [radius = " + this.radius +
                     " , color = " + this.color + "]"; }
}