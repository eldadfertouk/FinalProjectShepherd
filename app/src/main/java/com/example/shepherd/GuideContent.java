package com.example.shepherd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuideContent {


    public static final List<GuideItem > GUIDES = new ArrayList<GuideItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, GuideItem> GUIDE_MAP = new HashMap<String, GuideItem>();

    private static final int COUNT = 25;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(CreateGuideItem(i));
        }
    }

    private static void addItem(GuideItem item) {
        GUIDES.add(item);
        GUIDE_MAP.put(item.id, item);
    }

    private static GuideItem CreateGuideItem(int position){
        return new GuideItem(String.valueOf(position), "Guides " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about guides: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\n all about guide information .");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class GuideItem {
        public final String id;
        public final String content;
        public final String details;

        public GuideItem(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }

    public static List<GuideItem> getGUIDES() {
        return GUIDES;
    }

    public static Map<String, GuideItem> getGuideMap() {
        return GUIDE_MAP;
    }

    public static int getCOUNT() {
        return COUNT;
    }
}
