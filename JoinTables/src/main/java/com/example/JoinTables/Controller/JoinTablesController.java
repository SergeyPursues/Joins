package com.example.JoinTables.Controller;


import com.example.JoinTables.Pojos.Customer;
import com.example.JoinTables.Pojos.JoinResults;
import com.example.JoinTables.Pojos.Order;
import com.example.JoinTables.Repositories.CustomerRepository;
import com.example.JoinTables.Repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.SqlResultSetMapping;
import javax.validation.Valid;
import java.util.List;

/**
 * Created by rajeevkumarsingh on 27/06/17.
 */



@RestController
public class JoinTablesController {

    @Autowired
    CustomerRepository customerRepository;
    
    @Autowired
    OrderRepository orderRepository;
    
    @PersistenceContext
    private EntityManager em;

    @RequestMapping("/customers")
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
    
    @RequestMapping("/orders")
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
    
 
	@RequestMapping("/joined")
    public List<JoinResults> getJoins() {
    	
//    	String query = "SELECT c.customer_id, c.first_name, c.last_name, c.year_of_birth, c.most_expensive_buy_in_shop AS customer_meb "
//		+ "o.order_id, o.purchase_date, o.amount_spent, o.most_expensive_buy_in_shop AS order_meb "
//		+ "FROM customers AS c "
//		+ "LEFT JOIN orders AS o ON c.customer_id=o.customer_id";
    	
    	
//    	String query = "SELECT c "
//    			+ "FROM Customer c "
//    			+ "LEFT JOIN Order o ON c.customerId=o.customerIdfromOrders";
    	
    	// SELECT e FROM Employee e LEFT JOIN MailingAddress a ON e.address = a.address
    	
    	String query2 = "SELECT c.customer_id, c.first_name, c.last_name, "
    			+ "c.year_of_birth, c.most_expensive_buy_in_shop AS customer_meb, "
    			+ "o.order_id, o.purchase_date, o.amount_spent, "
    			+ "o.most_expensive_buy_in_shop AS order_meb "
    			+ "FROM customers AS c LEFT OUTER JOIN orders AS o "
    			+ "ON c.customer_id=o.customer_id"; //,MyValueMapping;
    	
    	Query q = em.createNativeQuery(query2, "JoinResults");
    	    	
    	
    	return q.getResultList();
    }
    
}
    	    


    	
    	
//    	List<MappedValue> newClass = em.createNativeQuery(query2, MyValueMapping);
//    	
//    	
//    	@SqlResultSetMapping(
//    	        name = "MyValueMapping",
//    	        classes = @ConstructorResult(
//    	                targetClass = MappedValue.class,
//    	                columns = {
//    	                    @ColumnResult(name = "customer_id"),
//    	                    @ColumnResult(name = "first_name"),
//    	                    @ColumnResult(name = "last_name"),
//    	                    @ColumnResult(name = "year_of_birth", type = Long.class),
//    	                    @ColumnResult(name = "customer_meb"),
//    	                    @ColumnResult(name = "order_id"),
//    	                    @ColumnResult(name = "purchase_date"),
//    	                    @ColumnResult(name = "amount_spent", type = Long.class),
//    	                    @ColumnResult(name = "order_meb")}))
//    	
//    	return em.createNativeQuery(query2).getResultList();
    
