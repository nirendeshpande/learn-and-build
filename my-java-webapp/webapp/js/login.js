function callSubmit() { 
	  //alert("Before")
      //document.forms[0].submit();
	  var params = JSON.stringify({Id:"7",OrderType:"Bulk"});
	   //var params = "Id=7&OrderType=Bulk";
	  alert(params);
	 //var url = "http://localhost:8080/rest-service-jaxb-example/OrderInfo/order/10?name=Ira";
	 var url = "http://localhost:8080/rest-service-jaxb-example/OrderInfo/order/10";
	 //var delimiter = "&";
	 //url = url + "?order=params";
	 //url = url + "?" + params;
	 alert(url);
	  	  
	  var client = new XMLHttpRequest();	  
	  client.onreadystatechange = processRequest;	 
	  	 	  
	  function processRequest()	  
	   {		
		  alert(client.status);
	      if (client.readyState==4 && client.status==200)
	      {    	
	         var a = JSON.parse(client.responseText);	         
	         document.getElementById("uname").value = a.id;	         
	      }
	   }		
	  client.open("POST",url,true);
	  //client.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
	  client.setRequestHeader("Content-Type", "application/json;charset=UTF-8");
	  //client.send();
	  client.send(params);
	  
	  /*
	  if (client.status == 200)
		 alert("hello");
	  /*
	  if (client.status == 200)		 
		  alert("The request succeeded!\n\nThe response representation was:\n\n" + client.responseText)
	  else
		  alert("The request did not succeed!\n\nThe response status was: " + client.status + " " + client.statusText + ".");
	  //alert("After")
	  //client.setRequestHeader("Content-Type", "text/plain");
	  */
	  //return false;
  }

function clickRegister(){



}

