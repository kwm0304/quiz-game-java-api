package com.quizgame.quizgamejavaapi.model;
import com.quizgame.quizgamejavaapi.model.Question;

import java.util.List;

public class Quiz {
   private String title;
   private List<Question> questions;
   private int timeInSeconds;

   public Quiz(String title, List<Question> questions, int timeInSeconds) {
      this.title = title;
      this.questions = questions;
      this.timeInSeconds = timeInSeconds;
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public List<Question> getQuestions() {
      return questions;
   }

   public void setQuestions(List<Question> questions) {
      this.questions = questions;
   }

   public int getTimeInSeconds() {
      return timeInSeconds;
   }

   public void setTimeInSeconds(int timeInSeconds) {
      this.timeInSeconds = timeInSeconds;
   }
}
