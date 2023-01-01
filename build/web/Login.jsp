<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>

        <link rel="stylesheet" type="text/css" href="./bootstrap/css/bootstrap.min.css" />
        <link rel="stylesheet" type="text/css" href="./bootstrap/css/bootstrap-theme.min.css" />
        <link rel="stylesheet" type="text/css" href="./bootstrap/css/meu.css" />

        <script src="./bootstrap/js/bootstrap.min.js"></script>

        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Insert title here</title>
    </head>
    <body>
        <form action="Loginchecker" method="post">
            <jsp:include page="Header.jspf"></jsp:include>
            <jsp:include page="index.jsp"></jsp:include>

                <fieldset style="width: 400px; margin:0 auto; padding: 20px; margin-top: 50px; border-bottom-color:red; ">
                    <p id="msg">
                    <% String msg = (String) request.getAttribute("msg");%>
                    <%= msg != null ? msg : ""%><br>
                </p>	
                <div class="form-group">
                    <label for="name" class="col-sm-3 control-label">Name</label>
                    <div class="col-sm-8">
                        <input type="text" class="form-control" id="name" name="name"
                               placeholder="Enter your user name" />
                    </div>
                </div>
                <div class="form-group">
                    <label for="pass" class="col-sm-3 control-label">Password</label>
                    <div class="col-sm-8">
                        <input type="password" id="senha" class="form-control" name="pass"
                               placeholder="Enter your password" />
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-offset-3 col-sm-8">

                        <button type="submit" class="btn btn-success">Login</button>
                       
                    </div>
                </div>
            </fieldset>


        </form>	
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
        <script src="./bootstrap/js/jquery.js"></script>
        <script src="./bootstrap/js/bootstrap.min.js"></script>
    </body>
</html>