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
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;



//@ApplicationPath("/")
//@Path("/OrderInfo")
public class OrderService extends Application{
	public static final Logger logger =
            Logger.getLogger(OrderService.class.getCanonicalName());
/*
	Order order = null;
	
	@GET
	//@POST
    @Path("/order/{id}")
  //  @Produces({"application/xml", "application/json","application/text"})
	@Produces({MediaType.APPLICATION_JSON})
	//@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Consumes({MediaType.APPLICATION_JSON})
        //public Order getOrder(@PathParam("id") int orderId, @QueryParam("name") String name, @BeanParam Order ord) {  
		//public Order getOrder(JSONObject json) {  
		//public Order getOrder(@BeanParam Order ord) {
		public Order getOrder() {
        try { 
        	
        // Start
        	
        	//End
            order = new Order();
            //order.setId(orderId);
            order.setCollectionSize(5);
            order.setOrderType("XYZ");
            System.out.println("End ... "+ order.getId());
        } catch (Exception ex) {
        	
            logger.log(Level.SEVERE,
                    "Error calling searchCustomer() for customerId {0}. {1}",
                    new Object[]{orderId, ex.getMessage()});
        }
        System.out.println("<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>");
        return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";
        return order;
        return "Hello User";
        
    }  */ 
}
