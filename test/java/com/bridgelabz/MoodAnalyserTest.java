package com.bridgelabz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoodAnalyserTest {

    // repeating Test case -1.1  given "I am in Sad Mood " in constructor should return SAD.
    @Test
    public void analysingMoodWhenSadShouldReturnSad() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        String currentMood = moodAnalyser.analyseMood();
        assertEquals("SAD", currentMood);
    }

    //repeating Test case -1.2 given "I am in Any Mood" in constructor should return Happy.
    @Test
    public void analysingMoodWhenHappyShouldReturnHappy() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Any Mood");
        String currentMood = moodAnalyser.analyseMood();
        assertEquals("HAPPY", currentMood);
    }

    //Test case -2.1 given null should throw null exception
    @Test
    public void givenWhenNullShouldThrowException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String currentMood = null;
        try {
            currentMood = moodAnalyser.analyseMood();
            assertEquals("HAPPY", currentMood);
        } catch (MoodAnalyserException moodAnalyserException) {
            moodAnalyserException.printStackTrace();
        }
    }

    //Test case -3.2 given empty mood should throw exception
    @Test
    public void givenWhenEmptyShouldThrowException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String currentMood = "";
        try {
            currentMood = moodAnalyser.analyseMood();
            assertEquals("", currentMood);
        } catch (MoodAnalyserException moodAnalyserException) {
            moodAnalyserException.printStackTrace();
        }
    }
}