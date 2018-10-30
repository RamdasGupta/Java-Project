package com.instaspaces;

/**
 *
 * @author R D Gupta
 */
public class GSTUpdateData {

    public static void main(String[] args) {
        try {
            String contact,gstin, cname, caddress, addemail;
            contact="9340172104";
            gstin = "2334";
            cname = "Facebook";
            caddress = "Delhi";
            addemail = "abc@gmail.com";
            DaoJson dj = new DaoJson();
            if (dj.findGst(contact,gstin)) {
                dj.UpdateGst(contact,gstin, cname, caddress, addemail);
            }
            else{
                System.out.println("Record not found...");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
