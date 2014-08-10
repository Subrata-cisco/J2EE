package com.subrata.webservice.soap.client;

import com.subrata.webservice.soap.ipstub.GeoIP;
import com.subrata.webservice.soap.ipstub.GeoIPService;
import com.subrata.webservice.soap.ipstub.GeoIPServiceSoap;

public class GetCountyForIP {
	public static void main(String[] args) {

		// code generation URl as follows.
		// wsimport -keep -s src -p com.subrata.webservice.soap http://www.webservicex.net/geoipservice.asmx?WSDL
		String googleIP = "74.125.236.194";
		String flipkart = "180.179.145.106";
		
		GeoIPService svc = new GeoIPService();
		GeoIPServiceSoap soap =  svc.getGeoIPServiceSoap();
		
		GeoIP ipObject = soap.getGeoIP(flipkart);
		System.out.println(" Country name ::"+ipObject.getCountryName()+" Country code ::"+ipObject.getCountryCode());
	}
}
