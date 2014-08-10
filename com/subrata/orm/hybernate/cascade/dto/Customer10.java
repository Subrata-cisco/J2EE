package com.subrata.orm.hybernate.cascade.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity 
@Table (name = "CUSTOMER10")
public class Customer10 {
	@Id 
	@GeneratedValue (/*generator = GeneratedValue.class */ strategy = GenerationType.AUTO  /*(AUTO,IDENTITY,SEQUENCE,TABLE)*/)
	@Column (name = "CUSTOMER_ID")
	// @EmbeddedId when using a class having different columns acts as primary key we can use that.
	private int custID;
	
	@Column (name = "CUSTOMER_NAME")
	//@Transient  // will not persist the data in the DB
	//@Basic (fetch = FetchType.LAZY)
	private String custName;
	
	@OneToMany (cascade = CascadeType.PERSIST)
	//@JoinTable(name="CUSTOMER_ORDER" , joinColumns=@JoinColumn(name="CUSTOMER_ID"),inverseJoinColumns=@JoinColumn(name="ORDER_ID"))
	private Collection<Order4> orderCollection = new ArrayList<>();
	
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

	public Collection<Order4> getOrderCollection() {
		return orderCollection;
	}

	public void setOrderCollection(Collection<Order4> orderCollection) {
		this.orderCollection = orderCollection;
	}
}
