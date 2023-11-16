package com.design.pattern.soliddesign.liskovsubstitution;

public class PremiumVideo {
    private int premiumId;
    private VideoManager videoManager;

    public double getHoursPlayed(){
        return videoManager.getNumberOfHoursPlayed();
    }

}
