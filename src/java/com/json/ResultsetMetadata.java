package com.json;

import java.sql.*;

public class ResultsetMetadata {
    public static void main(String[] args) {
        try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ram", "root", "root");
  
PreparedStatement ps=con.prepareStatement("select * from students");  
ResultSet rs=ps.executeQuery();  
ResultSetMetaData rsmd=rs.getMetaData();  
  
System.out.println("Total columns: "+rsmd.getColumnCount());  
System.out.println("Column Name of 1st column: "+rsmd.getColumnName(2));  
System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(2));  
  
con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}
