package kh.maryiaskachkova.carsproject._main;

import kh.maryiaskachkova.carsproject.entity.Cars;

public class _Main {
    public static void main(String[] args) {
        Cars car1 = new Cars();
        car1.mark = "BMW";
        car1.color = "black";
        Cars car2 = new Cars();
        car2.mark = "Opel";
        car2.color = "blue";
        car2.volume = 5.2;
        Cars car3 = new Cars("JEEP", "pink", 4.0);
        System.out.println("At the fleet has a " + car1.mark + " " + car1.color + " color, " + car1.drive(" very fast"));
        Cars.toBrake("BMW");
        System.out.println("At the fleet has a " + car2.mark + " " + car2.color + " color, " + car2.drive("slowly"));
        System.out.println(car2.mark + Cars.carDrive());
        System.out.println("At the fleet has a " + car3.mark + " " + car3.color + " color");
        Cars.drive2();
        Cars.toBrake("JEEP");

    }
}

