package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> list = new ArrayList<>();

        for (Map.Entry<String, Set<String>> entry : projects.entrySet()) {
            String key = entry.getKey();
            Set<String> newSet = entry.getValue();
            if (newSet.contains(developer)) {
                list.add(key);
            }
        }

        list.sort((p1, p2) -> {
            int lengthComparison = Integer.compare(p2.length(), p1.length());
            if (lengthComparison == 0) {
                return p2.compareTo(p1);
            }
            return lengthComparison;
        });

        return list;
    }
}
