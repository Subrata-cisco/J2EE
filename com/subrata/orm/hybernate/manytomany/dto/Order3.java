package com.subrata.orm.hybernate.manytomany.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table (name = "ORDER3")
public class Order3 {
	@Id @GeneratedValue @Column (name = "ORDER_ID")
	private int orderId;
	
	@Column (name = "ORDER_NAME")
	private String orderName;
	
	@ManyToMany(mappedBy="orderCollection")
	private Collection<Customer9> customerList = new ArrayList<>();

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public Collection<Customer9> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(Collection<Customer9> customerList) {
		this.customerList = customerList;
	}
	
	
	
}
