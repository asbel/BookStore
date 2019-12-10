package enteties;

import java.io.Serializable;
import javax.xml.bind.annotation.*;

@XmlRootElement(name = "book")
public class Book implements Serializable{
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(Integer id, String title, String genre, float price, int quantity, String gengre) {
		super();
		this.id = id;
		this.title = title;
		this.genre = genre;
		this.price = price;
		this.quantity = quantity;
		this.gengre = gengre;
	}
	@XmlElement
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) { 
		this.id = id;
	}
	@XmlElement
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@XmlElement
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@XmlElement
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	@XmlElement
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@XmlElement
	public String getGengre() {
		return gengre;
	}
	public void setGengre(String gengre) {
		this.gengre = gengre;
	}
	private Integer id;
	private String title;
	private String genre;
	private float price;
	private int quantity;
	private String gengre;

}
