package com.example.comparators;

import com.example.model.TeamRow;

/**
 * User: Alexander Nazarenko
 */
public class TopListComparator implements java.util.Comparator<TeamRow> {
    @Override
    public int compare(final TeamRow o1, final TeamRow o2) {
        return Integer.valueOf(o2.getScore()).compareTo(o1.getScore()) == 0
                ? -1 : Integer.valueOf(o2.getScore()).compareTo(o1.getScore());
    }
}
