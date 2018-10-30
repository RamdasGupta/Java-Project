package com.instaspaces;

/**
 *
 * @author R D Gupta
 */

public class BookingAdd {

    public static void main(String[] args) {
        String contact,bookingid, wname, location, startdate, enddate;
        contact="9340172104";
        bookingid = "abc12345f";        
        wname = "Training";
        location = "Delhi";
        startdate = "10-10-2018";
        enddate = "10-12-2018";
        try {
            DaoJson dj=new DaoJson();
            if(dj.findBooking(contact)){
               if(dj.findCBooking(contact,bookingid)){
                 System.out.println("Booking found");  
               }
               else{
                   dj.addBooking(contact,bookingid,wname,location,startdate,enddate);
               }
            }
            else{
                dj.addBooking(contact,bookingid,wname,location,startdate,enddate);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
