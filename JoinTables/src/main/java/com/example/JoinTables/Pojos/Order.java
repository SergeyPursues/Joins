package com.example.JoinTables.Pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

/**
 * Created by rajeevkumarsingh on 27/06/17.
 */
@Entity
@Table(name = "orders")
//@EntityListeners(AuditingEntityListener.class)
//@JsonIgnoreProperties(value = {"createdAt", "updatedAt"},
//        allowGetters = true)
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="order_id")
    private String orderId;

    @Column(name="customer_id")
	private String customerIdfromOrders;
    
    @Column(name="purchase_date")
	private Date purchaseDate;
    
    @Column(name="amount_spent")
	private int amountSpent;
    
    @Column(name="most_expensive_buy_in_shop")
	private String mebFromOrders;
    
//    @OneToOne(fetch=FetchType.LAZY, mappedBy="order")
//    private Customer customer;
    
    
//    @OneToOne(mappedBy="instructorDetail", 
//			cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,
//					CascadeType.REFRESH})
//	private Instructor instructor;

//	public Customer getCustomer() {
//		return customer;
//	}
//
//	public void setCustomer(Customer customer) {
//		this.customer = customer;
//	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getCustomerIdfromOrders() {
		return customerIdfromOrders;
	}

	public void setCustomerIdfromOrders(String customerIdfromOrders) {
		this.customerIdfromOrders = customerIdfromOrders;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public int getAmountSpent() {
		return amountSpent;
	}

	public void setAmountSpent(int amountSpent) {
		this.amountSpent = amountSpent;
	}

	public String getMebFromOrders() {
		return mebFromOrders;
	}

	public void setMebFromOrders(String mebFromOrders) {
		this.mebFromOrders = mebFromOrders;
	}
    
}
