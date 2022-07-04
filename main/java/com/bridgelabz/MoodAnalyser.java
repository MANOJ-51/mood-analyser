package com.bridgelabz;

public class MoodAnalyser {
    String message;

    //default constructor for uc1 refactor
    public MoodAnalyser() {
    }

    //constructor overloading creating message constructor for uc1 refactor
    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalyserException {
        if (message == null) {
            throw new MoodAnalyserException(MoodAnalyserException.typeOfException.NULL_MOOD_EXCEPTION + " Please enter a valid Message ");
        } else if (message.isEmpty()) {
            throw new MoodAnalyserException(MoodAnalyserException.typeOfException.EMPTY_MOOD_EXCEPTION + " Please enter a valid Message ");
        } else if (message.contains("Sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }


}
