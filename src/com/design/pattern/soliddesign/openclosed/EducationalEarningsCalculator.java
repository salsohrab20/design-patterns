package com.design.pattern.soliddesign.openclosed;

import com.design.pattern.soliddesign.liskovsubstitution.VideoManager;
public class EducationalEarningsCalculator implements IEarningCalculator {
    @Override
    public double calculateEarnings(VideoManager video) {
        return video.getLikes() * 1.8 + video.getViews()* 2.0;
    }
}
