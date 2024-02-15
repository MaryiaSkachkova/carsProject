package kh.maryiaskachkova.carsproject.entity;

public class Cars {
    public String mark;
    public String color;
    public double volume;

    public static String carDrive() {
        return " can drive";
    }
    public static void drive2() {
        System.out.println("This car drive very fast");
    }
    public static void toBrake(String mark) {
        System.out.println("Car " + mark + " now brake");
    }
    public String drive(String driveType) {
        return "this car drive " + driveType;
    }
    public Cars(String mark, String color, double volume) {
        this.mark = mark;
        this.color = color;
        this.volume = volume;
    }
    public Cars() {
    }
}

