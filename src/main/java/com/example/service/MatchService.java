package com.example.service;

import com.example.dao.SportDAO;
import com.example.model.RowMatch;
import com.example.model.TeamRow;
import com.example.util.FileWriter;
import com.example.util.RowBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Set;

/**
 * User: Alexander Nazarenko
 */
@Component
public class MatchService {
    @Autowired
    private SportDAO sportDAO;
    @Autowired
    private FileWriter fileWriter;

    public void writeAlphaSortedMathes(final String fileName) throws IOException {
        fileWriter.cleanFile(fileName);
        final Set<RowMatch> rowMatches = sportDAO.getMatchAlphabeticallySorted();
        for (final RowMatch rowMatch : rowMatches) {
            final String stringRowMatch = RowBuilder.buildStringFromMatchRow(rowMatch);
            fileWriter.writeStringToFile(fileName, stringRowMatch);
        }
    }

    public void writeGoalSortedMathes(final String fileName) throws IOException {
        fileWriter.cleanFile(fileName);
        final Set<RowMatch> rowMatches = sportDAO.getMatchSortedFromGoals();
        for (final RowMatch rowMatch : rowMatches) {
            final String stringRowMatch = RowBuilder.buildStringFromMatchRow(rowMatch);
            fileWriter.writeStringToFile(fileName, stringRowMatch);
        }
    }

    public void writeTopList(final String fileName) throws IOException {
        fileWriter.cleanFile(fileName);
        final Set<TeamRow> teamRows = sportDAO.getTopListOfTeams();
        for (final TeamRow teamRow : teamRows) {
            final String stringRowMatch = RowBuilder.buildStringFromTeamRow(teamRow);
            fileWriter.writeStringToFile(fileName, stringRowMatch);
        }
    }

}
