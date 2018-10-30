package com.instaspaces;

/**
 *
 * @author R D Gupta
 */
public class GSTReadData {
    public static void main(String[] args) {
        
        String contact,gstin;
        contact = "9340172104";
        gstin = "2334";
       try{
           DaoJson dj=new DaoJson();
           if(dj.findGst(contact, gstin)){
             GSTBean b=  dj.showGST(contact,gstin);
               
               System.out.println(b.getContact());
               System.out.println(b.getGstin());
               System.out.println(b.getCname());
               System.out.println(b.getAddcompany());
               System.out.println(b.getAddemail());
           }
           else{
               System.out.println("Not found..");
           }
           
           
       }catch(Exception e){
           e.printStackTrace();
       }
    }
}
