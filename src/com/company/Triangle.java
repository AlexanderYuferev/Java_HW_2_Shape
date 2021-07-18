package com.company;
class Triangle implements Shape {

    double a;
    double b;
    double c;
    String color;

    public Triangle() {
        this.a = 1;
        this.b = 1;
        this.c = 1;
        this.color = "red";
    }
    public Triangle(double a) {
        this.a = Math.abs(a);
        this.b = 1;
        this.c = 1;
        this.color = "red";
    }
    public Triangle(double a, double b, String color) {
        this.a = Math.abs(a);
        this.b = Math.abs(b);
        this.c = 1;
        this.color = "red";
    }
    public Triangle(double a, double b, double c, String color) {
        this.a = Math.abs(a);
        this.b = Math.abs(b);
        this.c = Math.abs(c);
        this.color = "red";
    }

    public double getLengthSideA()  { return this.a; }
    public void   setLengthSideA(double a) { this.a = Math.abs(a); }

    public double getLengthSideB()  { return this.b; }
    public void   setLengthSideB(double b) { this.b = Math.abs(b); }

    public double getLengthSideC()  { return this.c; }
    public void   setLengthSideC(double c) { this.c = Math.abs(c); }

    public String getColor()      { return this.color; }
    public void   setColor(String color) { this.color = color; }

    @Override
    public double getArea() {
        double p = (this.a + this.b + this.c)/2;
        double S = Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
        return S;
    }
    @Override
    public String toString() {
        return "Triangle [a = " + this.a +
                       ", b = " + this.b +
                       ", c = " + this.c +
                  " , color = " + this.color + "]"; }
}

