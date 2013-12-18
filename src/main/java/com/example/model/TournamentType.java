
package com.example.model;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for TournamentType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="TournamentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{}NameType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Match" type="{}MatchType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TournamentId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TournamentType", propOrder = {
        "name",
        "match"
})
public class TournamentType {

    @XmlElement(name = "Name")
    protected List<NameType> name;
    @XmlElement(name = "Match")
    protected List<MatchType> match;
    @XmlAttribute(name = "TournamentId")
    protected String tournamentId;

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
     * Gets the value of the match property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the match property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatch().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link MatchType }
     */
    public List<MatchType> getMatch() {
        if (match == null) {
            match = new ArrayList<MatchType>();
        }
        return this.match;
    }

    /**
     * Gets the value of the tournamentId property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getTournamentId() {
        return tournamentId;
    }

    /**
     * Sets the value of the tournamentId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTournamentId(String value) {
        this.tournamentId = value;
    }

}
