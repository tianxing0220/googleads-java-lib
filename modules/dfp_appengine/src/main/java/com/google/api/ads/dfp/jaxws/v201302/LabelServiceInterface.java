
package com.google.api.ads.dfp.jaxws.v201302;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Provides methods for the creation and management of Labels.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebService(name = "LabelServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v201302")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface LabelServiceInterface {


    /**
     * 
     *         Creates a new {@link Label}.
     *         
     *         The following fields are required:
     *         <ul>
     *         <li>{@link Label#name}</li>
     *         <li>{@link Label#type}</li>
     *         </ul>
     *         
     *         @param label the label to create
     *         @return the label with its ID filled in
     *       
     * 
     * @param label
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201302.Label
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201302")
    @RequestWrapper(localName = "createLabel", targetNamespace = "https://www.google.com/apis/ads/publisher/v201302", className = "com.google.api.ads.dfp.jaxws.v201302.LabelServiceInterfacecreateLabel")
    @ResponseWrapper(localName = "createLabelResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201302", className = "com.google.api.ads.dfp.jaxws.v201302.LabelServiceInterfacecreateLabelResponse")
    public Label createLabel(
        @WebParam(name = "label", targetNamespace = "https://www.google.com/apis/ads/publisher/v201302")
        Label label)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Creates new {@link Label} objects.
     *         
     *         @param labels the labels to create
     *         @return the created labels with their IDs filled in
     *       
     * 
     * @param labels
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201302.Label>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201302")
    @RequestWrapper(localName = "createLabels", targetNamespace = "https://www.google.com/apis/ads/publisher/v201302", className = "com.google.api.ads.dfp.jaxws.v201302.LabelServiceInterfacecreateLabels")
    @ResponseWrapper(localName = "createLabelsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201302", className = "com.google.api.ads.dfp.jaxws.v201302.LabelServiceInterfacecreateLabelsResponse")
    public List<Label> createLabels(
        @WebParam(name = "labels", targetNamespace = "https://www.google.com/apis/ads/publisher/v201302")
        List<Label> labels)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns the {@link Label} uniquely identified by the given ID.
     *         
     *         @param labelId the ID of the label, which must already exist
     *         @return the {@code Label} uniquely identified by the given ID
     *       
     * 
     * @param labelId
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201302.Label
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201302")
    @RequestWrapper(localName = "getLabel", targetNamespace = "https://www.google.com/apis/ads/publisher/v201302", className = "com.google.api.ads.dfp.jaxws.v201302.LabelServiceInterfacegetLabel")
    @ResponseWrapper(localName = "getLabelResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201302", className = "com.google.api.ads.dfp.jaxws.v201302.LabelServiceInterfacegetLabelResponse")
    public Label getLabel(
        @WebParam(name = "labelId", targetNamespace = "https://www.google.com/apis/ads/publisher/v201302")
        Long labelId)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link LabelPage} of {@link Label} objects that satisfy the
     *         given {@link Statement#query}. The following fields are supported for
     *         filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link Label#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code type}</td>
     *         <td>{@link Label#type}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link Label#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code description}</td>
     *         <td>{@link Label#description}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code isActive}</td>
     *         <td>{@link Label#isActive}</td>
     *         </tr>
     *         </table>
     *         
     *         
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of labels.
     *         @return the labels that match the given filter
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201302.LabelPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201302")
    @RequestWrapper(localName = "getLabelsByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201302", className = "com.google.api.ads.dfp.jaxws.v201302.LabelServiceInterfacegetLabelsByStatement")
    @ResponseWrapper(localName = "getLabelsByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201302", className = "com.google.api.ads.dfp.jaxws.v201302.LabelServiceInterfacegetLabelsByStatementResponse")
    public LabelPage getLabelsByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201302")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs actions on {@link Label} objects that match the given
     *         {@link Statement#query}.
     *         
     *         @param labelAction the action to perform
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of labels
     *         @return the result of the action performed
     *       
     * 
     * @param labelAction
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201302.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201302")
    @RequestWrapper(localName = "performLabelAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201302", className = "com.google.api.ads.dfp.jaxws.v201302.LabelServiceInterfaceperformLabelAction")
    @ResponseWrapper(localName = "performLabelActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201302", className = "com.google.api.ads.dfp.jaxws.v201302.LabelServiceInterfaceperformLabelActionResponse")
    public UpdateResult performLabelAction(
        @WebParam(name = "labelAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201302")
        LabelAction labelAction,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201302")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link Label}.
     *         
     *         @param label the label to update
     *         @return the updated label
     *       
     * 
     * @param label
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201302.Label
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201302")
    @RequestWrapper(localName = "updateLabel", targetNamespace = "https://www.google.com/apis/ads/publisher/v201302", className = "com.google.api.ads.dfp.jaxws.v201302.LabelServiceInterfaceupdateLabel")
    @ResponseWrapper(localName = "updateLabelResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201302", className = "com.google.api.ads.dfp.jaxws.v201302.LabelServiceInterfaceupdateLabelResponse")
    public Label updateLabel(
        @WebParam(name = "label", targetNamespace = "https://www.google.com/apis/ads/publisher/v201302")
        Label label)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link Label} objects.
     *         
     *         @param labels the labels to update
     *         @return the updated labels
     *       
     * 
     * @param labels
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201302.Label>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201302")
    @RequestWrapper(localName = "updateLabels", targetNamespace = "https://www.google.com/apis/ads/publisher/v201302", className = "com.google.api.ads.dfp.jaxws.v201302.LabelServiceInterfaceupdateLabels")
    @ResponseWrapper(localName = "updateLabelsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201302", className = "com.google.api.ads.dfp.jaxws.v201302.LabelServiceInterfaceupdateLabelsResponse")
    public List<Label> updateLabels(
        @WebParam(name = "labels", targetNamespace = "https://www.google.com/apis/ads/publisher/v201302")
        List<Label> labels)
        throws ApiException_Exception
    ;

}
