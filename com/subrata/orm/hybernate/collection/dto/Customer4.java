package com.subrata.orm.hybernate.collection.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity 
@Table (name = "CUSTOMER4")
public class Customer4 {
	@Id 
	@GeneratedValue (/*generator = GeneratedValue.class */ strategy = GenerationType.AUTO  /*(AUTO,IDENTITY,SEQUENCE,TABLE)*/)
	@Column (name = "CUSTOMER_ID")
	// @EmbeddedId when using a class having different columns acts as primary key we can use that.
	private int custID;
	
	@Column (name = "CUSTOMER_NAME")
	//@Transient  // will not persist the dat ain the DB
	//@Basic (fetch = FetchType.LAZY)
	private String custName;
	
	// default is yyyy-mm-d xx-xx-xx (year,month,day time)
	@Temporal (TemporalType.DATE)
	@Column (name = "CUSTOMER_DOB")
	private Date birthDate;
	
	/*
	@ElementCollection
	@JoinTable ( name = "CUSTOMER4_ADDRESS" , joinColumns=@JoinColumn(name="CUSTOMER_ID"))
	private Set<Address3> listOfAddress = new HashSet<>();
	
	public Set<Address3> getListOfAddress() {
		return listOfAddress;
	}

	public void setListOfAddress(Set<Address3> listOfAddress) {
		this.listOfAddress = listOfAddress;
	}
	*/  // there is no primary key generated for address table here. to do the same use the following.
	
	@ElementCollection (fetch=FetchType.EAGER)
	//@ElementCollection (fetch=FetchType.LAZY)
	@JoinTable ( name = "ADDRESS" , joinColumns=@JoinColumn(name="CUSTOMER_ID"))
	@GenericGenerator (name = "hilo-gen" , strategy="hilo")
	@CollectionId (columns = {@Column(name="ADDRESS_ID")}, generator = "hilo-gen", type = @Type(type="long"))
	private Collection<Address3> listOfAddress = new ArrayList<>();

	public Collection<Address3> getListOfAddress() {
		return listOfAddress;
	}

	public void setListOfAddress(Collection<Address3> listOfAddress) {
		this.listOfAddress = listOfAddress;
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
