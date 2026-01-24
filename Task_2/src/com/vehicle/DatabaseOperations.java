package com.vehicle;

public class dbOperations {
    private String username;
    private String url;
    private String password;


    public void Store(String VehicleName){
        System.out.println(String.format("Vehicle %s stored successfully into this url %s with passsword %s and Username %s",VehicleName,url,password,username));
    }


    public void setUsername(String username) {
        this.username = username;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
