package main.com.myApp.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Setter
@Getter
@Component
public class User {


    String firstName;
    String lastName;
    String city;
    Date datte;
}
