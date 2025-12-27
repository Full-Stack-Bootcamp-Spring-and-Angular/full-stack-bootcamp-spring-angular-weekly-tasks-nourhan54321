package scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext container =new ClassPathXmlApplicationContext("applicationContext.xml");
     CircleShape circle=(CircleShape) container.getBean("circle");
     circle.draw2d("circle");

     Shape Square= container.getBean("square",Shape.class);
     Square.draw3d("square");
        ((ClassPathXmlApplicationContext)container).close();
    }

}