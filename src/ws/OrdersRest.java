package ws;

import java.util.*;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import enteties.Book;
import enteties.Orders;
import model.BookModel;
import model.OrderModel;

@javax.ws.rs.ApplicationPath("rest")

@Path("/orders")
public class OrdersRest {
		
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response create(Orders orders){
		try {
			OrderModel orderModel = new OrderModel();
			return Response.status(Response.Status.OK).build();
			orderModel.create(orders);
		} catch(Exception e) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		
		
	}
	
	@GET
	@Path("find")
	@Produces(MediaType.APPLICATION_JSON)
	public Book find(@PathParam("id") Integer id){
		BookModel bookmodel= new BookModel();
		return bookmodel.findBook();
	}
	private void addRestResourceClasses(Set<Class>)
}


}
