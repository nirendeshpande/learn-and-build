var myapp = angular.module('myapp', ['ngResource']);

myapp.factory('CallRest', function($resource){
	
	//GET with parameter
	//return $resource('http://localhost:8080/rest-service-jaxb-example/OrderInfo/order/:id');
	
	//GET without parameter
	//return $resource('http://localhost:8080/rest-service-jaxb-example/LoginInfo/login');
	
	/* PUT with parameter
	return $resource('http://localhost:8080/rest-service-jaxb-example/LoginInfo/login',{},{
		update: {method:'PUT', params:{username: '@username',passowrd:'@password'},headers: {
            'Content-Type': 'application/json'
        }}
	}); */
	
	// POST with parameters
	/*
	return $resource('http://localhost:8080/rest-service-jaxb-example/LoginInfo/login',{},{
		update: {method:'POST', params:{username:'@username',passowrd:'@password'},headers: {
            'Content-Type':'application/x-www-form-urlencoded'
        }		      
        }
	}); 	
	*/
	return $resource('http://localhost:8080/rest-service-jaxb-example/LoginInfo/login',{},{
		update: {method:'POST', responseType:'json',headers: {
            'Content-Type':'application/json'
        }		      
        }
	}); 	
});

myapp.controller("HelloController", function($scope, $window, CallRest) {
    //$scope.helloTo = {};
    //$scope.helloTo.title = "World, AngularJS";
	
    $scope.callSubmit = function() {
        alert("Clicked");
        //$scope.username = "Hello";
        var user = $scope.username;
        //alert(user);
        var authobj = 	;
        alert(authobj.description);
        //GET
       //var order = CallRest.get({id:10}, function(data){
        
       //POST call
        /*
       CallRest.update({username:$scope.username,password:$scope.password}).$promise.then(//success
    	        function(success){
    	        	alert('Hello: '+JSON.stringify(success))},
    	        //error
    	        function(error){
    	        		alert('No Hello')});   
       */       
        // POST with params and payload both. Response object does not have the success status code. Angular has a bug (Refer github)
        
        CallRest.update({token:"Ira"}, authobj,function(response){
        	alert(response.data);
        	var myData = response.data;
        	
        });
        
        // POST with params and payload both.
        /*
        CallRest.update({token:"Ira"}, authobj).$promise.then(//success
    	        function(success){
    	        	alert('Login Successful');
    	        	$window.location.href = 'Register.jsp';
    	        	},
    	        //error
    	        function(error){
    	        		alert('ERROR '+error)});   */	       		
    	       		
    };
    });