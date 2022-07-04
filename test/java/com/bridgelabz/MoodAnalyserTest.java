package com.bridgelabz;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoodAnalyserTest {
    static MoodAnalyser moodAnalyser;

    @Before
    public void initialize() {
        moodAnalyser = new MoodAnalyser();
    }

    //Test case -1.1  given "I am in Sad Mood " should return SAD.
    @Test
    public void analysingMoodWhenSadShouldReturnSad() {
        String message = "I am in Sad Mood";
        String currentMood = moodAnalyser.analyseMood(message);
        assertEquals("SAD", currentMood);
    }

    //Test case -1.2 given "I am in Any Mood" should return Happy.
    @Test
    public void analysingMoodWhenHappyShouldReturnHappy() {
        String message = "I am in Any Mood";
        String currentMood = moodAnalyser.analyseMood(message);
        assertEquals("HAPPY", currentMood);
    }
}