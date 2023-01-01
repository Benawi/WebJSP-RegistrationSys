
<%@page import="java.util.List"%>
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
        <title>Home</title>
    </head>
    <body>
        <jsp:include page="Header.jspf"></jsp:include>
            <table align="center"><tr><td class="col-lg-8">
                        <form action="servlet/Register" method="post">
                            <fieldset style=" margin:auto; padding: 10px; margin-top: 50px; border-bottom-color:red;">
                                <p id="msg">
                                <% String msg = (String) request.getAttribute("msg");%>
                                <%= msg != null ? msg : ""%><br>
                            </p>
                            <legend>Register </legend>

                            <div class="form-group-lg">
                                <label class=" control-label" for="userName">First Name:</label>

                                <div class="col-xs-pull-3">
                                    <input class="form-control" type="text" id="userName" name="userName"  /> 
                                </div>
                            </div>
                            <div class="form-group-lg">
                                <label class="control-label" for="lastName">Last Name:</label>
                                <div class=" col-xs-push-3">
                                    <input class="form-control" type="text" id="lastName" name="lastName"/>
                                </div>
                            </div>
    
                            <div class="form-group-lg">
                                <label class="col-xs-push-3 control-label" for="Sex">Sex:</label>
                                <div class=" col-xs-push-3">
                                    <select class="form-control"  name="userCountry">
                                        <option>Select</option>
                                        <option>Male</option>
                                        <option>Female</option>

                                    </select>
                                </div>
                     
                            <div class="form-group-lg">
                                <label class="control-label" for="email">Email</label>
                                <div class=" col-xs-push-3">

                                    <input class="form-control"  type="text" name="userEmail" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$" title="Invalid email address">
                                </div>
                            </div>
                            <div class="form-group-lg">
                                <label class=" control-label" for="Country">Country</label>
                                <div class=" col-xs-push-3">
                                    <select class="form-control"  name="userCountry">
                                        <option>Select</option>
                                        <option>Ethiopia</option>
                                        <option>Kenya</option>
                                        <option>other</option>
                                    </select>
                                </div>
                            </div>
                        </fieldset>
                        <br>
                        <div class="form-group">
                            <div class="col-sm-offset-3 col-sm-8">
                                <input class="btn-success col-lg-6 btn-sm" type="submit" value="Submit"> 
                                <input class="btn-warning col-lg-6 btn-sm" type="reset" value="Reset">
                            </div> 
                        </div>
                    </form>
                </td>
            </tr></table>

    </body>

</html>