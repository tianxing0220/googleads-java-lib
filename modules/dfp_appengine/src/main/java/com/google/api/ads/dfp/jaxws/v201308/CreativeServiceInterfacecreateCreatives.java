
package com.google.api.ads.dfp.jaxws.v201308;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Creates new {@link Creative} objects.
 *             
 *             @param creatives the creatives to create
 *             @return the created creatives with their IDs filled in
 *           
 * 
 * <p>Java class for createCreatives element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="createCreatives">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="creatives" type="{https://www.google.com/apis/ads/publisher/v201308}Creative" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "creatives"
})
@XmlRootElement(name = "createCreatives")
public class CreativeServiceInterfacecreateCreatives {

    protected List<Creative> creatives;

    /**
     * Gets the value of the creatives property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creatives property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreatives().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Creative }
     * 
     * 
     */
    public List<Creative> getCreatives() {
        if (creatives == null) {
            creatives = new ArrayList<Creative>();
        }
        return this.creatives;
    }

}
