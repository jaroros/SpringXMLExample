package com.example.test;

import com.example.model.RowMatch;
import com.example.util.RowBuilder;
import org.junit.Test;

import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.assertEquals;

/**
 * User: Alexander Nazarenko
 */
public class RowBuilderTest extends AbstractTest {

    @Test
    public void getMatchRow() {
        final Set<RowMatch> rowMatches = new TreeSet<>();
        RowBuilder.buildMatchRow(prepareSportType(), rowMatches);
        assertEquals(rowMatches.size(), 1);
    }

    @Test
    public void getMatchRowString() {
        final Set<RowMatch> rowMatches = new TreeSet<>();
        RowBuilder.buildMatchRow(prepareSportType(), rowMatches);
        assertEquals(rowMatches.size(), 1);
        final String rowString = RowBuilder.buildStringFromMatchRow(rowMatches.toArray(new RowMatch[rowMatches.size()])[0]);
        final String originalString = "Soccer | Australia | Hyundai A-League | Ended - Melbourne Victory : 2 - 0";
        assertEquals(originalString, rowString);
    }
}
