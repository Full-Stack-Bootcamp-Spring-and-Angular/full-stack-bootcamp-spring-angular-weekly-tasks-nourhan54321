package Vehicles.Models;


public interface Vehicles {

    public int getId();
    public void setId(int id)  ;

    public String getModel()  ;

    public void setModel(String model);
    public VehicleType getType();
    public void setType(VehicleType type);
}
