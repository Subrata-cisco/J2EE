package com.subrata.orm.hybernate.mappedby.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity 
@Table (name = "CUSTOMER8")
public class Customer8 {
	@Id 
	@GeneratedValue (/*generator = GeneratedValue.class */ strategy = GenerationType.AUTO  /*(AUTO,IDENTITY,SEQUENCE,TABLE)*/)
	@Column (name = "CUSTOMER_ID")
	// @EmbeddedId when using a class having different columns acts as primary key we can use that.
	private int custID;
	
	@Column (name = "CUSTOMER_NAME")
	//@Transient  // will not persist the data in the DB
	//@Basic (fetch = FetchType.LAZY)
	private String custName;
	
	@OneToMany (mappedBy="customer")
	private Collection<Order2> orderCollection = new ArrayList<>();
	
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

	public Collection<Order2> getOrderCollection() {
		return orderCollection;
	}

	public void setOrderCollection(Collection<Order2> orderCollection) {
		this.orderCollection = orderCollection;
	}
}
