package com.vehicle;

public class Car implements Vehicle{
    private dbOperations db;
    @Override
    public void StoreVehicle(String vehicleName) {
        db.Store(vehicleName);
    }

    public Car(dbOperations db) {
        this.db = db;
    }
}
