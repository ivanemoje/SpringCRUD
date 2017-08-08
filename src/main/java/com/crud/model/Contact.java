package com.crud.model;


import java.io.Serializable;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contacts")
public class Contact implements Serializable {
 
    private static final long serialVersionUID = -3465813074586302847L;
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
 
    @Column
    private String firstname;
    
    @Column
    private String lastname;
  
    @Column
    private String emailaddress;
 
    @Column
    private String phonenumber;
 
 
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public String getFName() {
        return firstname;
    }
 
    public void setFName(String firstname) {
        this.firstname = firstname;
    }
    
    public String getLName() {
        return lastname;
    }
 
    public void setLName(String lastname) {
        this.lastname = lastname;
    }
 
    public String getEmail() {
        return emailaddress;
    }
 
    public void setEmail(String emailaddress) {
        this.emailaddress = emailaddress;
    }
 
    
    public String getTelephone() {
        return phonenumber;
    }
 
    public void setTelephone(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}


