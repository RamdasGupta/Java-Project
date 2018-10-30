package com.instaspaces;

/**
 *
 * @author R D Gupta
 */
public class GSTBean {
    String contact,gstin,cname,addcompany,addemail;

    public GSTBean(String contact, String gstin, String cname, String addcompany, String addemail) {
        this.contact = contact;
        this.gstin = gstin;
        this.cname = cname;
        this.addcompany = addcompany;
        this.addemail = addemail;
    }

    public GSTBean() {
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getGstin() {
        return gstin;
    }

    public void setGstin(String gstin) {
        this.gstin = gstin;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getAddcompany() {
        return addcompany;
    }

    public void setAddcompany(String addcompany) {
        this.addcompany = addcompany;
    }

    public String getAddemail() {
        return addemail;
    }

    public void setAddemail(String addemail) {
        this.addemail = addemail;
    }

   
   
}
