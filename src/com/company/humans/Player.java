package com.company.humans;

import com.company.databases.CarBase;
import com.company.databases.ClientBase;
import com.company.interfaces.Purchase;
import com.company.interfaces.Sale;
import com.company.vehicles.Car;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashSet;


public class Player implements Purchase, Sale {
    public Double cash;
    public Car car;
    public ArrayList<Car> playerCars;
    public Double tax = 0.02;

    public Player(Double cash){
        this.cash = cash;
        this.playerCars = new ArrayList<Car>();
    }

    public void removeCar(Car car){
        this.playerCars.remove(car);
    }

    public Double getCash(){
        return cash;
    }

    public void setCash(Double cash){
        this.cash = cash;
    }

    public Car getCar(Integer i){
        Car[] array =new Car[playerCars.size()];
        playerCars.toArray(array);
        return array[i];
    }

    public Double getValue(Integer i){
        Car[] array = new Car[playerCars.size()];
        playerCars.toArray(array);
        return array[i].getValue();
    }

    @Override
    public void purchase(CarBase carBase, int number) throws Exception {
        if(this.getCash() < carBase.getValue(number)){
            throw new Exception("You have not enough money.");
        }
        this.cash = cash - carBase.getValue(number);
        this.cash = cash - carBase.getValue(number)*tax;
        this.playerCars.add(carBase.getCar(number));
        System.out.println("You bought a " + carBase.getCar(number));
        System.out.println("That cost you " + decimalFormat(carBase.getValue(number)));
        carBase.removeCar(carBase.getCar(number));
        carBase.baseOfCars.add(new Car());
    }

    @Override
    public void sale(ClientBase clientBase, int client, int car) throws Exception {
        if (!this.playerCars.isEmpty()) {
            if (!clientBase.getBrand1(client).equals(this.getCar(car).getBrand()) && !clientBase.getBrand2(client).equals(this.getCar(car).getBrand())) {
                throw new Exception("Client is not interested in this car.");
            }
            if (clientBase.getClientCash(client) < this.getValue(car)) {
                throw new Exception("Client does not have enough money.");
            }
            this.cash = cash + this.playerCars.get(car).value;
            this.cash = cash - this.playerCars.get(car).value * tax;
            this.removeCar(this.getCar(car));
            clientBase.baseOfClient.add(new Client());
            clientBase.baseOfClient.add(new Client());
            System.out.println("Gained 2 new potential clients.");
        } else {
            System.out.println("You do not have a car");
        }
    }

    private String decimalFormat (Double value){
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        return decimalFormat.format(value);
    }
}
