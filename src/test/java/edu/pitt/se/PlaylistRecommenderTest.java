package edu.pitt.se;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class PlaylistRecommenderTest {

    @Test
    public void placeholder() {
        assertTrue(true);
    }

    @Test
    public void testNullList()
    {
        List<Integer> test = null;
        String result = PlaylistRecommender.classifyEnergy(test);
        assertNull(result);
    }

    @Test
    public void testContainsNullChar()
    {
        String nullChar = String.valueOf('\0');

        boolean result = PlaylistRecommender.isValidTrackTitle(nullChar);

        assertFalse(result);
    }

    @Test
    public void testNegativeDB()
    {
        int result = PlaylistRecommender.normalizeVolume(-1);
        assertEquals(0, result);
    }
}
