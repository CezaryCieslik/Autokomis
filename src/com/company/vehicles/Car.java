package com.company.vehicles;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class Car {
    public Double value;
    public String brand;
    public Integer mileage;
    public String color;
    public String segment;
    Integer randomMileage = ThreadLocalRandom.current().nextInt(0,500000);

    public String brandGenerator(){
        Random random = new Random();
        String[] brands = {"Toyota", "Volkswagen", "Ford", "Honda", "Nissan", "Hyundai", "Audi", "Kia", "Mercedes", "BMW"};
        return brand = brands[random.nextInt(brands.length)];
    }

    public String colorGenerator(){
        Random random = new Random();
        String[] colors = {"White", "Black", "Red", "Yellow", "Green", "Blue", "Grey", "Silver", "Gold", "Brown", "Orange", "Violet", "Pink"};
        return color = colors[random.nextInt(colors.length)];
    }

    public String segmentGenerator(){
        Random random = new Random();
        String[] segments = {"Budget", "Standard", "Premium"};
        return segment = segments[random.nextInt(segments.length)];
    }

    public void setValue(){
        if(this.segmentGenerator().equals("Budget")){
            value = ThreadLocalRandom.current().nextDouble(3000.0, 30000.0);
        }
        if(this.segment.equals("Standard")){
            value = ThreadLocalRandom.current().nextDouble(31000.0,100000.0);
        }
        if(this.segment.equals("Premium")){
            value = ThreadLocalRandom.current().nextDouble(101000.0,300000.0);
        }
    }

    public Car(){
        setValue();
        this.brand = brandGenerator();
        this.mileage = randomMileage;
        this.color = colorGenerator();
        this.segment = segmentGenerator();
    }

    public Double getValue(){
        return this.value;
    }

    public String getBrand(){
        return this.brand;
    }

    public String getSegment(){
        return this.segment;
    }

    private String decimalFormat(Double value){
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        return decimalFormat.format(value);
    }
}


