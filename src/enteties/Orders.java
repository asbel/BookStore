package enteties;
import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import enteties.Account;
import enteties.Ordersdetail;
import model.AccountModel;

@XmlRootElement(name = "orders")
public class Orders implements Serializable {

	private Integer id;
	private String username;
	private boolean status;
	
	public Orders(Integer id, AccountModel accountModel, boolean status) {
		super();
		this.id = id;
		this.username = username;
		this.status = status;
	}
	@XmlElement
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@XmlElement
	public String getUsername() {
		return username;
	}
	public void setUsername(String string) {
		this.username = username;
	}
	
	@XmlElement
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	

}
