package com.design.pattern.builder.design;


interface Builder {

    Builder id(int id);
    Builder name(String name);
    Builder price(int price);
    Builder mileage(int mileage);
    Builder model(String model);
    Builder tyres(String tyres);

}
