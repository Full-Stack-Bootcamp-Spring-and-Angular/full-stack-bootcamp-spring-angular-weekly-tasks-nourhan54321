package com.vehicle;

public class Plane implements Vehicle{
    private dbOperations db;

    public void setDb(dbOperations db) {
        this.db = db;
    }

    @Override
    public void StoreVehicle(String vehicleName) {
        db.Store(vehicleName);
    }
}
