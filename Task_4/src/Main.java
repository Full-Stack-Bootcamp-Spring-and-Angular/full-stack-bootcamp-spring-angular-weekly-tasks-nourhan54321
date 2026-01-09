import Vehicles.Controllers.CarController;
import Vehicles.Models.Car;
import Vehicles.Models.VehicleType;
import config.ConfigrationFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.awt.*;
import java.io.ObjectInputFilter;
import java.lang.reflect.Type;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext container=new AnnotationConfigApplicationContext(ConfigrationFile.class);
        Car car=container.getBean("car",Car.class);
        car.setId(1);
        car.setModel("A");
        car.setType(VehicleType.car);
        CarController carController=container.getBean("carcontroller",CarController.class);
        }

}