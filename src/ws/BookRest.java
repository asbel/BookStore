package ws;

import java.util.*;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

import enteties.Book;
import model.BookModel;

@javax.ws.rs.ApplicationPath("rest")
public class BookRest {
	@GET
	@Path("findall")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Book> findAll(){
		BookModel bookmodel= new BookModel();
		return bookmodel.findAllBooks();
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
