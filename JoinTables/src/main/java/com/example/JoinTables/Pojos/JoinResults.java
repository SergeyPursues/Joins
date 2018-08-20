package com.example.JoinTables.Pojos;

//import com.example.JoinTables.Controller.EntityResult;
//import com.example.JoinTables.Controller.FieldResult;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by rajeevkumarsingh on 27/06/17.
 */
@Entity
@SqlResultSetMapping(name="JoinResults", 
entities={ 
    @EntityResult(entityClass=com.example.JoinTables.Pojos.JoinResults.class, fields={
        @FieldResult(name="customerId", column="customer_id"),
        @FieldResult(name="firstName", column="first_name"), 
        @FieldResult(name="lastName", column="last_name"),
        @FieldResult(name="birthYear", column="year_of_birth"),
        @FieldResult(name="customerMeb", column="customer_meb"), 
        @FieldResult(name="orderId", column="order_id"),
        @FieldResult(name="purchaseDate", column="purchase_date"),
        @FieldResult(name="amountSpent", column="amount_spent"),
        @FieldResult(name="orderMeb", column="order_meb")
        })} //,
//columns={
//    @ColumnResult(name="order_id"),
//    @ColumnResult(name="order_id"),
)

public class JoinResults implements Serializable {
   
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String customerId;
	private String firstName;
	private String lastName;
	private Integer birthYear;
	private String customerMeb;
	private String orderId;
	private Date purchaseDate;
	private Integer amountSpent;
	private String orderMeb;
	
	public JoinResults(String customerId, String firstName, String lastName, Integer birthYear, String customerMeb,
			String orderId, Date purchaseDate, Integer amountSpent, String orderMeb) {
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
		this.customerMeb = customerMeb;
		this.orderId = orderId;
		this.purchaseDate = purchaseDate;
		this.amountSpent = amountSpent;
		this.orderMeb = orderMeb;
	}
	
	public JoinResults() {}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(Integer birthYear) {
		this.birthYear = birthYear;
	}

	public String getCustomerMeb() {
		return customerMeb;
	}

	public void setCustomerMeb(String customerMeb) {
		this.customerMeb = customerMeb;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public Integer getAmountSpent() {
		return amountSpent;
	}

	public void setAmountSpent(Integer amountSpent) {
		this.amountSpent = amountSpent;
	}

	public String getOrderMeb() {
		return orderMeb;
	}

	public void setOrderMeb(String orderMeb) {
		this.orderMeb = orderMeb;
	}
	
	
    
	
	
  
}
