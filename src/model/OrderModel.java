package model;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.transform.Transformers;

import enteties.Book;
import enteties.Orders;

public class OrderModel extends AbstractModel<Book> {
	  
		public  OrderModel() {
			super ();
		}
		@SuppressWarnings("unchecked")
		public boolean create(Orders orders) {
			Integer result = true;
			Session session = sessionFactory.openSession();
			Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			AccountModel accountModel = new AccountModel();
			Orders order = new Orders(result, accountModel, false);
			order.setAccount(accountModel.find(orders.getUsername()));
			order.setUsername(orders.getUsername());
			order.setStatus(orders.isStatus());
			super.create(order);
			result = orders.getId();
			transaction.commit();
							
		}catch (Exception e) {
			result  = null;
			if(transaction !=null) {
				transaction.rollback();  
			}
			
		} finally {
			session.close();
		}
		return result;
		}
		
		
		
	}
