package com.subrata.orm.hybernate.basic.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity (name = "CUSTOMER1")
public class Customer1 {
	@Id 
	@GeneratedValue (/*generator = GeneratedValue.class */ strategy = GenerationType.AUTO  /*(AUTO,IDENTITY,SEQUENCE,TABLE)*/)
	@Column (name = "USER_ID")
	int custID;
	
	@Column (name = "USER_NAME")
	//@Transient
	//@Basic (fetch = FetchType.LAZY)
	String custName;
	
	// default is yyyy-mm-d xx-xx-xx (year,month,day time)
	@Temporal (TemporalType.DATE)
	Date birthDate;
	
	// default is varchar(255)
	@Lob
	String custDetails;
	
	public String getCustDetails() {
		return custDetails;
	}

	public void setCustDetails(String custDetails) {
		this.custDetails = custDetails;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

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
}
