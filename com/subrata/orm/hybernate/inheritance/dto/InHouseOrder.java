package com.subrata.orm.hybernate.inheritance.dto;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue (value = "FOR_OFFICE_EMPLOYEE")
public class InHouseOrder extends Order {
	@Column (name = "CUBICAL_NUMBER")
	String staffCubicalNumber;

	public String getStaffCubicalNumber() {
		return staffCubicalNumber;
	}

	public void setStaffCubicalNumber(String staffCubicalNumber) {
		this.staffCubicalNumber = staffCubicalNumber;
	}
}
