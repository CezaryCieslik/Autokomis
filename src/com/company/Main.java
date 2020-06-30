package com.company;

import com.company.databases.CarBase;
import com.company.databases.ClientBase;
import com.company.humans.Client;
import com.company.humans.Player;
import com.company.mechanics.Adrian;
import com.company.mechanics.Janusz;
import com.company.mechanics.Marian;
import com.company.vehicles.Car;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    // Jak robiłem to przy 3 case sprawdziłem i działało, potem dokończyłem i chciałem znowu sprawdzić, ale okazało się
    // że "results of InputStream.read() is ignored" i nie wiem jak sobie z tym poradzić


    static int numberOfTurns = 0;
    public static int menu(){
        System.out.println("1) Show base of cars to buy.");
        System.out.println("2) Buy a car.");
        System.out.println("3) Browse base of cars you owned.");
        System.out.println("4) Repair car.");
        System.out.println("5) Browse list of potential customers.");
        System.out.println("6) Check your account.");
        System.out.println("7) Buy an ad.");

        Scanner scannerMenu = new Scanner(System.in);
        return scannerMenu.nextInt();
    }


    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        Player you = new Player("Player", 60000.0);
        CarBase carBase = new CarBase();
        ClientBase clientBase = new ClientBase();
        Janusz mechanic1 = new Janusz();
        Marian mechanic2 = new Marian();
        Adrian mechanic3 = new Adrian();
        int carIndex;
        int mechanic = in.nextInt();
        int adIndex = in.nextInt();

        for (int i = 0; i < 8; i++) {
            carBase.baseOfCars.add(new Car());
        }
        for (int i = 0; i < 4; i++) {
            clientBase.baseOfClient.add(new Client());
        }

        int choice = menu();

        while (choice != 0) {
            switch (choice) {
                case 1:
                    System.out.println("This is list of cars u can buy.");
                    System.out.println(carBase.baseOfCars);
                    break;

                case 2:
                    System.out.println("Select car you want buy.");
                    System.out.println("Your money: " + decimalFormat(you.getCash()));
                    carIndex = in.nextInt()-1;
                    try{
                        you.purchase(carBase, carIndex);
                        numberOfTurns++;
                    }catch (Exception e){
                        e.printStackTrace();
                    }break;

                case 3:
                    System.out.println("This is list of cars that u owned.");
                    System.out.println(you.playerCars);
                    break;

                case 4:
                    if (you.playerCars.size()==0){
                        System.out.println("You do not own any cars.");
                    }else{
                        System.out.println("Choose mechanic:");
                        System.out.println("1) Janusz");
                        System.out.println("2) Marian");
                        System.out.println("3) Adrian");
                        switch (mechanic){
                            case 1:
                                System.out.println("You chose Janusz.");
                                System.out.println("This is list of your car.");
                                System.out.println(you.playerCars);
                                System.out.println("Select car to repair.");
                                carIndex = in.nextInt()-1;
                                try{
                                    mechanic1.januszRepair(you, you.getCar(carIndex));
                                    numberOfTurns++;
                                }catch (Exception e){
                                    e.printStackTrace();
                                }break;
                            case 2:
                                System.out.println("You chose Marian.");
                                System.out.println("This is list of your car.");
                                System.out.println(you.playerCars);
                                System.out.println("Select car to repair.");
                                carIndex = in.nextInt()-1;
                                try{
                                    mechanic2.marianRepair(you, you.getCar(carIndex));
                                    numberOfTurns++;
                                }catch (Exception e){
                                    e.printStackTrace();
                                }break;
                            case 3:
                                System.out.println("You chose Adrian.");
                                System.out.println("This is list of your car.");
                                System.out.println(you.playerCars);
                                System.out.println("Select car to repair.");
                                carIndex = in.nextInt()-1;
                                try{
                                    mechanic3.adrianRepair(you, you.getCar(carIndex));
                                    numberOfTurns++;
                                }catch (Exception e){
                                    e.printStackTrace();
                                }break;
                        }
                    }
                case 5:
                    System.out.println("This is list of your potential customers.");
                    System.out.println(clientBase.baseOfClient);
                    break;

                case 6:
                    System.out.println("This is your money");
                    System.out.println(decimalFormat(you.getCash()));
                    break;

                case 7:
                    System.out.println("You can buy ad in newspaper and it will cost you 500 or in internet and pay 100.");
                    System.out.println("1) Buy ad in newspaper.");
                    System.out.println("2) Buy ad in internet.");
                    switch (adIndex){
                        case 1:
                            if (you.cash < 500.0){
                                System.out.println("You can not buy ad in newspaper.");
                            }else{
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
                            }else {
                                you.cash = you.cash - 100.0;
                                clientBase.baseOfClient.add(new Client());
                                System.out.println("You bought ad in internet and gain 1 new potential customers");
                                numberOfTurns++;
                                break;
                            }

                    }
                    if (you.cash >= 120000.0){
                        System.out.println("You won game.");
                        System.exit(0);
                    } else if(you.cash <= 3000.0){
                        System.out.println("You do not have enough money");
                        System.out.println("You lose game.");
                        System.exit(0);
                    }
            }
            System.out.println("Wciśnij enter aby kontynuować.");
            System.in.read();
            choice = menu();
        }
    }

    private static String decimalFormat(Double value) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        return decimalFormat.format(value);
    }
}