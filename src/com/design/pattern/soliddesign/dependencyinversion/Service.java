package com.design.pattern.soliddesign.dependencyinversion;

import com.design.pattern.soliddesign.liskovsubstitution.VideoManager;
import com.design.pattern.soliddesign.openclosed.IEarningCalculator;
public class Service {

    IEarningCalculator calculator;

    public Service(IEarningCalculator calculator) {
        this.calculator = calculator;
    }

    public double calculateEarnings(VideoManager video){
        return calculator.calculateEarnings(video);
    }
}
