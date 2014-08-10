package com.subrata.orm.hybernate.attributeOverride.dto;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity (name = "CUSTOMER3")
public class Customer3 {
	@Id 
	@GeneratedValue (/*generator = GeneratedValue.class */ strategy = GenerationType.AUTO  /*(AUTO,IDENTITY,SEQUENCE,TABLE)*/)
	@Column (name = "USER_ID")
	// @EmbeddedId when using a class having different columns acts as primary key we can use that.
	private int custID;
	
	@Column (name = "USER_NAME")
	//@Transient
	//@Basic (fetch = FetchType.LAZY)
	private String custName;
	
	// default is yyyy-mm-d xx-xx-xx (year,month,day time)
	@Temporal (TemporalType.DATE)
	private Date birthDate;
	
	@Embedded
	@AttributeOverrides ({
			
		@AttributeOverride (name = "city" , column=@Column(name="HOME_CITY")),
		@AttributeOverride (name = "state" , column=@Column(name="HOME_STATE")),
		@AttributeOverride (name = "pin" , column=@Column(name="HOME_PIN"))
						
	})
	private Address2 homeAddress;
	
	@Embedded
	@AttributeOverrides ({
		
		@AttributeOverride (name = "city" , column=@Column(name="OFFICE_CITY")),
		@AttributeOverride (name = "state" , column=@Column(name="OFFICE_STATE")),
		@AttributeOverride (name = "pin" , column=@Column(name="OFFICE_PIN"))
						
	})
	private Address2 officeAddress; 

	public Address2 getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address2 homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address2 getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(Address2 officeAddress) {
		this.officeAddress = officeAddress;
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
