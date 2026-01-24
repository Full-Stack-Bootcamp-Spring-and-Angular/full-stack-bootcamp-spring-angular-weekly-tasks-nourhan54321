package main.com.myApp.dao;


import lombok.Setter;
import main.com.myApp.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.sql.*;

@Component
@Setter

public class DatabaseOperation {

   @Value("${database.url}")
   private String url;

    @Value("${database.password}")
    private String password;

    @Value("${database.username}")
    private String username;

    Connection conn;
    Statement stmt;

    @PostConstruct
    public void connectToDatabase() throws SQLException{

            Driver myDriver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver( myDriver );
            System.out.println("Connection Started successfully...");
    }

    public void InsertIntoDatabase(User homemodel) throws SQLException {


        conn = DriverManager.getConnection(url, username, password);
         stmt = conn.createStatement();
        String ins_sel = "insert into Users (Fname,Lname,City,Date) values (?,?,?,?)";

        stmt.executeUpdate(ins_sel);

    }





    @PreDestroy
    public void disconnectFromDatabase() throws SQLException {
        conn.close();
        stmt.close();
        System.out.println("Connection Closed successfully...");


    }





}
