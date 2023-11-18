package com.design.pattern.builder.design;

public class TruckBuilder implements Builder{
    private int id;
    private String name;
    private String model;
    private int price;
    private int mileage;
    private String tyres;
    public Truck build() {
        System.out.println("Calling truck builder");
        return new Truck(id, name, model, price, mileage, tyres);
    }

    @Override
    public TruckBuilder id(int id) {
        this.id=id;
        return this;
    }

    @Override
    public TruckBuilder name(String name) {
        this.name=name;
        return this;
    }

    @Override
    public TruckBuilder price(int price) {
        this.price=price;
        return this;
    }

    @Override
    public TruckBuilder mileage(int mileage) {
        this.mileage=mileage;
        return this;
    }

    @Override
    public TruckBuilder model(String model) {
        this.model=model;
        return this;
    }

    @Override
    public TruckBuilder tyres(String tyres) {
        this.tyres=tyres;
        return this;
    }
}
