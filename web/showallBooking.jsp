<%-- 
    Document   : showallBooking
    Created on : Oct 10, 2018, 2:39:50 PM
    Author     : R D Gupta
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body  class="container">
        <div class="well">
        <table class="table">
    <thead>
      <tr>
        <th>ID</th>
        <th>Booking Id</th>
        <th>Workspace Name</th>
        <th>Location</th>
        <th>Start Date</th>
        <th>End Date</th>
      </tr>
    </thead>
    <tbody>
      <%   ArrayList<com.instaspaces.BookingBean> al=(ArrayList)session.getAttribute("list");
for(com.instaspaces.BookingBean b:al){%>
      <tr>
        <td><%=b.getId()%></td>
        <td><%=b.getBookingid()%></td>
        <td><%=b.getWname()%></td>
        <td><%=b.getLocation()%></td>
        <td><%=b.getStartdate()%></td>
        <td><%=b.getEnddate()%></td>
      </tr>
      <%}%>
    </tbody>
        </table>
        </div>
    </body>
</html>
