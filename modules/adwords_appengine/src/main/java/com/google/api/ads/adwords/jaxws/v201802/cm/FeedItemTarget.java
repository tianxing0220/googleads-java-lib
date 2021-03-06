// Copyright 2018 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.google.api.ads.adwords.jaxws.v201802.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents one target for a FeedItem.
 *           
 * 
 * <p>Java class for FeedItemTarget complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeedItemTarget">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="feedId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="feedItemId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="targetType" type="{https://adwords.google.com/api/adwords/cm/v201802}FeedItemTargetType" minOccurs="0"/>
 *         &lt;element name="status" type="{https://adwords.google.com/api/adwords/cm/v201802}FeedItemTargetStatus" minOccurs="0"/>
 *         &lt;element name="FeedItemTarget.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeedItemTarget", propOrder = {
    "feedId",
    "feedItemId",
    "targetType",
    "status",
    "feedItemTargetType"
})
@XmlSeeAlso({
    FeedItemCriterionTarget.class,
    FeedItemAdGroupTarget.class,
    FeedItemCampaignTarget.class
})
public abstract class FeedItemTarget {

    protected Long feedId;
    protected Long feedItemId;
    @XmlSchemaType(name = "string")
    protected FeedItemTargetType targetType;
    @XmlSchemaType(name = "string")
    protected FeedItemTargetStatus status;
    @XmlElement(name = "FeedItemTarget.Type")
    protected String feedItemTargetType;

    /**
     * Gets the value of the feedId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFeedId() {
        return feedId;
    }

    /**
     * Sets the value of the feedId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFeedId(Long value) {
        this.feedId = value;
    }

    /**
     * Gets the value of the feedItemId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFeedItemId() {
        return feedItemId;
    }

    /**
     * Sets the value of the feedItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFeedItemId(Long value) {
        this.feedItemId = value;
    }

    /**
     * Gets the value of the targetType property.
     * 
     * @return
     *     possible object is
     *     {@link FeedItemTargetType }
     *     
     */
    public FeedItemTargetType getTargetType() {
        return targetType;
    }

    /**
     * Sets the value of the targetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeedItemTargetType }
     *     
     */
    public void setTargetType(FeedItemTargetType value) {
        this.targetType = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link FeedItemTargetStatus }
     *     
     */
    public FeedItemTargetStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeedItemTargetStatus }
     *     
     */
    public void setStatus(FeedItemTargetStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the feedItemTargetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedItemTargetType() {
        return feedItemTargetType;
    }

    /**
     * Sets the value of the feedItemTargetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedItemTargetType(String value) {
        this.feedItemTargetType = value;
    }

}
