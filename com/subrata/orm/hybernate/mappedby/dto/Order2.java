package com.subrata.orm.hybernate.mappedby.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "ORDER2")
public class Order2 {
	@Id @GeneratedValue @Column (name = "ORDER_ID")
	private int orderId;
	
	@Column (name = "ORDER_NAME")
	private String orderName;
	
	@ManyToOne
	@JoinColumn(name="CUSTOMER_ID")
	private Customer8 customer;

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
	
	public Customer8 getCustomer() {
		return customer;
	}

	public void setCustomer(Customer8 customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Order2 [orderId=" + orderId + ", orderName=" + orderName
				+ ", customer=" + customer + "]";
	}
}
