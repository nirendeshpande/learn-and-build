<html>

<head>

<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular-resource.js"></script>
<script src="../js/LoginController.js"></script> 
<!-- <script src="js/AngularLoginService.js"></script> -->

  <meta charset="UTF-8">

  <title>MedRecords+ - Login </title>

  <link rel="stylesheet" href="../css/reset.css">

    <link rel="stylesheet" href="../css/loginstyle.css" media="screen" type="text/css" />

</head>



<br/>  
<form action="" method="post"> 
	<div class="wrap"> 
		<!-- <h3 align='center'>Register</h3> 
		<br></br>
		 -->
		<input type="text" placeholder="username" required x-ng-model="username"/>
			<div class="bar">
				<i></i>
			</div>
		<input type="text" placeholder="First Name" required x-ng-model="FirstName"/>	
	 	<div class="bar">
				<i></i>
			</div>  		
		<input type="text" placeholder="Last Name" required x-ng-model="LastName"/>
		<div class="bar">
				<i></i>
			</div>
		<input type="text" placeholder="Email" required x-ng-model="Email"/>
		<div class="bar">
				<i></i>
			</div>
		<input type="password" placeholder="password" required x-ng-model="password"/>		
		<div class="bar">
				<i></i>
			</div>
		<input type="password" placeholder="Retype Password" required x-ng-model="Retype Password"/>
		<!-- <div class="bar">
				<i></i>
			</div>
			-->
		<br></br>
		<button x-ng-click ="callSubmit()">Register</button>
	<!--  <TABLE borderColor=#056796 cellSpacing=5 cellPadding=5 align=center border=0>
		<TBODY>
			<TR>
				<TD borderColor=#056796>
				<P align=right><FONT color=#056796>Username</FONT></P></TD>
				<TD borderColor=#056796><INPUT id=text1 name=userName SIZE="16" >
				</TD>
			</TR>
			<TR>
				<TD borderColor=#056796>
				<P align=right><FONT color=#056796>First Name</FONT></P></TD>
				<TD borderColor=#056796><INPUT id=text1 name=fName SIZE="16" >
				</TD>
			</TR>
			<TR>
				<TD borderColor=#056796>
				<P align=right><FONT color=#056796>Last Name</FONT></P></TD>
				<TD borderColor=#056796><INPUT id=text1 name=lName SIZE="16" >
				</TD>
			</TR>			
			<TR>
				<TD borderColor=#056796>
				<P align=right><FONT color=#056796>Phone</FONT></P></TD>
				<TD borderColor=#056796><INPUT id=text4 name=phone SIZE="16"></TD></TR>
			<TR>
				<TD borderColor=#056796>
				<P align=right><FONT color=#056796>Email</FONT></P></TD>
				<TD borderColor=#056796><INPUT id=text5 name=email SIZE="16" ></TD></TR>
				<TD borderColor=#056796>
				<P align=right><FONT color=#056796>Password</FONT></P></TD>
				<TD borderColor=#056796><INPUT id=text7 name=password SIZE="16"></TD></TR>
			<TR>
				<TD borderColor=#056796>
				<P align=right><FONT color=#056796>Retype Password</FONT></P></TD>
				<TD borderColor=#056796><INPUT id=text8 name=retypePassword SIZE="16"></TD></TR>			
			<TR>
				<TD borderColor=#056796>
				<P align=center><INPUT id=button1 type=submit value=Register name=button1 ></P>
				</TD>
			</TR>
		</TBODY>
	</TABLE>  
	-->
	</div>
</form> 
</html> 