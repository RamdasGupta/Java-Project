package com.ram.DAO;

/**
 *
 * @author R D Gupta
 */
import com.instaspaces.ProfileBean;
import com.ram.Bean.DBException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Statement;
import com.ram.dbconnection.DBConn;
import com.ram.Bean.Profile;

public class ProfileDAO {

    public static void createTable() throws DBException {
        Connection conn = null;
        Statement s = null;
        try {
            conn = DBConn.getConnection();
            s = conn.createStatement();
            s.executeUpdate("create table profile(NAME VARCHAR(30),EMAIL VARCHAR(30),CONTACT INT,DOB VARCHAR(30),ADDRESS VARCHAR(30),primary key(CONTACT))");
            DBConn.close(conn, s);
        } catch (SQLException | ClassNotFoundException e) {
            DBConn.close(conn, s);
            throw new DBException("Excepion while accessing database");
        }

    }

    public static void dropTable() {
        Connection conn = null;
        Statement s = null;
        try {
            conn = DBConn.getConnection();
            s = conn.createStatement();
            s.executeUpdate("drop table Profile");
            DBConn.close(conn, s);
        } catch (ClassNotFoundException | SQLException e) {
            DBConn.close(conn, s);
            e.printStackTrace();
        }
    }

    public static ArrayList selectProfile() throws DBException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet res = null;
        ArrayList plist = new ArrayList();
        try {
            conn = DBConn.getConnection();
            ps = conn.prepareStatement("select * from profile");
            res = ps.executeQuery();
            if (res != null) {
                while (res.next()) {
                    Profile pojo=new Profile();
                    pojo.setNAME(res.getString(1));
                    pojo.setEMAIL(res.getString(2));
                    pojo.setCONTACT(res.getInt(3));
                    pojo.setDOB(res.getString(4));
                    pojo.setADDRESS(res.getString(5));
                    plist.add(pojo);
                }
            }
            DBConn.close(conn, ps, res);
        } catch (ClassNotFoundException | SQLException e) {
            DBConn.close(conn, ps, res);
            throw new DBException("Excepion while accessing database");
        }
        return plist;
    }

    public static void insertRow(Profile pojo) throws DBException {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = DBConn.getConnection();
            ps = conn.prepareStatement("insert into profile (NAME,EMAIL,CONTACT,DOB,ADDRESS) values (?,?,?,?,?)");
            ps.setString(1, pojo.getNAME());
            ps.setString(2, pojo.getEMAIL());
            ps.setInt(3, pojo.getCONTACT());
            ps.setString(4, pojo.getDOB());
            ps.setString(5, pojo.getADDRESS());
            ps.executeUpdate();
            DBConn.close(conn, ps);
        } catch (ClassNotFoundException | SQLException e) {
            DBConn.close(conn, ps);
            throw new DBException("Excepion while accessing database");
        }
    }

    public static void deleteRow(Profile pojo) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = DBConn.getConnection();
            ps = conn.prepareStatement("delete from profile where NAME = ? and EMAIL = ? and CONTACT = ? and DOB = ? and ADDRESS = ?");
            ps.setString(1, pojo.getNAME());
            ps.setString(2, pojo.getEMAIL());
            ps.setInt(3, pojo.getCONTACT());
            ps.setString(4, pojo.getDOB());
            ps.setString(5, pojo.getADDRESS());
            ps.executeUpdate();
            ps.close();
            DBConn.close(conn, ps);
        } catch (SQLException | ClassNotFoundException e) {
            DBConn.close(conn, ps);
            e.printStackTrace();
        }
    }

    public static void updateRow(Profile pojo1, Profile pojo2) throws DBException {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = DBConn.getConnection();
            ps = conn.prepareStatement("update profile set NAME=?,EMAIL=?,CONTACT=?,DOB=?,ADDRESS=? where  NAME=? and EMAIL=? and CONTACT=? and DOB=? and ADDRESS=? ");
            ps.setString(1, pojo1.getNAME());
            ps.setString(2, pojo1.getEMAIL());
            ps.setInt(3, pojo1.getCONTACT());
            ps.setString(4, pojo1.getDOB());
            ps.setString(5, pojo1.getADDRESS());
            ps.setString(6, pojo2.getNAME());
            ps.setString(7, pojo2.getEMAIL());
            ps.setInt(8, pojo2.getCONTACT());
            ps.setString(9, pojo2.getDOB());
            ps.setString(10, pojo2.getADDRESS());
            ps.executeUpdate();
            DBConn.close(conn, ps);
        } catch (ClassNotFoundException | SQLException e) {
            DBConn.close(conn, ps);
            throw new DBException("Excepion while accessing database");
        }
    }

}
