package com.instaspaces;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class DaoJson {

    String profilefile = "A:/Instaspaces/Ram/profile.json";
    String gstfile = "A:/Instaspaces/Ram/gst.json";
    String bookingfile = "A:/Instaspaces/Ram/booking.json";
    JSONParser parser = new JSONParser();

    boolean findProfile(String contact) {
        boolean status = false;
        try {
            FileReader reader = new FileReader(profilefile);
            Object obj = parser.parse(reader);
            JSONArray plist = (JSONArray) obj;
            for (Object item : plist) {
                JSONObject list = (JSONObject) item;
                if (list.get("contact").equals(contact)) {
                    status = true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    boolean findGst(String contact,String gstin) {
        boolean status = false;
        try {
            FileReader reader = new FileReader(gstfile);
            Object obj = parser.parse(reader);
            JSONArray plist = (JSONArray) obj;
            for (Object item : plist) {
                JSONObject list = (JSONObject) item;
                if (list.get("contact").equals(contact) && list.get("gstin").equals(gstin)) {
                    status = true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    boolean findBooking(String contact) {
        boolean status = false;
        try {
            FileReader reader = new FileReader(bookingfile);
            Object obj = parser.parse(reader);
            JSONArray plist = (JSONArray) obj;
            for (Object item : plist) {
                JSONObject list = (JSONObject) item;
                if (list.get("contact").equals(contact)) {
                    status = true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    void UpdateProfile(String name, String email, String contact, String dob, String address) {
        JSONArray a = new JSONArray();
        try {
            FileReader reader = new FileReader(profilefile);
            Object obj = parser.parse(reader);
            JSONArray plist = (JSONArray) obj;
            for (Object item : plist) {
                JSONObject list = (JSONObject) item;
                JSONObject o = new JSONObject();
                if (list.get("contact").equals(contact)) {
                    list.remove("name");
                    list.remove("email");
                    list.remove("contact");
                    list.remove("dob");
                    list.remove("address");
                    list.put("name", name);
                    list.put("email", email);
                    list.put("contact", contact);
                    list.put("dob",dob);
                    list.put("address", address);
                }
                o.put("name", list.get("name"));
                o.put("email", list.get("email"));
                o.put("contact", list.get("contact"));
                o.put("dob", list.get("dob"));
                o.put("address", list.get("address"));
                a.add(o);
            }
            FileWriter writer=new FileWriter(profilefile);
            writer.write(a.toJSONString());
            writer.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void UpdateGst(String contact,String gstin, String cname, String caddress, String addemail) {
        JSONArray a = new JSONArray();
        try {
            FileReader reader = new FileReader(gstfile);
            Object obj = parser.parse(reader);
            JSONArray plist = (JSONArray) obj;
            for (Object item : plist) {
                JSONObject list = (JSONObject) item;
                JSONObject o = new JSONObject();
                if (list.get("contact").equals(contact) && list.get("gstin").equals(gstin)) {
                    list.remove("contact");
                    list.remove("gstin");
                    list.remove("cname");
                    list.remove("caddress");
                    list.remove("addemail");
                    list.put("contact",contact);
                    list.put("gstin", gstin);
                    list.put("cname", cname);
                    list.put("caddress", caddress);
                    list.put("addemail", addemail);
                }
                o.put("contact", list.get("contact"));
                o.put("gstin", list.get("gstin"));
                o.put("cname", list.get("cname"));
                o.put("caddress", list.get("caddress"));
                o.put("addemail", list.get("addemail"));
                a.add(o);
            }
            FileWriter writer=new FileWriter(gstfile);
            writer.write(a.toJSONString());
            writer.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    void addProfile(String name, String email, String contact, String dob, String address) {
        try {
            FileReader reader = new FileReader(profilefile);
            Object obj = parser.parse(reader);
            JSONArray list = (JSONArray) obj;
            JSONObject ob = new JSONObject();
            ob.put("name", name);
            ob.put("email", email);
            ob.put("contact", contact);
            ob.put("dob", dob);
            ob.put("address", address);
            list.add(ob);
            FileWriter file = new FileWriter(profilefile);
            file.write(list.toJSONString());
            file.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void addBooking(String contact,String bookingid, String wname, String location, String startdate, String enddate) {
        try {
            FileReader reader = new FileReader(bookingfile);
            Object obj = parser.parse(reader);
            JSONArray list = (JSONArray) obj;
            JSONObject ob = new JSONObject();
            ob.put("contact", contact);
            ob.put("bookingid", bookingid);
            ob.put("wname", wname);
            ob.put("location",location);
            ob.put("startdate", startdate);
            ob.put("enddate", enddate);
            list.add(ob);
            FileWriter file = new FileWriter(bookingfile);
            file.write(list.toJSONString());
            file.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public ArrayList<BookingBean> showAllBooking(String contact) {
        ArrayList<BookingBean> a = new ArrayList<BookingBean>();
        try {
            FileReader reader = new FileReader(bookingfile);
            Object obj = parser.parse(reader);
            JSONArray plist = (JSONArray) obj;
            for (Object item : plist) {
                JSONObject list = (JSONObject) item;
                if (list.get("contact").equals(contact)) {
                    BookingBean bean = new BookingBean();
                    bean.setContact(list.get("contact").toString());
                    bean.setBookingid(list.get("bookingid").toString());
                    bean.setWname(list.get("wname").toString());
                    bean.setLocation(list.get("location").toString());
                    bean.setStartdate(list.get("startdate").toString());
                    bean.setEnddate(list.get("enddate").toString());
                    a.add(bean);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return a;
    }

    public BookingBean showSingleBooking(String contact, String bookingid) {
         BookingBean bean = new BookingBean();
        try {
            FileReader reader = new FileReader(bookingfile);
            Object obj = parser.parse(reader);
            JSONArray plist = (JSONArray) obj;
            for (Object item : plist) {
                JSONObject list = (JSONObject) item;
                if (list.get("contact").equals(contact) && list.get("bookingid").equals(bookingid)) {
                    bean.setContact(list.get("contact").toString());
                    bean.setBookingid(list.get("bookingid").toString());
                    bean.setWname(list.get("wname").toString());
                    bean.setLocation(list.get("location").toString());
                    bean.setStartdate(list.get("startdate").toString());
                    bean.setEnddate(list.get("enddate").toString());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bean;
    }

    void showCanceledSingleBooking(String id, String bookingid) {
       
    }

    boolean findCBooking(String contact, String bookingid) {
       boolean status = false;
        try {
            FileReader reader = new FileReader(bookingfile);
            Object obj = parser.parse(reader);
            JSONArray plist = (JSONArray) obj;
            for (Object item : plist) {
                JSONObject list = (JSONObject) item;
                if (list.get("contact").equals(contact) && list.get("bookingid").equals(bookingid)) {
                    status = true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    void addGST(String contact, String gstin, String cname, String caddress, String addemail) {
       try {
            FileReader reader = new FileReader(gstfile);
            Object obj = parser.parse(reader);
            JSONArray list = (JSONArray) obj;
            JSONObject ob = new JSONObject();
            ob.put("contact", contact);
            ob.put("gstin", gstin);
            ob.put("cname", cname);
            ob.put("caddress", caddress);
            ob.put("addemail", addemail);
            list.add(ob);
            FileWriter file = new FileWriter(gstfile);
            file.write(list.toJSONString());
            file.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

     GSTBean showGST(String contact, String gstin) {
         GSTBean bean=new GSTBean();
        try {
            FileReader reader = new FileReader(gstfile);
            Object obj = parser.parse(reader);
            JSONArray plist = (JSONArray) obj;
            for (Object item : plist) {
                JSONObject list = (JSONObject) item;
                if (list.get("contact").equals(contact) && list.get("gstin").equals(gstin)) {
                    bean.setContact(list.get("contact").toString());
                    bean.setGstin(list.get("gstin").toString());
                    bean.setCname(list.get("cname").toString());
                    bean.setAddcompany(list.get("caddress").toString());
                    bean.setAddemail(list.get("addemail").toString());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bean;    
    }

    ProfileBean showProfile(String contact) {
      ProfileBean bean=new ProfileBean();
        try {
            FileReader reader = new FileReader(profilefile);
            Object obj = parser.parse(reader);
            JSONArray plist = (JSONArray) obj;
            for (Object item : plist) {
                JSONObject list = (JSONObject) item;
                if (list.get("contact").equals(contact)) {
                    bean.setName(list.get("name").toString());
                    bean.setEmail(list.get("email").toString());
                    bean.setContact(list.get("contact").toString());
                    bean.setDob(list.get("dob").toString());
                    bean.setAddress(list.get("address").toString());
                    System.out.println("f"+list);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bean;
    }

}
