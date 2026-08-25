package collections;

import java.util.EnumMap;

public class EnumMapExample {
    public static void main(String[] args) {
        EnumMap<Day,String> activityMap = new EnumMap<>(Day.class);
        activityMap.put(Day.MONDAY, "Gym");
        activityMap.put(Day.TUESDAY, "Swimming");
        activityMap.put(Day.WEDNESDAY, "Running");

        for (Day day : Day.values()) {
            System.out.println(day + ": " + activityMap.getOrDefault(day, "No activity"));
        }
    }
}
