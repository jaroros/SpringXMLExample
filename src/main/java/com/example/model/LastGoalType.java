
package com.example.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LastGoalType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="LastGoalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Time">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="2011-01-04T15:15:03"/>
 *               &lt;enumeration value="2011-01-04T14:39:48"/>
 *               &lt;enumeration value="2011-01-04T15:22:45"/>
 *               &lt;enumeration value="2011-01-04T15:19:42"/>
 *               &lt;enumeration value="2011-01-04T15:22:46"/>
 *               &lt;enumeration value="2011-01-04T15:25:01"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Team">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LastGoalType", propOrder = {
        "time",
        "team"
})
public class LastGoalType {

    @XmlElement(name = "Time", required = true)
    protected String time;
    @XmlElement(name = "Team", required = true)
    protected String team;

    /**
     * Gets the value of the time property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTime(String value) {
        this.time = value;
    }

    /**
     * Gets the value of the team property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getTeam() {
        return team;
    }

    /**
     * Sets the value of the team property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTeam(String value) {
        this.team = value;
    }

}
