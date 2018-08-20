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
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="customer_id")
    private String customerId;
    
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name="customer_id")
//    private String customerId;

    @Column(name="first_name")
	private String firstName;
    
    @Column(name="last_name")
	private String lastName;
    
    @Column(name="year_of_birth")
	private int birthYear;
    
    @Column(name="job")
   	private String job;

    @Column(name="most_expensive_buy_in_shop")
	private String customerMeb;
    
//    @OneToOne() - was ist wenn die JoinColumn auch die IdColumn ist? wie schreibt man das in den Code?
//    @JoinColumn(name="order_id")
//    private Order order;
//
//    
//    public Order getOrder() {
//		return order;
//	}
//
//	public void setOrder(Order order) {
//		this.order = order;
//	}
    
//  @OneToOne()
//  @JoinColumn(name="customer_id")
//  private Order order;
//
//  
//  public Order getOrder() {
//		return order;
//	}
//
//	public void setOrder(Order order) {
//		this.order = order;
//	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

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

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public String getCustomerMeb() {
		return customerMeb;
	}

	public void setCustomerMeb(String customerMeb) {
		this.customerMeb = customerMeb;
	}

    
}
