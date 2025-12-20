package com.example1;

public class CircleShape implements Shape {

    @Override
    public void getArea(double radius) {
        double area = Math.PI *radius *radius;
        System.out.println( String.format("area of Circle is %f",area));
    }
    
}
