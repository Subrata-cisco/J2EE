package com.subrata.orm.hybernate.attributeOverride.dto;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address2 {
	@Column (name = "CITY")
	String city;
	
	@Column (name = "STATE")
	String state;
	
	@Column (name = "PIN")
	String pin;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", pin=" + pin
				+ "]";
	}
}
