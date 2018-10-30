package com.instaspaces;

/**
 *
 * @author R D Gupta
 */
public class UpdateProfile {

    public static void main(String[] args) {
        try {
            String name, email, contact, dob, address;
            contact ="9340172104";
            name = "Rakesh Kumar";
            email = "rakesh@gmail.com";
            dob = "27-02-1995";
            address = "Kapilvastu";
            DaoJson dj = new DaoJson();
            if (dj.findProfile(contact)) {
                dj.UpdateProfile(name, email, contact, dob, address);
            }
            else{
                System.out.println("Data not found..");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
