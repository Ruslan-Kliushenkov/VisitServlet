package entities;

import pojo.Visit;

import java.util.*;

public class VisitList {

    private static Queue<Visit> visits = new ArrayDeque<>() {
    };

    public static Queue<Visit> getVisits(){
        return visits;
    }

    public static void addVisit(Visit visit){
        if (visits.size() < 3){
            visits.offer(visit);
        }else{
            visits.poll();
            visits.offer(visit);
        }
    }
}
