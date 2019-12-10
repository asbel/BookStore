package ws;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import enteties.Book;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/api")
public class ApplicationConfig extends Application {
    public Set<Class<?>> getClasses() {
    	Set<Class<?>> resources = new HashSet<Class<?>>(Arrays.asList(Book.class));
		return resources;
    }
}
