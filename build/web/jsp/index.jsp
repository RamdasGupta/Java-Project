<%-- 
    Document   : index
    Created on : Oct 8, 2018, 11:36:42 AM
    Author     : R D Gupta
--%>

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
    <body class="container">
        <div class="jumbotron">
            <div class="row">
                <div class="col-sm-6">
                    <div class="well">
                        
                        <form class="form-horizontal" action="../Jspindex" method="post">
                            <input type="text" name="name" class="form-control" placeholder="Enter your name..."/><br/>
                            <input type="email" name="email" class="form-control" placeholder="Enter your email..."/><br/>
                            <input type="text" name="contact" class="form-control" placeholder="Enter your contact number..."/><br/>
                            <input type="text" name="address" class="form-control" placeholder="Enter your address..."/><br/>
                            <input type="submit" class="form-control btn btn-primary" value="Submit"/>

                        </form>
                    </div>
                </div>
            </div>
        </div>

    </body>
</html>
