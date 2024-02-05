package com.epam.mjc.collections.combined;

import java.util.*;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {

        Set<String> set = new HashSet<>();

        for (Map.Entry<String, List<String>> entry : timetable.entrySet()) {
            List<String> arr = entry.getValue();
            set.addAll(arr);
        }

        return set;
    }
}
