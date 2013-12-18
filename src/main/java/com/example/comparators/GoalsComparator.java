package com.example.comparators;

import com.example.model.RowMatch;

/**
 * User: Alexander Nazarenko
 */
public class GoalsComparator implements java.util.Comparator<RowMatch> {

    @Override
    public int compare(final RowMatch o1, final RowMatch o2) {
        return getSumOfGoals(o2).compareTo(getSumOfGoals(o1)) == 0 ? 1 : getSumOfGoals(o2).compareTo(getSumOfGoals(o1));
    }

    private Integer getSumOfGoals(final RowMatch rowMatch) {
        return (Integer.valueOf(rowMatch.getTeamScore1()) + Integer.valueOf(rowMatch.getTeamScore2()));
    }

}
