package com.fitness.platform;

public class WellnessTip {
    private String tipTitle;
    private String tipDetails;

    public WellnessTip(String tipTitle, String tipDetails) {
        this.tipTitle = tipTitle;
        this.tipDetails = tipDetails;
    }

    public String getTipTitle() {
        return tipTitle;
    }

    public String getTipDetails() {
        return tipDetails;
    }

    @Override
    public String toString() {
        return "Wellness Tip: " + tipTitle + " - " + tipDetails;
    }
}
