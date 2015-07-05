<!DOCTYPE html>
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

<body x-ng-app="myapp">
	<div x-ng-controller="HelloController" align="center">
		<form method="post">
  			<div class="wrap">
		<input type="text" placeholder="username" required x-ng-model="username"/>
		<div class="bar">
			<i></i>
		</div>
		<input type="password" placeholder="password" required x-ng-model="password"/>
		<a href="" class="forgot_link">forgot ?</a>
		<button x-ng-click ="callSubmit()">Sign in</button>
	</div>
	</form> 
	 </div> 
</body>
</html>