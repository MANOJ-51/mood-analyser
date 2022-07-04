package com.bridgelabz;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoodAnalyserTest {

    // repeating Test case -1.1  given "I am in Sad Mood " in constructor should return SAD.
    @Test
    public void analysingMoodWhenSadShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        String currentMood = moodAnalyser.analyseMood();
        assertEquals("SAD", currentMood);
    }

    //repeating Test case -1.2 given "I am in Any Mood" in constructor should return Happy.
    @Test
    public void analysingMoodWhenHappyShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Any Mood");
        String currentMood = moodAnalyser.analyseMood();
        assertEquals("HAPPY", currentMood);
    }
}