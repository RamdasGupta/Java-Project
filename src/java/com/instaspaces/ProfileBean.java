package com.instaspaces;

/**
 *
 * @author R D Gupta
 */
public class ProfileBean {
    String name,email,contact,dob,address;

    public ProfileBean(String name, String email, String contact, String dob, String address) {
        this.name = name;
        this.email = email;
        this.contact = contact;
        this.dob = dob;
        this.address = address;
    }

    public ProfileBean() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
   }
