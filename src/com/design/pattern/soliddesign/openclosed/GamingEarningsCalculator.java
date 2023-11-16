package com.design.pattern.soliddesign.openclosed;

import com.design.pattern.soliddesign.liskovsubstitution.VideoManager;
public class GamingEarningsCalculator implements IEarningCalculator {
    @Override
    public double calculateEarnings(VideoManager video) {
        return video.getLikes() * 1.4 + video.getViews()* 1.5;
    }
}
