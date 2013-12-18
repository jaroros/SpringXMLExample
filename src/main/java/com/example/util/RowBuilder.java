package com.example.util;

import com.example.model.*;

import java.util.List;
import java.util.Set;

/**
 * User: Alexander Nazarenko
 */
public class RowBuilder {

    public static void buildMatchRow(final SportType sportType, final Set<RowMatch> rowMatches) {
        search(sportType, new SearchMapper() {
            @Override
            public void mapResult(final MatchType matchType,
                                  final String sportTypeName,
                                  final String categoryTypeName,
                                  final String tournamentTypeName) {
                final RowMatch rowMatch = new RowMatch();
                rowMatch.setTeamName1(filterEN(matchType.getTeam1().getName()));
                rowMatch.setTeamName2(filterEN(matchType.getTeam2().getName()));
                rowMatch.setSport(sportTypeName);
                rowMatch.setCategory(categoryTypeName);
                rowMatch.setTournament(tournamentTypeName);
                rowMatch.setTeamScore1(getCurrentScore(matchType.getScores()).getTeam1());
                rowMatch.setTeamScore2(getCurrentScore(matchType.getScores()).getTeam2());
                rowMatches.add(rowMatch);
            }
        });
    }

    public static void buildTeamRow(final SportType sportType, final Set<TeamRow> rowMatches) {
        search(sportType, new SearchMapper() {
            @Override
            public void mapResult(final MatchType matchType,
                                  final String sportTypeName,
                                  final String categoryTypeName,
                                  final String tournamentTypeName) {
                final TeamRow teamRow = new TeamRow();
                if (Integer.valueOf(getCurrentScore(matchType.getScores()).getTeam1())
                        > Integer.valueOf(getCurrentScore(matchType.getScores()).getTeam2())) {
                    teamRow.setScore(Integer.valueOf(getCurrentScore(matchType.getScores()).getTeam1()));
                    teamRow.setTeamLetter(filterEN(matchType.getTeam1().getName()).charAt(0));
                } else {
                    teamRow.setScore(Integer.valueOf(getCurrentScore(matchType.getScores()).getTeam2()));
                    teamRow.setTeamLetter(filterEN(matchType.getTeam2().getName()).charAt(0));
                }
                rowMatches.add(teamRow);
            }
        });
    }

    private static void search(final SportType sportType, final SearchMapper mapper) {
        final String sportTypeName = filterEN(sportType.getName());
        for (final CategoryType category : sportType.getCategory()) {
            final String categoryTypeName = filterEN(category.getName());
            for (final TournamentType tournamentType : category.getTournament()) {
                final String tournamentTypeName = filterEN(tournamentType.getName());
                for (final MatchType matchType : tournamentType.getMatch()) {
                    if (!checkIfScoresNotNull(matchType)) {
                        continue;
                    }
                    mapper.mapResult(matchType, sportTypeName, categoryTypeName, tournamentTypeName);
                }
            }
        }
    }

    private static boolean checkIfScoresNotNull(final MatchType matchType) {
        if (matchType.getScores() != null && matchType.getScores().getScore() != null
                && getCurrentScore(matchType.getScores()) != null
                && getCurrentScore(matchType.getScores()) != null) {

            return getCurrentScore(matchType.getScores()).getTeam1() != null
                    && getCurrentScore(matchType.getScores()).getTeam1() != null;
        } else {
            return false;
        }
    }

    private static void appendSlash(final StringBuilder stringBuilder, final String name) {
        stringBuilder.append(name).append(" | ");
    }

    private static void appendMinus(final StringBuilder stringBuilder, final String name) {
        stringBuilder.append(name).append(" - ");
    }

    private static void appendDots(final StringBuilder stringBuilder, final String name) {
        stringBuilder.append(name).append(" : ");
    }

    private static void appendDotsWithOutSpace(final StringBuilder stringBuilder, final String name) {
        stringBuilder.append(name).append(": ");
    }

    private static void append(final StringBuilder stringBuilder, final String name) {
        stringBuilder.append(name);
    }

    private static String filterEN(final List<NameType> nameTypes) {
        for (NameType nameType : nameTypes) {
            if (nameType.getLanguage().equals("en")) {
                return nameType.getValue();
            }
        }
        return null;
    }

    public static String buildStringFromMatchRow(final RowMatch rowMatch) {
        final StringBuilder builder = new StringBuilder();
        appendSlash(builder, rowMatch.getSport());
        appendSlash(builder, rowMatch.getCategory());
        appendSlash(builder, rowMatch.getTournament());
        appendMinus(builder, rowMatch.getTeamName1());
        appendDots(builder, rowMatch.getTeamName2());
        appendMinus(builder, rowMatch.getTeamScore1());
        append(builder, rowMatch.getTeamScore2());
        return builder.toString();
    }

    public static String buildStringFromTeamRow(final TeamRow teamRow) {
        final StringBuilder builder = new StringBuilder();
        appendDotsWithOutSpace(builder, Character.toString(teamRow.getTeamLetter()));
        append(builder, Integer.toString(teamRow.getScore()));
        return builder.toString();
    }

    private static ScoreType getCurrentScore(final ScoresType scoresType) {
        for (final ScoreType scoreType : scoresType.getScore()) {
            if (scoreType != null && scoreType.getType().equals("Current")) {
                return scoreType;
            }
        }
        return null;
    }

    private abstract static class SearchMapper {
        public abstract void mapResult(final MatchType matchType,
                                       final String sportTypeName,
                                       final String categoryTypeName,
                                       final String tournamentTypeName);
    }
}
