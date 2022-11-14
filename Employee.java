/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Dell
 */
import java.io.*;
public class Employee implements Serializable{
 
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String address;
    private String contact;
    private String qualification;
    private String design;
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
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    } 
    public String getqualification() {
        return qualification;
    }
    public void setqualification(String qualification) {
        this.qualification = qualification;
    } 
    public String getdesign() {
        return design;
    }
    public void setdesign(String design) {
        this.design = design;
    } 
}

