
package com.example.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.example.model package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _LivescoreData_QNAME = new QName("", "LivescoreData");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.model
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SportType }
     */
    public SportType createSportType() {
        return new SportType();
    }

    /**
     * Create an instance of {@link TournamentType }
     */
    public TournamentType createTournamentType() {
        return new TournamentType();
    }

    /**
     * Create an instance of {@link Team1Type }
     */
    public Team1Type createTeam1Type() {
        return new Team1Type();
    }

    /**
     * Create an instance of {@link ScoreType }
     */
    public ScoreType createScoreType() {
        return new ScoreType();
    }

    /**
     * Create an instance of {@link CategoryType }
     */
    public CategoryType createCategoryType() {
        return new CategoryType();
    }

    /**
     * Create an instance of {@link ScoresType }
     */
    public ScoresType createScoresType() {
        return new ScoresType();
    }

    /**
     * Create an instance of {@link NameType }
     */
    public NameType createNameType() {
        return new NameType();
    }

    /**
     * Create an instance of {@link MatchType }
     */
    public MatchType createMatchType() {
        return new MatchType();
    }

    /**
     * Create an instance of {@link StatusType }
     */
    public StatusType createStatusType() {
        return new StatusType();
    }

    /**
     * Create an instance of {@link Team2Type }
     */
    public Team2Type createTeam2Type() {
        return new Team2Type();
    }

    /**
     * Create an instance of {@link LivescoreDataType }
     */
    public LivescoreDataType createLivescoreDataType() {
        return new LivescoreDataType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LivescoreDataType }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "LivescoreData")
    public JAXBElement<LivescoreDataType> createLivescoreData(LivescoreDataType value) {
        return new JAXBElement<LivescoreDataType>(_LivescoreData_QNAME, LivescoreDataType.class, null, value);
    }

}
