package model;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.transform.Transformers;

import enteties.Book;

public class OrderModel l extends AbstractModel<Book> {
	  
		public  OrderModel() {
			super();
		}
		@SuppressWarnings("unchecked")
		public List<Book> findAllBooks(){	
			List<Book> result = new ArrayList<>();
			Session session = sessionFactory.openSession();
			Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			result = (List<Book>) session.createQuery("select b.id as id"
			+"b.title as title," +"b.quantity as quantity," +
			"b.price as price," + "from book b"
			+" where b.id = :id")
					.setResultTransformer(Transformers.aliasToBean(Book.class)).uniqueResult();
			transaction.commit();
			
		}catch (Exception e) {
			result  = null;
			if(transaction !=null) {
				transaction.rollback();  
			}
			
		}
		return result;
		
		}
		
		public Book findBook(){	
			Book result = new Book();
			Session session = sessionFactory.openSession();
			Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			result = (Book) session.createQuery("select b.id as id"
			+"b.title as title," +"b.quantity as quantity," +
			"b.price as price," + "from book b"
			+" where b.id = :id")
					.setResultTransformer(Transformers.aliasToBean(Book.class)).uniqueResult();
			transaction.commit();
			
		}catch (Exception e) {
			result  = null;
			if(transaction !=null) {
				transaction.rollback();  
			}
			
		}
		return result;
		
		}
	}
