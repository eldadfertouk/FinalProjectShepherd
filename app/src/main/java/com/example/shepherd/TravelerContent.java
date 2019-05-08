package com.example.shepherd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TravelerContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<TravelerItem> TRAVELERS = new ArrayList<TravelerItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, TravelerItem> TRAVELER_MAP = new HashMap<String, TravelerItem>();

    private static final int COUNT = 25;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(CreateTravelerContent(i));
        }
    }

    private static void addItem(TravelerItem item) {
        TRAVELERS.add(item);
        TRAVELER_MAP.put(item.id, item);
    }

    private static TravelerItem CreateTravelerContent(int position){
        return new TravelerItem(String.valueOf(position), "Travelers: " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about travelers: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\n Traveler information .");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class TravelerItem {
        public final String id;
        public final String content;
        public final String details;

        public TravelerItem(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }

    public static List<TravelerItem> getTRAVELERS() {
        return TRAVELERS;
    }

    public static Map<String, TravelerItem> getTravelerMap() {
        return TRAVELER_MAP;
    }
}
