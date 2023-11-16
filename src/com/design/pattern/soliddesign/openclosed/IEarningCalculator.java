package com.design.pattern.soliddesign.openclosed;

import com.design.pattern.soliddesign.liskovsubstitution.VideoManager;
public interface IEarningCalculator {
    double calculateEarnings(VideoManager videoManager);
}
