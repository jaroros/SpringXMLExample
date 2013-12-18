package com.example.comparators;

import com.example.model.RowMatch;
import com.example.util.RowBuilder;

/**
 * User: Alexander Nazarenko
 */
public class AlphabeticComparator implements java.util.Comparator<RowMatch> {
    @Override
    public int compare(final RowMatch o1, final RowMatch o2) {
        return RowBuilder.buildStringFromMatchRow(o1).compareTo(RowBuilder.buildStringFromMatchRow(o2));
    }

}
