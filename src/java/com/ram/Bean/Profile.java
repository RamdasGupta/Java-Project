
package com.ram.Bean;

/**
 *
 * @author R D Gupta
 */
    
public class Profile
{
    private String NAME;

    private String EMAIL;

    private int CONTACT;

    private String DOB;

    private String ADDRESS;

    public String getNAME ()
    {
        return NAME;
    }

    public void setNAME (String NAME)
    {
        this.NAME = NAME;
    }

    public String getEMAIL ()
    {
        return EMAIL;
    }

    public void setEMAIL (String EMAIL)
    {
        this.EMAIL = EMAIL;
    }

    public int getCONTACT ()
    {
        return CONTACT;
    }

    public void setCONTACT (int CONTACT)
    {
        this.CONTACT = CONTACT;
    }

    public String getDOB ()
    {
        return DOB;
    }

    public void setDOB (String DOB)
    {
        this.DOB = DOB;
    }

    public String getADDRESS ()
    {
        return ADDRESS;
    }

    public void setADDRESS (String ADDRESS)
    {
        this.ADDRESS = ADDRESS;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [NAME = "+NAME+", EMAIL = "+EMAIL+", CONTACT = "+CONTACT+", DOB = "+DOB+", ADDRESS = "+ADDRESS+"]";
    }
}

