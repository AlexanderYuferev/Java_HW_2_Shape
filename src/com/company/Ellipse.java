package com.company;
class Ellipse implements Shape {

    double a;
    double b;
    String color;

    public Ellipse() {
        this.a = 2;
        this.b = 1;
        this.color = "red";
    }
    public Ellipse(double a) {
        this.a = Math.abs(a);
        this.b = 1;
        this.color = "red";
    }
    public Ellipse(double a, double b, String color) {
        this.a = Math.abs(a);
        this.b = Math.abs(b);
        this.color = color;
    }

    public double getLengthLongAxis() { return this.a; }
    public void   setLengthLongAxis(double a) { this.a = Math.abs(a); }

    public double getLengthShortAxis()  { return this.b; }
    public void   setLengthShortAxis(double b) { this.b = Math.abs(b); }

    public String getColor()      { return this.color; }
    public void   setColor(String color) { this.color = color; }

    @Override
    public double getArea()  {
        return 3.14159 * this.a * this.b;
    }
    @Override
    public String toString() {
        return "Ellipse [a = " + this.a +
                      ", b = " + this.b +
                 " , color = " + this.color + "]"; }
}
