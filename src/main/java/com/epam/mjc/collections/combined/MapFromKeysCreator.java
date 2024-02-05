package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        HashMap<Integer, Set<String>> hashMap = new HashMap<>();

        for (Map.Entry<String, Integer> entry : sourceMap.entrySet()) {

            int keyLength = entry.getKey().length();
            Set<String> hashSet = hashMap.get(keyLength);

            if (hashSet == null) {
                hashSet = new HashSet<>();
                hashMap.put(keyLength, hashSet);
            }
            hashSet.add(entry.getKey());
        }
        return hashMap;
    }
}
