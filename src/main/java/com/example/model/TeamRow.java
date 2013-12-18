package com.example.model;

/**
 * User: Alexander Nazarenko
 */
public class TeamRow {
    private char teamLetter;
    private int score;

    public char getTeamLetter() {
        return teamLetter;
    }

    public void setTeamLetter(char teamLetter) {
        this.teamLetter = teamLetter;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TeamRow teamRow = (TeamRow) o;

        if (score != teamRow.score) return false;
        if (teamLetter != teamRow.teamLetter) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) teamLetter;
        result = 31 * result + score;
        return result;
    }
}
