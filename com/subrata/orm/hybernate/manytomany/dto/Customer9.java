package com.subrata.orm.hybernate.manytomany.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity 
@Table (name = "CUSTOMER9")
public class Customer9 {
	@Id 
	@GeneratedValue (/*generator = GeneratedValue.class */ strategy = GenerationType.AUTO  /*(AUTO,IDENTITY,SEQUENCE,TABLE)*/)
	@Column (name = "CUSTOMER_ID")
	// @EmbeddedId when using a class having different columns acts as primary key we can use that.
	private int custID;
	
	@Column (name = "CUSTOMER_NAME")
	//@Transient  // will not persist the data in the DB
	//@Basic (fetch = FetchType.LAZY)
	private String custName;
	
	@ManyToMany
	private Collection<Order3> orderCollection = new ArrayList<>();
	
	public int getCustID() {
		return custID;
	}

	public void setCustID(int custID) {
		this.custID = custID;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public Collection<Order3> getOrderCollection() {
		return orderCollection;
	}

	public void setOrderCollection(Collection<Order3> orderCollection) {
		this.orderCollection = orderCollection;
	}
}
