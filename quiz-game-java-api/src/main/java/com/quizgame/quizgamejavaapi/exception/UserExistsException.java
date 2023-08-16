package com.quizgame.quizgamejavaapi.exception;

import com.quizgame.quizgamejavaapi.model.User;

public class UserExistsException extends RuntimeException{
    public UserExistsException() {
        super();
    }

    public UserExistsException(String message) {
        System.out.println("An error occurred:" + message);
    }
}
