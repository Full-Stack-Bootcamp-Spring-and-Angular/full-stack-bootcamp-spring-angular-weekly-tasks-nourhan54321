package com.vehicle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext container=new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car=(Car) container.getBean("car");
        car.StoreVehicle("Car");
        Vehicle plane=container.getBean("plane",Vehicle.class);
        plane.StoreVehicle("PLane");
    }
}

