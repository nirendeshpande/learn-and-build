package niren.rest;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.json.simple.JSONObject;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.niren.base.bo.order.Order;

@ApplicationPath("/")
//@Path("/OrderInfo")
@Path("/LoginInfo")
public class LoginService extends Application{
	public static final Logger logger =
            Logger.getLogger(LoginService.class.getCanonicalName());

	Order order = null;
	
	//@GET
	@POST
	//@PUT
    //@Path("/order/{id}")
	@Path("/login")
  //  @Produces({"application/xml", "application/json","application/text"})
	@Produces({MediaType.APPLICATION_JSON})
	//@Produces({MediaType.APPLICATION_FORM_URLENCODED})
	//@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Consumes({MediaType.APPLICATION_JSON,MediaType.TEXT_PLAIN})
        //public Order getOrder(@PathParam("id") int orderId, @QueryParam("name") String name, @BeanParam Order ord) {  
		//public Order getOrder(JSONObject json) {  
		//public Order getOrder(@BeanParam Order ord) {
		//public Order getToken(@QueryParam("username") String username, @QueryParam("password") String password) {
		public Order getToken(@QueryParam("token") String token, Order authobj) {
        try { 
        	System.out.println("Uname is :-->"+authobj.getDescription());
        	System.out.println("Token is :-->"+token);
        // Start
        	
        	//End
            //order = new Order();
            order.setId(20);
            order.setCollectionSize(5);
            order.setOrderType("XYZ");
            System.out.println("End ... "+ order.getId());
        } catch (Exception ex) {
        	/*
            logger.log(Level.SEVERE,
                    "Error calling searchCustomer() for customerId {0}. {1}",
                    new Object[]{orderId, ex.getMessage()});*/
        }
        System.out.println("Uname is :-->"+authobj.getDescription());
        System.out.println("<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>");
        //System.out.println("Uname is :-->"+authobj.getDescription());
        //return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";
        return order;
        //return "Hello User";
    }   
}
