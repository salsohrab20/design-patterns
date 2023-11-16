package com.design.pattern.soliddesign.singleresp;

import com.design.pattern.soliddesign.liskovsubstitution.VideoManager;
public class Video {

    private VideoManager videoManager;
    private Category category;

    private double getHoursPlayed(){
        return videoManager.getNumberOfHoursPlayed();
    }

    private void playAd(){
        videoManager.playRandomAd();
    }

    enum Category{
        GAMING,EDUCATIONAL,ENTERTAINMENT
    }
}
