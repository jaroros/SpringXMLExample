package com.example.test;

import com.example.ResourceLoader;
import com.example.dao.SportDAO;
import com.example.model.RowMatch;
import com.example.model.TeamRow;
import com.example.util.RowBuilder;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;

/**
 * User: Alexander Nazarenko
 */
public class TestDAOXML extends AbstractTest {
    @Autowired
    private SportDAO matchDAO = null;

    @Test
    public void testGetMatchDataAlphabetically() throws JAXBException, ClassNotFoundException, IOException, URISyntaxException {
        final Set<RowMatch> rowMatches = matchDAO.getMatchAlphabeticallySorted();
        final List<String> listStrings = FileUtils.readLines(new File(ResourceLoader.getFilePath("small-matchlist-alphasort.txt").toURI()));
        final RowMatch[] rowMatchesArray = rowMatches.toArray(new RowMatch[0]);
        for (int count = 0; count < rowMatches.size(); count++) {
            final String stringRow = RowBuilder.buildStringFromMatchRow(rowMatchesArray[count]);
            final String originalRow = listStrings.get(count);
            assertEquals(originalRow, stringRow);
        }
    }

    @Test
    public void testGetMatchSortedForGoals() throws JAXBException, ClassNotFoundException, IOException, URISyntaxException {
        final Set<RowMatch> rowMatches = matchDAO.getMatchSortedFromGoals();
        final List<String> listStrings = FileUtils.readLines(new File(ResourceLoader.getFilePath("small-matchlist-goalsort.txt").toURI()));
        final RowMatch[] rowMatchesArray = rowMatches.toArray(new RowMatch[0]);
        for (int count = 0; count < rowMatches.size(); count++) {
            final String stringRow = RowBuilder.buildStringFromMatchRow(rowMatchesArray[count]);
            final String originalRow = listStrings.get(count);
            assertEquals(originalRow, stringRow);
        }
    }

    @Test
    public void testGetTopList() throws JAXBException, ClassNotFoundException, IOException, URISyntaxException {
        final Set<TeamRow> rowMatches = matchDAO.getTopListOfTeams();
        final List<String> listStrings = FileUtils.readLines(new File(ResourceLoader.getFilePath("small-toplist.txt").toURI()));
        final TeamRow[] rowMatchesArray = rowMatches.toArray(new TeamRow[0]);
        for (int count = 0; count < rowMatches.size(); count++) {
            final String stringRow = RowBuilder.buildStringFromTeamRow(rowMatchesArray[count]);
            final String originalRow = listStrings.get(count);
            assertEquals(originalRow, stringRow);
        }
    }
}
