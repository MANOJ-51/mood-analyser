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

    public String analyseMood() {
        if (message.contains("Sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }
}
