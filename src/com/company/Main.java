package com.company;

import vehicles.Car;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        System.out.println("Car: " + car.brand  + car.segment + car.mileage + car.color + car.value);

    }
}
