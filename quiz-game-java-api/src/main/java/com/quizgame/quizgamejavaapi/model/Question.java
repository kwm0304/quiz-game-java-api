package com.quizgame.quizgamejavaapi.model;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Question {
    private String questionText;
    private Map<String, String> options;
    private String correctOptionKey;
    private int adjTimeCorrect;
    private int adjTimeIncorrect;

    public Question(String questionText, Map<String, String> options, String correctOptionKey,
                    int adjTimeCorrect, int adjTimeIncorrect) {
        this.questionText = questionText;
        this.options = options;
        this.correctOptionKey = correctOptionKey;
        this. adjTimeCorrect = adjTimeCorrect;
        this.adjTimeIncorrect = adjTimeIncorrect;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public Map<String, String> getOptions() {
        return options;
    }

    public void setOptions(Map<String, String> options) {
        this.options = options;
    }

    public String getCorrectOptionKey() {
        return correctOptionKey;
    }

    public void setCorrectOptionKey(String correctOptionKey) {
        this.correctOptionKey = correctOptionKey;
    }

    public int getAdjTimeCorrect() {
        return adjTimeCorrect;
    }

    public void setAdjTimeCorrect(int adjTimeCorrect) {
        this.adjTimeCorrect = adjTimeCorrect;
    }

    public int getAdjTimeIncorrect() {
        return adjTimeIncorrect;
    }

    public void setAdjTimeIncorrect(int adjTimeIncorrect) {
        this.adjTimeIncorrect = adjTimeIncorrect;
    }


}
