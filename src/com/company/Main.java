package com.company;

import com.company.databases.CarBase;
import com.company.databases.ClientBase;
import com.company.humans.Client;
import com.company.humans.Player;
import com.company.mechanics.Adrian;
import com.company.mechanics.Janusz;
import com.company.mechanics.Marian;
import com.company.vehicles.Car;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static String decimalFormat(Double value) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        return decimalFormat.format(value);
    }

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        Player you = new Player("Player", 60000.0);
        CarBase carBase = new CarBase();
        ClientBase clientBase = new ClientBase();
        Janusz janusz = new Janusz();
        Marian marian = new Marian();
        Adrian adrian = new Adrian();

        int mainSelect;
        int select;
        int carIndex;
        int clientIndex;
        int numberOfTurns = 0;

        for (int i = 0; i < 8; i++) {
            carBase.baseOfCars.add(new Car());
        }
        for (int i = 0; i < 4; i++) {
            clientBase.baseOfClient.add(new Client());
        }

        do{
            if (you.cash >= 120000.0) {
                System.out.println("You won game!");
                System.out.println("Number of moves: " + numberOfTurns);
                break;
            } else if (you.cash < 3000.0) {
                System.out.println("You do not have enough money");
                System.out.println("You lose game!");
                break;
            }

            System.out.println("1) Show list of cars to buy");
            System.out.println("2) Show list of cars you owned");
            System.out.println("3) Show list of potential customers");
            System.out.println("4) Repair car");
            System.out.println("5) Your shop");
            System.out.println();
            System.out.println("Turns: " + numberOfTurns);
            System.out.println();
            mainSelect = in.nextInt();

            switch (mainSelect){

                case 1:
                    do {
                        System.out.println("This is list of cars u can buy:");
                        System.out.println(carBase.baseOfCars);
                        System.out.println();
                        System.out.println("1) Buy a car");
                        System.out.println("2) Back");
                        select = in.nextInt();
                        switch (select){
                            case 1:
                                System.out.println("Select car");
                                System.out.println("Your money: " + decimalFormat(you.getCash()));
                                carIndex = in.nextInt() - 1;
                                try {
                                    you.purchase(carBase, carIndex);
                                    numberOfTurns++;
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 2:
                                System.out.println("Previous menu: ");
                                break;
                            default:
                                System.out.println("Wrong number");
                        }
                    }while (select != 2);
                    break;

                case 2:
                    System.out.println("This is list of cars that u owned.");
                    System.out.println(you.playerCars);
                    break;

                case 3:
                    if (!you.playerCars.isEmpty()) {
                        do {
                            System.out.println("This is list of yours cars: ");
                            System.out.println(you.playerCars);
                            System.out.println();
                            System.out.println("1) Show list of potential customers");
                            System.out.println("2) Sell a car");
                            System.out.println("3) Back");
                            select = in.nextInt();
                            switch (select){
                                case 1:
                                    System.out.println("This is list of your potential customers.");
                                    System.out.println(clientBase.baseOfClient);
                                    break;
                                case 2:
                                    System.out.println(you.playerCars);
                                    System.out.println("Select car");
                                    carIndex = in.nextInt() - 1;
                                    System.out.println("Select customer");
                                    clientIndex = in.nextInt() - 1;
                                    try{
                                        you.sale(clientBase, carIndex, clientIndex);
                                        numberOfTurns++;
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                    break;
                                case 3:
                                    System.out.println("Previous menu: ");
                                    break;
                                default:
                                    System.out.println("Wrong number");
                            }
                        }while (select != 3);
                    }else{
                        System.out.println("You do not have car");
                    }

                case 4:
                    if (!you.playerCars.isEmpty()) {
                        do {
                            System.out.println("Choose mechanic:");
                            System.out.println("1) Janusz");
                            System.out.println("2) Marian");
                            System.out.println("3) Adrian");
                            System.out.println("4) Back");
                            select = in.nextInt();
                            switch (select){
                                case 1:
                                    System.out.println("You chose Janusz.");
                                    System.out.println("This is list of your car.");
                                    System.out.println(you.playerCars);
                                    System.out.println("Select car to repair.");
                                    carIndex = in.nextInt() - 1;
                                    try {
                                        janusz.januszRepair(you, you.getCar(carIndex));
                                        numberOfTurns++;
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                    break;
                                case 2:
                                    System.out.println("You chose Marian.");
                                    System.out.println("This is list of your car.");
                                    System.out.println(you.playerCars);
                                    System.out.println("Select car to repair.");
                                    carIndex = in.nextInt() - 1;
                                    try {
                                        marian.marianRepair(you, you.getCar(carIndex));
                                        numberOfTurns++;
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                    break;
                                case 3:
                                    System.out.println("You chose Adrian.");
                                    System.out.println("This is list of your car.");
                                    System.out.println(you.playerCars);
                                    System.out.println("Select car to repair.");
                                    carIndex = in.nextInt() - 1;
                                    try {
                                        adrian.adrianRepair(you, you.getCar(carIndex));
                                        numberOfTurns++;
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                    break;
                                case 4:
                                    System.out.println("Previous menu: ");
                                    break;
                                default:
                                    System.out.println("Wrong number");
                            }
                        }while (select != 4);
                    }else{
                        System.out.println("You do not have car");
                    }

                case 5:
                    do {
                        System.out.println("1) Check your account balance");
                        System.out.println("2) Buy an ad");
                        System.out.println("3) Check your transaction history");
                        System.out.println("4) Check repair history for your cars");
                        System.out.println("5) Back");
                        select = in.nextInt();
                        switch (select){
                            case 1:
                                System.out.println("This is your money");
                                System.out.println(decimalFormat(you.getCash()));
                                break;
                            case 2:
                                do {
                                    System.out.println("You can buy ad in newspaper and it will cost you 500 or in internet and pay 100.");
                                    System.out.println("1) Buy ad in newspaper.");
                                    System.out.println("2) Buy ad in internet.");
                                    System.out.println("3) Back");
                                    select = in.nextInt();
                                    switch (select){
                                        case 1:
                                            if (you.cash < 500.0) {
                                                System.out.println("You can not buy ad in newspaper.");
                                            } else {
                                                you.cash = you.cash - 500.0;
                                                clientBase.baseOfClient.add(new Client());
                                                clientBase.baseOfClient.add(new Client());
                                                System.out.println("You bought ad in newspaper and gain 2 new potential customers");
                                                numberOfTurns++;
                                                break;
                                            }
                                        case 2:
                                            if (you.cash < 100) {
                                                System.out.println("You can not buy ad in internet.");
                                            } else {
                                                you.cash = you.cash - 100.0;
                                                clientBase.baseOfClient.add(new Client());
                                                System.out.println("You bought ad in internet and gain 1 new potential customers");
                                                numberOfTurns++;
                                                break;
                                            }
                                        case 3:
                                            System.out.println("Previous menu: ");
                                            break;
                                        default:
                                            System.out.println("Wrong number");
                                    }
                                }while (select != 3);
                            case 3:
                                System.out.println("Transaction history");
                                break;
                            case 4:
                                System.out.println("Repair history");
                                break;
                            case 5:
                                System.out.println("Previous menu: ");
                                break;
                            default:
                                System.out.println("Wrong number");
                        }
                    }while (select != 5);
            }
        }while (mainSelect != 5);
    }
}