package niren.rest.db.mongo;


import java.io.IOException;
import java.rmi.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import com.niren.base.bo.users.*;

import javax.ws.rs.core.Response;

import niren.rest.CrudService;

import org.bson.Document;






/*
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
*/
import com.google.gson.Gson;
import com.mongodb.Block;
import com.mongodb.DB;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.util.JSON;
import com.niren.base.bo.user.User;
import com.niren.base.bo.users.Users;


public class MongoConnection {
	private MongoDatabase db;
	//private DB db;
	private MongoClient mongoClient;
	private static final String host = "ds033740.mongolab.com";  //"192.168.1.9";
	private static final int port = 33740;
	//private ObjectMapper mapper;
	
	private MongoConnection(){
		try{
			MongoClientURI uri = new MongoClientURI("mongodb://niren:niren@ds033740.mongolab.com:33740/medrecords");
			mongoClient = new MongoClient(uri);	
			db = mongoClient.getDatabase("medrecords");	
			
		}catch(Exception e){
			e.printStackTrace();
		}			
	}
	
	private static MongoConnection conn = new MongoConnection();
	
	
	public static MongoConnection getInstance(){
		return conn;
	}
	
	public MongoDatabase getDatabase(){
		return db;
	}
	
	public void closeConn(){
		System.out.println("Close called");
		mongoClient.close();
		System.out.println("Conn closed");
	}
	/*
	public ObjectMapper getJacksonMapper(){
		ObjectMapper mapper = new ObjectMapper();
		mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		return mapper;
	}*/
	
	public static void main(String[] s){		
		MongoCursor<Document> cur = null;
		MongoConnection conn = MongoConnection.getInstance();
		MongoDatabase database = conn.getDatabase();
		Gson gson = new Gson();
		//MongoCollection<Document> collection =  database.getCollection("users");
		
		//addUsers(database.getCollection("users"));
		
		//
		FindIterable<Document> iterable =  database.getCollection("users").find(new Document("gId", new Long(1111111112)));
		Users users = gson.fromJson(iterable.first().toJson(),Users.class);
		System.out.println("Iterable "+users.toString());
		
		//
		
		/*
		System.out.println("Connected "+collection.count());
		cur = collection.find().iterator();	
		
		Users u = null;
		while(cur.hasNext()){							
			try {
				//System.out.println(cur.next().toJson());
				u = new Users();
				u = gson.fromJson(cur.next().toJson(), Users.class);
				System.out.println(u.getGId());
				System.out.println(u.getUser().size());
			}catch(Exception e){
				e.printStackTrace();
			}
		}		*/
			//cur.close();
			conn.closeConn();		
	}
	
	private static void addUsers(MongoCollection<Document> collection){
		Users users = new Users();
		users.setGId(new Long(1111111112));
		//List<User> lstUser = new ArrayList<User>();
		User u1 = new User();
		u1.setAge(new Long(34));
		u1.setName("Rahul");
		users.getUser().add(u1);
		
		User u2 = new User();
		u2.setAge(new Long(32));
		u2.setName("Somya");
		users.getUser().add(u2);
				
		//MongoCollection<Document> collection =  db.getCollection("users");
		Gson gson = new Gson();
		//DBObject dbObj = (DBObject)JSON.parse(gson.toJson(users, Users.class));
		System.out.println(users.getUser().get(1).getName());
		System.out.println("OBJ = "+gson.toJson(users, Users.class));
		collection.insertOne(Document.parse(gson.toJson(users, Users.class)));
	}
}
