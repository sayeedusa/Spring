
package com.mycompany;

import jakarta.validation.constraints.Size;
import java.util.Date;


public class Member {
    
   
   
   @Size(min=2, message="required")
    private int id;
   
   private String firstName; 
   
   private String lastName;
   private String Address;
   private String City;
   private String Gender;
   private String Race;
   private Date joiningDate;
   private double Fee;

   
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

       
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getRace() {
        return Race;
    }

    public void setRace(String Race) {
        this.Race = Race;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    public double getFee() {
        return Fee;
    }

    public void setFee(double Fee) {
        this.Fee = Fee;
    }

    @Override
    public String toString() {
        return firstName + " "+ lastName + " "+ Address + " " + City + " " + Gender + " " + Race + " " + joiningDate + "  " + Fee;
    }
   
}
