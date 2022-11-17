package com.zohocrm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "billings")
public class Billing {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
@Column(name = "first_name", length = 45, nullable = false)
	private String firstName;
@Column(name = "last_name", length = 45, nullable = false)
	private String lastName;
@Column(name = "email", length = 45, nullable = false, unique = true)
	private String email;
@Column(length = 45, nullable = false, unique = true)
	private long mobile;
	private String source;
	@Column(length = 155, nullable = false)
	private String product;
	@Column(length = 15, nullable = false)
	private String amount;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	
	
}
