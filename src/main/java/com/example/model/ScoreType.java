
package com.example.model;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for ScoreType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="ScoreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Team1">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="5"/>
 *               &lt;enumeration value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Team2">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScoreType", propOrder = {
        "team1",
        "team2"
})
public class ScoreType {

    @XmlElement(name = "Team1", required = true)
    protected String team1;
    @XmlElement(name = "Team2", required = true)
    protected String team2;
    @XmlAttribute
    protected String type;

    /**
     * Gets the value of the team1 property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getTeam1() {
        return team1;
    }

    /**
     * Sets the value of the team1 property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTeam1(String value) {
        this.team1 = value;
    }

    /**
     * Gets the value of the team2 property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getTeam2() {
        return team2;
    }

    /**
     * Sets the value of the team2 property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTeam2(String value) {
        this.team2 = value;
    }

    /**
     * Gets the value of the type property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setType(String value) {
        this.type = value;
    }

}
