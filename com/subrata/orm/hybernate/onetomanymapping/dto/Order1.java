package com.subrata.orm.hybernate.onetomanymapping.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "ORDER1")
public class Order1 {
	@Id @GeneratedValue @Column (name = "ORDER_ID")
	private int orderId;
	
	@Column (name = "ORDER_NAME")
	private String orderName;
	
	@ManyToOne
	//@NotFound (action = NotFoundAction.IGNORE) if not able to find mapping then silently ignore it.
	private Customer7 customer;

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
	
	public Customer7 getCustomer() {
		return customer;
	}

	public void setCustomer(Customer7 customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Order1 [orderId=" + orderId + ", orderName=" + orderName
				+ ", customer=" + customer + "]";
	}
}
