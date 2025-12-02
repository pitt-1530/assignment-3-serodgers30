package edu.pitt.se;

import java.util.List;

public class PlaylistRecommender {

    public static String classifyEnergy(List<Integer> bpms) {
        // TODO: Implement classifyEnergy()
        if(bpms == null)
        {
            return null;
        }
        if(bpms.isEmpty())
        {
            System.out.println("Error: Empty or null list.");
            return null;
        }
        int sum = 0;
        for(int i : bpms)
        {
            sum += i;
        }
        int avg = sum/bpms.size();

        if(avg >= 140)
        {
            return "HIGH";
        }
        else if(avg >= 100 || avg <= 100)
        {
            return "MEDIUM";
        }
        else if(avg < 100)
        {
            return "LOW";
        }

        return null;
        //throw new UnsupportedOperationException("Not implemented");
    }

    public static boolean isValidTrackTitle(String title) {
        // TODO: Implement isValidTrackTitle()
        for(char c : title.toCharArray())
        {
            if((Character.isLetter(c) || Character.isSpaceChar(c) || (title.length() < 1 && title.length() > 30)) == false)
            {
                return false;
            }
        }
        return true;
        //throw new UnsupportedOperationException("Not implemented");
    }

    public static int normalizeVolume(int volumeDb) {
        // TODO: Implement normalizeVolume()
        if(volumeDb > 100)
        {
            return 100;
        }
        else if(volumeDb < 0)
        {
            return 0;
        }
        else
        {
            return volumeDb;
        }
        //throw new UnsupportedOperationException("Not implemented");
    }
}
