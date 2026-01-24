package Vehicles.Models;

import Vehicles.dao.DatabaseOperation;
import lombok.Getter;
import lombok.Setter;
import org.springframework.asm.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Getter
@Setter
public class Plane implements Vehicles {
    DatabaseOperation db;
    int id;
    String model;
    VehicleType  type;

    @Autowired
    public void setDb(DatabaseOperation db) {
        this.db = db;
    }



}
