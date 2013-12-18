package com.example.test;


import com.example.model.*;
import com.example.util.FileNameHolder;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * User: Alexander Nazarenko
 */
@ContextConfiguration("classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public abstract class AbstractTest {
    protected static final Logger LOGGER = LoggerFactory.getLogger(AbstractTest.class.getName());

    @Autowired
    protected FileNameHolder fileNameHolder = null;

    @Before
    public void beforeClass(){
        fileNameHolder.setFileName("small-data.xml");
    }

    protected SportType prepareSportType() {
        final SportType sportType = new SportType();

        sportType.getName().add(new NameType() {
            {
                setValue("Soccer");
                setLanguage("en");
            }
        });

        sportType.getCategory().add(prepareCategoryType());

        return sportType;
    }

    protected CategoryType prepareCategoryType() {
        final CategoryType categoryType = new CategoryType();
        categoryType.getTournament().add(prepareTournamentType());
        categoryType.getName().add(new NameType() {
            {
                setValue("Australia");
                setLanguage("en");
            }
        });
        categoryType.setCategoryId("123");
        return categoryType;
    }

    protected TournamentType prepareTournamentType() {
        final TournamentType tournamentType = new TournamentType();
        tournamentType.getMatch().add(prepareMatchType());
        tournamentType.getName().add(new NameType() {
            {
                setValue("Hyundai A-League");
                setLanguage("en");
            }
        });
        return tournamentType;
    }

    protected MatchType prepareMatchType() {
        final MatchType matchType = new MatchType();
        matchType.setTeam1(prepareTeam1Type());
        matchType.setTeam2(prepareTeam2Type());
        matchType.getTeam2().getName().add(new NameType() {
            {
                setValue("Melbourne Victory");
                setLanguage("en");
            }
        });
        matchType.getTeam1().getName().add(new NameType() {
            {
                setValue("Wellington Phoenix FC");
                setLanguage("en");
            }
        });
        matchType.setScores(new ScoresType() {
            {

                getScore().add(new ScoreType() {
                    {
                        setType("Current");
                        setTeam1("2");
                        setTeam2("0");
                    }
                });
            }
        });
        return matchType;
    }

    protected Team2Type prepareTeam2Type() {
        final Team2Type team2Type = new Team2Type();
        team2Type.getName().add(new NameType() {
            {
                setValue("Melbourne Victory");
                setLanguage("en");
            }
        });
        return team2Type;
    }

    protected Team1Type prepareTeam1Type() {
        final Team1Type team1Type = new Team1Type();
        team1Type.getName().add(new NameType() {
            {
                setValue("Ended");
                setLanguage("en");
            }
        });
        return team1Type;
    }
}
