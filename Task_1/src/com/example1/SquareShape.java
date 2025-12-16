package com.example1;

public class SquareShape implements Shape {
    @Override
    public void getArea(double x) {
        double area = x*x;
        System.out.println("area of square is"+area);
    }
    
}
