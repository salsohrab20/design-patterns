package com.design.pattern.builder.design;

public class MainApp {
    public static void main(String[] args) {
       /*Car car1 = new CarBuilder().buildId(2)
               .buildMileage(123)
               .buildModel("ABC")
               .buildName("Scoda")
               .buildPrice(1000)
               .buildTyres("MRF")
               .build();

       System.out.println(car1);

        Car car2 = new CarBuilder().buildId(2)
                .buildMileage(123)
                .buildModel("XYZ")
                .buildName("Kia")
                .buildPrice(1000)
                .buildTyres("MRF")
                .build();

        System.out.println(car2);*/

        Vehicle car3 = new CarBuilder()
                .id(1)
                .name("Scoda")
                .model("XYZ")
                .mileage(123)
                .price(1000)
                .tyres("MRF")
                .build();
        System.out.println(car3);

        Vehicle truck1 = new TruckBuilder()
                .id(123)
                .name("Lorrry")
                .model("ABC")
                .mileage(1232)
                .price(10003)
                .tyres("MRF")
                .build();
        System.out.println(truck1);
    }
}
