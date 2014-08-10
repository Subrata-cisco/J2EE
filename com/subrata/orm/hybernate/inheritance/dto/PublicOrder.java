package com.subrata.orm.hybernate.inheritance.dto;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue (value = "FOR_NON_OFFICE_EMPLOYEE")
public class PublicOrder extends Order {
	@Column (name = "DELIVERY_ADDRESS")
	String customerAddress;

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
}
