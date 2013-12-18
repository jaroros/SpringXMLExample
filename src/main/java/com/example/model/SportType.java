
package com.example.model;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for SportType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="SportType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{}NameType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Category" type="{}CategoryType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SportId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SportType", propOrder = {
        "name",
        "category"
})
public class SportType {

    @XmlElement(name = "Name")
    protected List<NameType> name;
    @XmlElement(name = "Category")
    protected List<CategoryType> category;
    @XmlAttribute(name = "SportId")
    protected String sportId;

    /**
     * Gets the value of the name property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link NameType }
     */
    public List<NameType> getName() {
        if (name == null) {
            name = new ArrayList<NameType>();
        }
        return this.name;
    }

    /**
     * Gets the value of the category property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the category property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategory().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link CategoryType }
     */
    public List<CategoryType> getCategory() {
        if (category == null) {
            category = new ArrayList<CategoryType>();
        }
        return this.category;
    }

    /**
     * Gets the value of the sportId property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getSportId() {
        return sportId;
    }

    /**
     * Sets the value of the sportId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSportId(String value) {
        this.sportId = value;
    }

}
