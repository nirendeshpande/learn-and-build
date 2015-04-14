<!DOCTYPE html>
<html lang="en">

<head>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular-resource.js"></script>
<script src="js/AngularLoginController.js"></script> 
<script src="js/AngularLoginService.js"></script> 

<title>Login</title>
</head>

<body x-ng-app="myapp">

<!-- START -->

<div x-ng-controller="HelloController" align="center">

 <!--     <h2>Hello {{helloTo.title}} !</h2> -->
<!-- </div> -->   
<!-- END  -->


<h3>Login Form</h3>  
<br/>  	
	<form method="post">		 
            <table>
                <thead>
                    <tr>
                        <th colspan="5"></th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>User Name</td>
                        <td><input type="text" name="username" id="uname" placeholder="Username" x-ng-model="username" /></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="password" placeholder="Password"  x-ng-model="password" /></td>
                    </tr>
                    <tr>
                        <td><input type="button" value="Login" x-ng-click="callSubmit()"/></td>
                        <td><input type="reset" value="Reset" /></td>
                    </tr>                    
                    <tr>
                       <td colspan="2">Not Registered!! <a href="jsp/Register.jsp">Register Here</a></td>
                    </tr>
                </tbody>
            </table>            
	</form> 
	 </div> 
</body>
</html> 



  
