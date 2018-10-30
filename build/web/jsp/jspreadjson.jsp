<%-- 
    Document   : jspreadjson
    Created on : Oct 8, 2018, 2:12:51 PM
    Author     : R D Gupta
--%>

<%@page import="jsp.Jsonclass"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
Jsonclass data=(Jsonclass)session.getAttribute("data");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

    </head>
    <body class="container">
        <div class="jumbotron">
            <div class="row">
                <div class="col-sm-6">
                    <div class="well">
                        <form class="form-horizontal" action="../Jspindex" method="post">

                            <input type="text" name="name" class="form-control" value="<%=data.getName()%>" placeholder="Enter your name..."/><br/>
                            <input type="email" name="email" class="form-control" value="<%=data.getEmail()%>" placeholder="Enter your email..."/><br/>
                            <input type="text" name="contact" class="form-control" value="<%=data.getContact()%>" placeholder="Enter your contact number..."/><br/>
                            <input type="text" name="address" class="form-control" value="<%=data.getAddress()%>" placeholder="Enter your address..."/><br/>
                            <input type="submit" class="form-control btn btn-primary" value="Update"/>

                        </form>
                    </div>
                </div>
            </div>
        </div>

    </body>
</html>

