package com.instaspaces;

import java.util.ArrayList;


/**
 *
 * @author R D Gupta
 */
public class BookingRead {

    public static void main(String[] args) {
        String contact, bookingid;
        contact= "9340172104";
        bookingid = "abc1234";
        try {
            DaoJson dj = new DaoJson();
            if (dj.findBooking(contact)) {
                ArrayList list = dj.showAllBooking(contact);
                ArrayList<BookingBean> a = (ArrayList) list;
                System.out.println("******************All Booking Show*****************");
                for (BookingBean bean : a) {
                    System.out.println(bean.getBookingid());
                    System.out.println(bean.getContact());
                    System.out.println(bean.getWname());
                    System.out.println(bean.getLocation());
                    System.out.println(bean.getStartdate());
                    System.out.println(bean.getEnddate());
                }

                BookingBean b = dj.showSingleBooking(contact, bookingid);
                System.out.println("******************Single Booking Show*****************");
                System.out.println(b.getContact());
                System.out.println(b.getBookingid());
                System.out.println(b.getWname());
                System.out.println(b.getLocation());
                System.out.println(b.getStartdate());
                System.out.println(b.getEnddate());

                //dj.showCanceledAllBooking(id);
                //dj.showCanceledSingleBooking(id,bookingid);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
