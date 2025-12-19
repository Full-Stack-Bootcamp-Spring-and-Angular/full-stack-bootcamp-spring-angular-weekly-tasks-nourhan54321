package com.example1;
 import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) throws Exception {
         ApplicationContext container= new ClassPathXmlApplicationContext("applicationContext.xml");
        CircleShape Circle=(CircleShape)container.getBean("circle");
        Circle.getArea(3);

//        SquareShape Square=(SquareShape) container.getBean("square");
        Shape Square= container.getBean("square",Shape.class);
        Square.getArea(5);
    }
}
