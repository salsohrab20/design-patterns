package com.design.pattern.builder.design;

public class CarBuilder implements Builder {
    private int id;
    private String name;
    private String model;
    private int price;
    private int mileage;
    private String tyres;

   /* public CarBuilder buildId(int id){
        this.id=id;
        return this;
    }
    public CarBuilder buildPrice(int price){
        this.price=price;
        return this;
    }

    public CarBuilder buildName(String name){
        this.name=name;
        return this;
    }
    public CarBuilder buildModel(String model){
        this.model=model;
        return this;
    }
    public CarBuilder buildMileage(int mileage){
        this.mileage=mileage;
        return this;
    }
    public CarBuilder buildTyres(String tyres){
        this.tyres=tyres;
        return this;
    }*/

    public Car build() {
        System.out.println("Calling Car builder");
        return new Car(id, name, model, price, mileage, tyres);
    }

    @Override
    public CarBuilder id(int id) {
        this.id=id;
        return this;
    }

    @Override
    public CarBuilder name(String name) {
        this.name=name;
        return this;
    }

    @Override
    public CarBuilder price(int price) {
        this.price=price;
        return this;
    }

    @Override
    public CarBuilder mileage(int mileage) {
        this.mileage=mileage;
        return this;
    }

    @Override
    public CarBuilder model(String model) {
       this.model=model;
       return this;
    }

    @Override
    public CarBuilder tyres(String tyres) {
        this.tyres=tyres;
        return this;
    }
}
