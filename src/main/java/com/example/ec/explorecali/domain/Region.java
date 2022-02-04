package com.example.ec.explorecali.domain;

public enum Region {
    Central_Coast("Central Coast"), Southern_California("Southern California"), Northern_California("Northern California"), Varies("Varies");
    private String label;

    private Region(String label) {
        this.label = label;
    }

    public static Region findByLabel(String label) {
        for (Region region : Region.values()) {
            if (region.label.equalsIgnoreCase(label)) {
                return region;
            }
        }
        return null;
    }
}
