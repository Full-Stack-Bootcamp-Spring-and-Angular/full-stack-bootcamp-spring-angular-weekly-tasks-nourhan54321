package com.example1;

public class CircleShape implements Shape {

    @Override
    public void getArea(double x) {
        double area = 3.14 *x*x;
        System.out.println("area of circle is"+area);
    }
    
}
