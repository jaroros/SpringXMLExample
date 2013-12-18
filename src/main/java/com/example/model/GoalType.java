
package com.example.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GoalType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="GoalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Time">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="6"/>
 *               &lt;enumeration value="12"/>
 *               &lt;enumeration value="41"/>
 *               &lt;enumeration value="47"/>
 *               &lt;enumeration value="62"/>
 *               &lt;enumeration value="65"/>
 *               &lt;enumeration value="10"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="7"/>
 *               &lt;enumeration value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Team1">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Team2">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="3"/>
 *               &lt;enumeration value="4"/>
 *               &lt;enumeration value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Player" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ScoringTeam">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="1"/>
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
@XmlType(name = "GoalType", propOrder = {
        "time",
        "team1",
        "team2",
        "player",
        "scoringTeam"
})
public class GoalType {

    @XmlElement(name = "Time", required = true)
    protected String time;
    @XmlElement(name = "Team1", required = true)
    protected String team1;
    @XmlElement(name = "Team2", required = true)
    protected String team2;
    @XmlElement(name = "Player", required = true)
    protected String player;
    @XmlElement(name = "ScoringTeam", required = true)
    protected String scoringTeam;

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
     * Gets the value of the player property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getPlayer() {
        return player;
    }

    /**
     * Sets the value of the player property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPlayer(String value) {
        this.player = value;
    }

    /**
     * Gets the value of the scoringTeam property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getScoringTeam() {
        return scoringTeam;
    }

    /**
     * Sets the value of the scoringTeam property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setScoringTeam(String value) {
        this.scoringTeam = value;
    }

}
