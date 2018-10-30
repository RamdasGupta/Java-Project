package com.newinsta;

import com.insta.dao.ProfileDAO;
import com.insta.model.Booking;
import com.insta.model.Profile;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class AddProfile {

    public static void main(String[] args) {
        ProfileDAO pd = new ProfileDAO();
        String name, email, contact, dob, address;
        name = "Ravi Raushan";
        email = "ravi@gmail.com";
        contact = "9375748426";
        dob = "27-02-1995";
        address = "Bhopal";
        int c = 1;
        Profile add = new Profile();
        add.setName(name);
        add.setEmail(email);
        add.setContact(contact);
        add.setDob(dob);
        add.setAddress(address);

        //Add profile...
        if (pd.get(contact) != null) {
            System.out.println("You have already created account");
        } else {
            Profile p = pd.create(add);
            System.out.println("File created...");
        }

        //Delete single profile...
        // String del = pd.delete(contact);
        //Update single profile....
        if (pd.get(contact) != null) {
            pd.update(contact, add);
        } else {
            System.out.println("Data not found...");
        }

        //Show all profile...
        ArrayList list = (ArrayList) pd.list();
        ArrayList<Profile> a = (ArrayList) list;
        for (Profile bean : a) {
            System.out.println(c + ". Name :" + bean.getName() + " Email :" + bean.getEmail() + " Contact :" + bean.getContact() + " Dob :" + bean.getDob() + " Address :" + bean.getAddress());
            c++;
        }

        //Show single profile....
//        Profile bean = pd.get(contact);
//        if (bean != null) {
//            System.out.println("Name :" + bean.getName() + " Email :" + bean.getEmail() + " Contact :" + bean.getContact() + " Dob :" + bean.getDob() + " Address :" + bean.getAddress());
//        } else {//
//            System.out.println("Record not found...");
//        }

        
    }
}
