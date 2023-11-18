package com.design.pattern.builder.design;

public class Car extends Vehicle{
    protected Car(int id,String name, String model, int price, int mileage, String tyres) {
        this.id=id;
        this.name = name;
        this.model = model;
        this.price = price;
        this.mileage = mileage;
        this.tyres = tyres;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", mileage=" + mileage +
                ", tyres='" + tyres + '\'' +
                '}';
    }
}
