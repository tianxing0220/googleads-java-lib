
package com.google.api.ads.adwords.jaxws.v201306.cm;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "CampaignAdExtensionService", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201306", wsdlLocation = "https://adwords.google.com/api/adwords/cm/v201306/CampaignAdExtensionService?wsdl")
public class CampaignAdExtensionService
    extends Service
{

    private final static URL CAMPAIGNADEXTENSIONSERVICE_WSDL_LOCATION;
    private final static WebServiceException CAMPAIGNADEXTENSIONSERVICE_EXCEPTION;
    private final static QName CAMPAIGNADEXTENSIONSERVICE_QNAME = new QName("https://adwords.google.com/api/adwords/cm/v201306", "CampaignAdExtensionService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://adwords.google.com/api/adwords/cm/v201306/CampaignAdExtensionService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CAMPAIGNADEXTENSIONSERVICE_WSDL_LOCATION = url;
        CAMPAIGNADEXTENSIONSERVICE_EXCEPTION = e;
    }

    public CampaignAdExtensionService() {
        super(__getWsdlLocation(), CAMPAIGNADEXTENSIONSERVICE_QNAME);
    }

    public CampaignAdExtensionService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns CampaignAdExtensionServiceInterface
     */
    @WebEndpoint(name = "CampaignAdExtensionServiceInterfacePort")
    public CampaignAdExtensionServiceInterface getCampaignAdExtensionServiceInterfacePort() {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/cm/v201306", "CampaignAdExtensionServiceInterfacePort"), CampaignAdExtensionServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CampaignAdExtensionServiceInterface
     */
    @WebEndpoint(name = "CampaignAdExtensionServiceInterfacePort")
    public CampaignAdExtensionServiceInterface getCampaignAdExtensionServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/cm/v201306", "CampaignAdExtensionServiceInterfacePort"), CampaignAdExtensionServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CAMPAIGNADEXTENSIONSERVICE_EXCEPTION!= null) {
            throw CAMPAIGNADEXTENSIONSERVICE_EXCEPTION;
        }
        return CAMPAIGNADEXTENSIONSERVICE_WSDL_LOCATION;
    }

}
