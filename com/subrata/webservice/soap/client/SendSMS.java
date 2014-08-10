package com.subrata.webservice.soap.client;

import com.subrata.webservice.soap.stub.SendSMSWorld;
import com.subrata.webservice.soap.stub.SendSMSWorldSoap;

public class SendSMS {
	public static void main(String[] args) {
        
		SendSMSWorld world = new SendSMSWorld();
		SendSMSWorldSoap soap = world.getSendSMSWorldSoap();
		
		String reply = soap.sendSMS("ss@gmail.com", "91", "9886643779", "SMS from Eclipse");
		System.out.println("Status :: "+reply);
	}
}
