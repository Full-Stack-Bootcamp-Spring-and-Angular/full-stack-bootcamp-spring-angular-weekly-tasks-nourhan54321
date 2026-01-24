package Vehicles.dao;

import Vehicles.Models.Vehicles;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.sql.*;

@Component
@Setter
@Scope("singleton")
public class DatabaseOperation {

   @Value("${database.url}")
   private String url;

    @Value("${database.password}")
    private String password;

    @Value("${database.username}")
    private String username;

    @PostConstruct
    public void connectToDatabase() throws SQLException{

            Driver myDriver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver( myDriver );
            System.out.println("Connection Started successfully...");
    }

    public void InsertIntoDatabase(Vehicles vehicle) throws SQLException {


        Connection conn = DriverManager.getConnection(url, username, password);
        Statement stmt = conn.createStatement();
        String ins_sel = "insert into vehicles (id,name) values (?,?)";

        stmt.executeUpdate(ins_sel);
    }
    public void DeleteFromDatabase(int id) throws SQLException {


        Connection conn = DriverManager.getConnection(url, username, password);
        Statement stmt = conn.createStatement();
        String ins_sel = String.format("DELETE from vehicles  where id=%d",id);

        stmt.executeUpdate(ins_sel);
    }

    public void  SearchById(int id) throws SQLException {


        Connection conn = DriverManager.getConnection(url, username, password);
        Statement stmt = conn.createStatement();
        String ins_sel = String.format("Select * from vehicles where id=%d",id);

        stmt.executeUpdate(ins_sel);
    }
    public void  GetAllVehicles()throws SQLException {


        Connection conn = DriverManager.getConnection(url, username, password);
        Statement stmt = conn.createStatement();
        String ins_sel = "Select * from vehicles ";
        ResultSet rs = stmt.executeQuery(ins_sel);
        while(rs.next()){
            //Display values
            System.out.println(String.format("%d, %s, %s",rs.getInt("id"),rs.getString("model"),rs.getString("type")));
        }

        stmt.executeUpdate(ins_sel);
    }
    @PreDestroy
    public void disconnectFromDatabase(){
        System.out.println("Connection Closed successfully...");
    }





}
