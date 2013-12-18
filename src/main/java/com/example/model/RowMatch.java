package com.example.model;

/**
 * User: Alexander Nazarenko
 */
public class RowMatch implements Comparable<RowMatch> {
    private String sport;
    private String category;
    private String tournament;
    private String teamName1;
    private String teamName2;
    private String teamScore1;
    private String teamScore2;

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getTournament() {
        return tournament;
    }

    public void setTournament(String tournament) {
        this.tournament = tournament;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTeamName1() {
        return teamName1;
    }

    public void setTeamName1(String teamName1) {
        this.teamName1 = teamName1;
    }

    public String getTeamName2() {
        return teamName2;
    }

    public void setTeamName2(String teamName2) {
        this.teamName2 = teamName2;
    }

    public String getTeamScore1() {
        return teamScore1;
    }

    public void setTeamScore1(String teamScore1) {
        this.teamScore1 = teamScore1;
    }

    public String getTeamScore2() {
        return teamScore2;
    }

    public void setTeamScore2(String teamScore2) {
        this.teamScore2 = teamScore2;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RowMatch rowMatch = (RowMatch) o;

        if (category != null ? !category.equals(rowMatch.category) : rowMatch.category != null) return false;
        if (sport != null ? !sport.equals(rowMatch.sport) : rowMatch.sport != null) return false;
        if (teamName1 != null ? !teamName1.equals(rowMatch.teamName1) : rowMatch.teamName1 != null) return false;
        if (teamName2 != null ? !teamName2.equals(rowMatch.teamName2) : rowMatch.teamName2 != null) return false;
        if (teamScore1 != null ? !teamScore1.equals(rowMatch.teamScore1) : rowMatch.teamScore1 != null) return false;
        if (teamScore2 != null ? !teamScore2.equals(rowMatch.teamScore2) : rowMatch.teamScore2 != null) return false;
        if (tournament != null ? !tournament.equals(rowMatch.tournament) : rowMatch.tournament != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sport != null ? sport.hashCode() : 0;
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (tournament != null ? tournament.hashCode() : 0);
        result = 31 * result + (teamName1 != null ? teamName1.hashCode() : 0);
        result = 31 * result + (teamName2 != null ? teamName2.hashCode() : 0);
        result = 31 * result + (teamScore1 != null ? teamScore1.hashCode() : 0);
        result = 31 * result + (teamScore2 != null ? teamScore2.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(RowMatch o) {
        return 0;
    }
}
