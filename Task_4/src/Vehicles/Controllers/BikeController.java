package Vehicles.Controllers;

import Vehicles.Models.Bike;
import Vehicles.Models.Vehicles;
import Vehicles.dao.DatabaseOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

@Component

public class BikeController implements VehiclesController{
    DatabaseOperation db;
    @Autowired
    public BikeController(DatabaseOperation db) {
        this.db = db;
    }



    @Override
    public void SaveVehicles(Vehicles vehicle) throws SQLException {
        db.InsertIntoDatabase((Bike) vehicle );
    }



    @Override

    public void deleteVehicle(int id)throws SQLException {
        db.DeleteFromDatabase(id);
    }

    @Override
    public void SearchById(int id) throws SQLException {
        db.SearchById(id);
    }

    @Override
    public void GetAllVehicles()throws SQLException {
        db.GetAllVehicles();
    }



}
