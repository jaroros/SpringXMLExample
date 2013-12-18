package com.example.dao;

import com.example.comparators.AlphabeticComparator;
import com.example.comparators.GoalsComparator;
import com.example.comparators.TopListComparator;
import com.example.model.RowMatch;
import com.example.model.SportType;
import com.example.model.TeamRow;
import com.example.util.ObjectLoader;
import com.example.util.ObjectMapper;
import com.example.util.RowBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.TreeSet;


/**
 * User: Alexander Nazarenko
 */
@Component
public class SportDAO {
    private static final Logger LOGGER = LoggerFactory.getLogger(SportDAO.class.getName());
    private static final AlphabeticComparator ALPHABETIC_COMPARATOR = new AlphabeticComparator();
    private static final GoalsComparator GOALS_COMPARATOR = new GoalsComparator();
    private static final TopListComparator TOP_LIST_COMPARATOR = new TopListComparator();
    @Autowired
    private ApplicationContext applicationContext = null;

    public Set<RowMatch> getMatchAlphabeticallySorted() {
        final Set<RowMatch> matchTypes = new TreeSet<>(ALPHABETIC_COMPARATOR);
        final ObjectLoader objectLoader = getObjectLoader(SportType.class);

        objectLoader.loadingMatches(new ObjectMapper<SportType>() {
            @Override
            public void buildRowFromMatchType(final SportType sportType) {
                RowBuilder.buildMatchRow(sportType, matchTypes);
            }
        });

        return matchTypes;
    }

    public Set<RowMatch> getMatchSortedFromGoals() {
        final Set<RowMatch> matchTypes = new TreeSet<>(GOALS_COMPARATOR);
        final ObjectLoader objectLoader = getObjectLoader(SportType.class);

        objectLoader.loadingMatches(new ObjectMapper<SportType>() {
            @Override
            public void buildRowFromMatchType(final SportType sportType) {
                RowBuilder.buildMatchRow(sportType, matchTypes);
            }
        });

        return matchTypes;
    }

    public Set<TeamRow> getTopListOfTeams() {
        final Set<TeamRow> matchTypes = new TreeSet<>(TOP_LIST_COMPARATOR);
        final ObjectLoader objectLoader = getObjectLoader(SportType.class);

        objectLoader.loadingMatches(new ObjectMapper<SportType>() {
            @Override
            public void buildRowFromMatchType(final SportType sportType) {
                RowBuilder.buildTeamRow(sportType, matchTypes);
            }
        });

        return matchTypes;
    }

    private ObjectLoader getObjectLoader(final Class clazz) {
        ObjectLoader objectLoader = applicationContext.getBean(ObjectLoader.class);
        objectLoader.init(clazz);
        return objectLoader;
    }
}
