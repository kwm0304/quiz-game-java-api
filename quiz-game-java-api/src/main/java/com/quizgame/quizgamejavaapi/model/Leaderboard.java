package com.quizgame.quizgamejavaapi.model;

import java.util.LinkedHashMap;
import java.util.Map;

public class Leaderboard {
    private Map<String, Integer> userScores;
    public Leaderboard() {
        this.userScores = new LinkedHashMap<>();
    }

    public Map<String, Integer> getUserScores() {
        return userScores;
    }

    public void setUserScores(Map<String, Integer> userScores) {
        this.userScores = userScores;
    }

    public void updateScore(String username, int newScore) {
        userScores.put(username, newScore);
    }

    //sort leaderboard
}
