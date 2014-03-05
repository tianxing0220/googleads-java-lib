
package com.google.api.ads.dfp.jaxws.v201308;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Updates the specified {@link Proposal} objects.
 *             
 *             @param proposals the proposals to update
 *             @return the updated proposals
 *           
 * 
 * <p>Java class for updateProposals element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="updateProposals">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="proposals" type="{https://www.google.com/apis/ads/publisher/v201308}Proposal" maxOccurs="unbounded" minOccurs="0"/>
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
    "proposals"
})
@XmlRootElement(name = "updateProposals")
public class ProposalServiceInterfaceupdateProposals {

    protected List<Proposal> proposals;

    /**
     * Gets the value of the proposals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the proposals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProposals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Proposal }
     * 
     * 
     */
    public List<Proposal> getProposals() {
        if (proposals == null) {
            proposals = new ArrayList<Proposal>();
        }
        return this.proposals;
    }

}
