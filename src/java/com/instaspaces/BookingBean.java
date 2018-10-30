package com.instaspaces;

/**
 *
 * @author R D Gupta
 */
public class BookingBean {
   String contact,bookingid,wname,location,startdate,enddate;

    public BookingBean(String contact, String bookingid, String wname, String location, String startdate, String enddate) {
        this.contact = contact;
        this.bookingid = bookingid;
        this.wname = wname;
        this.location = location;
        this.startdate = startdate;
        this.enddate = enddate;
    }

    public BookingBean() {
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getBookingid() {
        return bookingid;
    }

    public void setBookingid(String bookingid) {
        this.bookingid = bookingid;
    }

    public String getWname() {
        return wname;
    }

    public void setWname(String wname) {
        this.wname = wname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    
}
