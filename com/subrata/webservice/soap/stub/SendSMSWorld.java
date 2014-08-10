
package com.subrata.webservice.soap.stub;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "SendSMSWorld", targetNamespace = "http://www.webserviceX.NET", wsdlLocation = "http://www.webservicex.net/sendsmsworld.asmx?WSDL")
public class SendSMSWorld
    extends Service
{

    private final static URL SENDSMSWORLD_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.subrata.webservice.soap.stub.SendSMSWorld.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.subrata.webservice.soap.stub.SendSMSWorld.class.getResource(".");
            url = new URL(baseUrl, "http://www.webservicex.net/sendsmsworld.asmx?WSDL");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://www.webservicex.net/sendsmsworld.asmx?WSDL', retrying as a local file");
            logger.warning(e.getMessage());
        }
        SENDSMSWORLD_WSDL_LOCATION = url;
    }

    public SendSMSWorld(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SendSMSWorld() {
        super(SENDSMSWORLD_WSDL_LOCATION, new QName("http://www.webserviceX.NET", "SendSMSWorld"));
    }

    /**
     * 
     * @return
     *     returns SendSMSWorldSoap
     */
    @WebEndpoint(name = "SendSMSWorldSoap")
    public SendSMSWorldSoap getSendSMSWorldSoap() {
        return super.getPort(new QName("http://www.webserviceX.NET", "SendSMSWorldSoap"), SendSMSWorldSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SendSMSWorldSoap
     */
    @WebEndpoint(name = "SendSMSWorldSoap")
    public SendSMSWorldSoap getSendSMSWorldSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.webserviceX.NET", "SendSMSWorldSoap"), SendSMSWorldSoap.class, features);
    }

}