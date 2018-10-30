package com.instaspaces;

/**
 *
 * @author R D Gupta
 */

public class GSTAddData {

    public static void main(String[] args) {
        String contact, gstin, cname, caddress, addemail;
        contact= "9340172104";
        gstin = "2334";
        cname = "Google";
        caddress = "Gurgaon";
        addemail = "abc@gmail.com";
        try {
            DaoJson dj = new DaoJson();
            if (dj.findGst(contact, gstin)) {
                System.out.println("Data already exist..");
            } else {
                dj.addGST(contact, gstin, cname, caddress, addemail);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
