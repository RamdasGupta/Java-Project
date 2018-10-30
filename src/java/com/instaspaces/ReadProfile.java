package com.instaspaces;

/**
 *
 * @author R D Gupta
 */

public class ReadProfile {

    public static void main(String[] args) {
        String contact;
        contact="9340172104";
        
        try {
            DaoJson dj=new DaoJson();
            if(dj.findProfile(contact)){
                ProfileBean b=dj.showProfile(contact);
                System.out.println(b.getName());
                System.out.println(b.getEmail());
                System.out.println(b.getContact());
                System.out.println(b.getDob());
                System.out.println(b.getAddress());
            }
            else{
                System.out.println("Not found");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
