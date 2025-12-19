package com.example1;

public class SquareShape implements Shape {
    @Override
    public void getArea(double Side) {
        double area = Side*Side;
        System.out.println( String.format("area of square is %f",area));
    }
    
}
