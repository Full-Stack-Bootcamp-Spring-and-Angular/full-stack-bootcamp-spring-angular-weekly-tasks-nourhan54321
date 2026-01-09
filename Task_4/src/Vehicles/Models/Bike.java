package Vehicles.Models;

import Vehicles.dao.DatabaseOperation;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("Prototype")
@Getter
@Setter
public class Bike implements Vehicles {
    @Autowired
    DatabaseOperation db ;
         int id;
         String model;
         VehicleType  type;


}
