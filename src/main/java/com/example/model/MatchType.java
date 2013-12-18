
package com.example.model;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for MatchType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="MatchType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MatchDate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="2011-01-05T07:30:00"/>
 *               &lt;enumeration value="2011-01-04T21:00:00"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Team1" type="{}Team1Type"/>
 *         &lt;element name="Team2" type="{}Team2Type"/>
 *         &lt;element name="Status" type="{}StatusType"/>
 *         &lt;element name="Winner" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Scores" type="{}ScoresType"/>
 *         &lt;element name="Goals" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Cards" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Substitutions" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Lineups" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="MatchId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchType", propOrder = {
        "matchDate",
        "team1",
        "team2",
        "status",
        "winner",
        "scores",
        "goals",
        "cards",
        "substitutions",
        "lineups"
})
public class MatchType {

    @XmlElement(name = "MatchDate", required = true)
    protected String matchDate;
    @XmlElement(name = "Team1", required = true)
    protected Team1Type team1;
    @XmlElement(name = "Team2", required = true)
    protected Team2Type team2;
    @XmlElement(name = "Status", required = true)
    protected StatusType status;
    @XmlElement(name = "Winner", required = true)
    protected String winner;
    @XmlElement(name = "Scores", required = true)
    protected ScoresType scores;
    @XmlElement(name = "Goals", required = true)
    protected String goals;
    @XmlElement(name = "Cards", required = true)
    protected String cards;
    @XmlElement(name = "Substitutions", required = true)
    protected String substitutions;
    @XmlElement(name = "Lineups", required = true)
    protected String lineups;
    @XmlAttribute(name = "MatchId")
    protected String matchId;

    /**
     * Gets the value of the matchDate property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getMatchDate() {
        return matchDate;
    }

    /**
     * Sets the value of the matchDate property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMatchDate(String value) {
        this.matchDate = value;
    }

    /**
     * Gets the value of the team1 property.
     *
     * @return possible object is
     *         {@link Team1Type }
     */
    public Team1Type getTeam1() {
        return team1;
    }

    /**
     * Sets the value of the team1 property.
     *
     * @param value allowed object is
     *              {@link Team1Type }
     */
    public void setTeam1(Team1Type value) {
        this.team1 = value;
    }

    /**
     * Gets the value of the team2 property.
     *
     * @return possible object is
     *         {@link Team2Type }
     */
    public Team2Type getTeam2() {
        return team2;
    }

    /**
     * Sets the value of the team2 property.
     *
     * @param value allowed object is
     *              {@link Team2Type }
     */
    public void setTeam2(Team2Type value) {
        this.team2 = value;
    }

    /**
     * Gets the value of the status property.
     *
     * @return possible object is
     *         {@link StatusType }
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     *
     * @param value allowed object is
     *              {@link StatusType }
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the winner property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getWinner() {
        return winner;
    }

    /**
     * Sets the value of the winner property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setWinner(String value) {
        this.winner = value;
    }

    /**
     * Gets the value of the scores property.
     *
     * @return possible object is
     *         {@link ScoresType }
     */
    public ScoresType getScores() {
        return scores;
    }

    /**
     * Sets the value of the scores property.
     *
     * @param value allowed object is
     *              {@link ScoresType }
     */
    public void setScores(ScoresType value) {
        this.scores = value;
    }

    /**
     * Gets the value of the goals property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getGoals() {
        return goals;
    }

    /**
     * Sets the value of the goals property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGoals(String value) {
        this.goals = value;
    }

    /**
     * Gets the value of the cards property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getCards() {
        return cards;
    }

    /**
     * Sets the value of the cards property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCards(String value) {
        this.cards = value;
    }

    /**
     * Gets the value of the substitutions property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getSubstitutions() {
        return substitutions;
    }

    /**
     * Sets the value of the substitutions property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSubstitutions(String value) {
        this.substitutions = value;
    }

    /**
     * Gets the value of the lineups property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getLineups() {
        return lineups;
    }

    /**
     * Sets the value of the lineups property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLineups(String value) {
        this.lineups = value;
    }

    /**
     * Gets the value of the matchId property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getMatchId() {
        return matchId;
    }

    /**
     * Sets the value of the matchId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMatchId(String value) {
        this.matchId = value;
    }

}
