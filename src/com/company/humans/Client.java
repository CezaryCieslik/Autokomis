package com.company.humans;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Client {
    private String firstName;
    private Double clientCash;
    double randomCash = ThreadLocalRandom.current().nextDouble(3000.0, 300000.0 + 1);
    public String brand;
    public String firstBrand;
    public String secondBrand;


    public String nameGenerator(){
        Random random  = new Random();
        String[] names = {"Adam", "Anna", "Bartosz", "Cezary", "Damian", "Elżbieta", "Jan", "Magdalena", "Krzysztof", "Michał", "Klaudia", "Izabela"};
        return firstName = names[random.nextInt(names.length)];
    }

    public String brandGenerator(){
        Random random = new Random();
        String[] brands = {"Toyota", "Volkswagen", "Ford", "Honda", "Nissan", "Hyundai", "Audi", "Kia", "Mercedes", "BMW"};
        return brand = brands[random.nextInt(brands.length)];
    }

    public Client(){
        this.firstName = nameGenerator();
        this.clientCash = randomCash;
        this.firstBrand = brandGenerator();
        this.secondBrand = brandGenerator();
        if(this.firstBrand.equals(secondBrand)){
            this.secondBrand = brandGenerator();
        }
    }

    public String getFirstBrand(){
        return this.firstBrand;
    }

    public String getSecondBrand(){
        return this.secondBrand;
    }

    public Double getClientCash(){
        return this.clientCash;
    }

    public void setClientCash(Double clientCash) {
        this.clientCash = clientCash;
    }
}
