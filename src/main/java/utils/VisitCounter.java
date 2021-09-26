package utils;

import lombok.Getter;

public class VisitCounter {
    private static int visits = 0;

    public static void incVisits(){
        visits++;
    }

    public static int getVisits() {
        return visits;
    }
}
