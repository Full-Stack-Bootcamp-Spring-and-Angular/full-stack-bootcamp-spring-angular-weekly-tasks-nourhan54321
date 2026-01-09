package Vehicles.Models;

import Vehicles.dao.DatabaseOperation;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Setter
@Getter
public class Car implements Vehicles {
   DatabaseOperation db;
@Autowired
    public Car(DatabaseOperation db) {
        this.db = db;
    }

    int id;
    String model;
    VehicleType  type;


}

