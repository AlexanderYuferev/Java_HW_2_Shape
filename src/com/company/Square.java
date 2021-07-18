package com.company;
class Square implements Shape {

    double a;
    String color;

    public Square()                       { this.a = 1;           this.color = "red"; }
    public Square(double a)               { this.a = Math.abs(a); this.color = "red"; }
    public Square(double a, String color) { this.a = Math.abs(a); this.color = color; }

    public double getLengthSide() { return this.a; }
    public void setLengthSide(double a)  { this.a = Math.abs(a); }

    public String getColor()    { return this.color; }
    public void setColor(String color) { this.color = color; }

    @Override
    public double getArea()  { return this.a * this.a; }
    @Override
    public String toString() { return "Square [a = " + this.a +
                                       " , color = " + this.color + "]"; }
}
