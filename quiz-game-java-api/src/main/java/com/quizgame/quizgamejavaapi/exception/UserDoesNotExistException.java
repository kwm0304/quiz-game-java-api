package com.quizgame.quizgamejavaapi.exception;

public class UserDoesNotExistException extends RuntimeException{

    public UserDoesNotExistException() {
        super();
    }

    public UserDoesNotExistException(String message) {
        super(message);
    }
}
