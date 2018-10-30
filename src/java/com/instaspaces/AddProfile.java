package com.instaspaces;

/**
 *
 * @author R D Gupta
 */
public class AddProfile {

    public static void main(String[] args) {
        String name, email, contact, dob, address;
        name = "Ramdas Gupta";
        email = "ramdasguptardg@gmail.com";
        contact = "9340172104";
        dob = "27-02-1995";
        address = "Kapilvastu";
        try {
            DaoJson dj = new DaoJson();
            if (dj.findProfile(contact)) {
                System.out.println("You have already created account");
            } else {
                dj.addProfile(name, email, contact, dob, address);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
