https://jersey.java.net/documentation/latest/jaxrs-resources.html
Diff ways of Packaging a RESTful service
- http://docs.oracle.com/cd/E24329_01/web.1211/e24983/configure.htm#RESTF183


http://localhost:8080/rest-service-jaxb-example/OrderInfo/order/10

- Jersey has built in support for json. (https://jersey.java.net/documentation/latest/user-guide.html#json)


Useful Links for JSON:
- http://developer.nokia.com/community/wiki/Accessing_RESTful_Web_Services_with_JavaScript


************************** GSON library to convert to and from BSON to JSON *************************

DB db = mongoClient.getDB( "mydb" );

coll = db.getCollection("testCollection");

Employee emp = new Employee();
emp.setId("1001");
emp.setName("John Doe");

//Converting a custom Class(Employee) to BasicDBObject
Gson gson = new Gson();
BasicDBObject obj = (BasicDBObject)JSON.parse(gson.toJson(emp));
coll.insert(obj);
findEmployee(new BasicDBObject("id","1001"));


public static void findEmployee(BasicDBObject query){

    DBCursor cursor = coll.find(query);

    try {
       while(cursor.hasNext()) {
          DBObject dbobj = cursor.next();
        //Converting BasicDBObject to a custom Class(Employee)
          Employee emp = (new Gson()).fromJson(dbobj.toString(), Employee.class);
          System.out.println(emp.getName());
       }
    } finally {
       cursor.close();
    }

}

*****************************************************************************************************