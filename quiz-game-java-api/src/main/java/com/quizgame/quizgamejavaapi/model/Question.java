package com.quizgame.quizgamejavaapi.model;

import java.util.List;

public class Question {
    private String questionText;
    private List<String> options;
    private String correctOption;
    private int adjTimeCorrect;
    private int adjTimeIncorrect;

    public Question(String questionText, List<String> options, String correctOption,
                    int adjTimeCorrect, int adjTimeIncorrect) {
        this.questionText = questionText;
        this.options = options;
        this.correctOption = correctOption;
        this.adjTimeCorrect = adjTimeCorrect;
        this.adjTimeIncorrect = adjTimeIncorrect;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public String getCorrectOption() {
        return correctOption;
    }

    public void setCorrectOption(String correctOption) {
        this.correctOption = correctOption;
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
