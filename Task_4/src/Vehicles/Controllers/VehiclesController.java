package Vehicles.Controllers;

import Vehicles.Models.Vehicles;

import java.sql.SQLException;

public interface  VehiclesController {

    void SaveVehicles(Vehicles vehicle) throws SQLException;
    public void  deleteVehicle (int id)throws SQLException;
     public void SearchById(int id) throws SQLException;
    public void GetAllVehicles() throws SQLException;

}
