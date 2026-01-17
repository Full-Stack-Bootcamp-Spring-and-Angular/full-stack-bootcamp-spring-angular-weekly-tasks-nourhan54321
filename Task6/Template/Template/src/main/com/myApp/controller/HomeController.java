package main.com.myApp.controller;

import lombok.Data;
import main.com.myApp.dao.DatabaseOperation;
import main.com.myApp.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Period;

@Controller
public class HomeController
{

@RequestMapping("/")
    public String form(){return "formPage";}

@RequestMapping("/result")
public String result (Model model, HttpServletRequest r1) throws SQLException {
    User user = new User();
    ///1 //////////////GET Data From Form page to add it to db
    String FName=r1.getParameter("Fname");
    String LName=r1.getParameter("Lname");
    String city=r1.getParameter("City");
    String dat=r1.getParameter("date");
    /// ////ADD TO DB
    user.setFirstName(FName);
    user.setLastName(LName);
    user.setCity(city);
    if (dat==null){
        System.out.println("no age entered");
    }
    else {
        LocalDate Ldate=LocalDate.parse(dat);
        int age= Period.between(Ldate,LocalDate.now()).getYears();
        DatabaseOperation db =new DatabaseOperation();
        user.setDatte(Date.valueOf( Ldate));
        /// /////To print the age of user
        model.addAttribute("datee",age);
      db.InsertIntoDatabase(user);

    }

    model.addAttribute("FirstName",FName);
    model.addAttribute("LastName",LName);
    model.addAttribute("city",city);
     return "resultPage";
}}


