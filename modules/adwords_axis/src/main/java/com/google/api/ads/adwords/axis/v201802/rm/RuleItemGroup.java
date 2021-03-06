// Copyright 2018 Google LLC
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

/**
 * RuleItemGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.rm;


/**
 * A group of rule items that are ANDed together before version V201705.
 * Starting from version V201705, rule item groups will be grouped together
 * based on
 *             {@link Rule#getRuleType()}.
 */
public class RuleItemGroup  implements java.io.Serializable {
    /* Before version V201705, rule items are ANDed together.
     *                 Starting from version V201705, rule items will be
     * grouped together based on
     *                 {@link Rule#getRuleType()}.
     *                 <span class="constraint CollectionSize">The minimum
     * size of this collection is 1. The maximum size of this collection
     * is 1000.</span>
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201802.rm.RuleItem[] items;

    public RuleItemGroup() {
    }

    public RuleItemGroup(
           com.google.api.ads.adwords.axis.v201802.rm.RuleItem[] items) {
           this.items = items;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("items", getItems())
            .toString();
    }

    /**
     * Gets the items value for this RuleItemGroup.
     * 
     * @return items   * Before version V201705, rule items are ANDed together.
     *                 Starting from version V201705, rule items will be
     * grouped together based on
     *                 {@link Rule#getRuleType()}.
     *                 <span class="constraint CollectionSize">The minimum
     * size of this collection is 1. The maximum size of this collection
     * is 1000.</span>
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.rm.RuleItem[] getItems() {
        return items;
    }


    /**
     * Sets the items value for this RuleItemGroup.
     * 
     * @param items   * Before version V201705, rule items are ANDed together.
     *                 Starting from version V201705, rule items will be
     * grouped together based on
     *                 {@link Rule#getRuleType()}.
     *                 <span class="constraint CollectionSize">The minimum
     * size of this collection is 1. The maximum size of this collection
     * is 1000.</span>
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setItems(com.google.api.ads.adwords.axis.v201802.rm.RuleItem[] items) {
        this.items = items;
    }

    public com.google.api.ads.adwords.axis.v201802.rm.RuleItem getItems(int i) {
        return this.items[i];
    }

    public void setItems(int i, com.google.api.ads.adwords.axis.v201802.rm.RuleItem _value) {
        this.items[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RuleItemGroup)) return false;
        RuleItemGroup other = (RuleItemGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.items==null && other.getItems()==null) || 
             (this.items!=null &&
              java.util.Arrays.equals(this.items, other.getItems())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RuleItemGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "RuleItemGroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("items");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "items"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "RuleItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
