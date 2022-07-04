package com.bridgelabz;

public class MoodAnalyserException extends Exception {
    public MoodAnalyserException(String message) {       //creating constructor and passing message to super class
        super(message);
    }

    enum typeOfException {                               //enum is a method of declaring variables
        NULL_MOOD_EXCEPTION, EMPTY_MOOD_EXCEPTION
    }
}
