http://javaknowledge.info/login-and-registration-example-in-jsp-with-session/

1. var client = new XMLHttpRequest();
   client.status comes as 0 all the time if the URL of the AJAX request has a different domain than the page the script is running in.
   Instead of starting from the login page with URL-->http://adminib-245l2rq:8080/web-app/ start with http://localhost:8080/web-app/ 
   so that the domain (localhost) remains constant between the 2 calls. 
   
2. client.onreadystatechange = processRequest; shud not have () at the end. This is wrong client.onreadystatechange = processRequest();

3. callSubmit() should return false to stop submitting the form if input type = submit instead of button.

query parameters are passed as part of the URL string for GET requests, and in the request body for POST requests.

****************************ANGULAR JS************************************************************************************************************   

Diff between ng-app and data-ng-app --> http://stackoverflow.com/questions/16589853/ng-app-vs-data-ng-app-what-is-the-difference
http://blog.pluralsight.com/angularjs-step-by-step-services

http://stackoverflow.com/questions/17376890/angular-js-full-example-of-get-post-delete-put-client-for-a-rest-crud-backend
http://viralpatel.net/blogs/angularjs-service-factory-tutorial/
http://www.sitepoint.com/creating-crud-app-minutes-angulars-resource/
http://www.webdeveasy.com/interceptors-in-angularjs-and-useful-examples/

Example App with MongoDB
http://architects.dzone.com/articles/modern-web-apps-using-jax-rs






