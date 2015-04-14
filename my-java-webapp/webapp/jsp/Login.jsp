<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<script type="text/javascript" src="js/login.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Login</title>
</head>

<body>
<h3>Login Form</h3>  
<br/>  	
	<form method="post">
		 <center>
            <table>
                <thead>
                    <tr>
                        <th colspan="2">Login Here</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>User Name</td>
                        <td><input type="text" name="username" id="uname" value="" /></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="pass" value="" /></td>
                    </tr>
                    <tr>
                        <td><input type="button" value="Login" onclick="callSubmit()"/></td>
                        <td><input type="reset" value="Reset" /></td>
                    </tr>
                    
                    <tr>
                       <td colspan="2">Not Registered!! <a href="jsp/Register.jsp">Register Here</a></td>
                    </tr>
                </tbody>
            </table>
            </center>
	</form> 
</body>
</html> 



  
