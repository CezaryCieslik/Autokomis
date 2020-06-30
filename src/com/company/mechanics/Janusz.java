package com.company.mechanics;

import com.company.humans.Player;
import com.company.vehicles.Car;

import java.util.Random;

public class Janusz {

    public String brakes;
    public String chassis;
    public String engine;
    public String body;
    public String gearbox;
    public String[] brakesState = new String[]{"Broken", "Efficient"};
    public String[] chassisState = new String[]{"Broken", "Efficient"};
    public String[] engineState = new String[]{"Broken", "Efficient"};
    public String[] bodyState = new String[]{"Broken", "Efficient"};
    public String[] gearboxState = new String[]{"Broken", "Efficient"};

    public String getRandom(String[] array){
        int random = new Random().nextInt(array.length);
        return array[random];
    }

    public Janusz(){
        this.brakes = getRandom(brakesState);
        this.chassis = getRandom(chassisState);
        this.engine = getRandom(engineState);
        this.body = getRandom(bodyState);
        this.gearbox = getRandom(gearboxState);
    }

    public void isBroken(){
        if (this.brakes.equals("Broken")){
            System.out.println("Brakes needs repair");
        }
        if (this.chassis.equals("Broken")){
            System.out.println("Chassis needs repair");
        }
        if (this.engine.equals("Broken")) {
            System.out.println("Engine needs repair");
        }
        if (this.body.equals("Broken")) {
            System.out.println("Body needs repair");
        }
        if (this.gearbox.equals("Broken")) {
            System.out.println("Gearbox needs repair");
        }
    }

    public void januszRepair(Player player, Car car){
        Double PRICE_FOR_TOYOTA = 1.6;
        Double PRICE_FOR_VOLKSWAGEN = 1.1;
        Double PRICE_FOR_FORD = 1.3;
        Double PRICE_FOR_HONDA = 1.7;
        Double PRICE_FOR_NISSAN = 1.5;
        Double PRICE_FOR_HYUNDAI = 1.4;
        Double PRICE_FOR_AUDI = 1.5;
        Double PRICE_FOR_KIA = 1.2;
        Double PRICE_FOR_MERCEDES = 1.7;
        Double PRICE_FOR_BMW = 1.6;
        if(this.brakes.equals("Efficient")){
            System.out.println("Brakes do not require repair");
        }else{
            Double BRAKES_REPAIR_PRICE = 500.0;
            if(this.brakes.equals("Broken") && car.brand.equals("Toyota")){
               player.cash = player.cash - BRAKES_REPAIR_PRICE * PRICE_FOR_TOYOTA;
               System.out.println("Repair brakes cost you: " + BRAKES_REPAIR_PRICE * PRICE_FOR_TOYOTA);
               car.value = car.value * 1.1;
               System.out.println("Car value increased by 10%");
            }
            else if(this.brakes.equals("Broken") && car.brand.equals("Volkswagen")){
                player.cash = player.cash - BRAKES_REPAIR_PRICE * PRICE_FOR_VOLKSWAGEN;
                System.out.println("Repair brakes cost you: " + BRAKES_REPAIR_PRICE * PRICE_FOR_VOLKSWAGEN);
                car.value = car.value * 1.1;
                System.out.println("Car value increased by 10%");
            }
            else if(this.brakes.equals("Broken") && car.brand.equals("Ford")){
                player.cash = player.cash - BRAKES_REPAIR_PRICE * PRICE_FOR_FORD;
                System.out.println("Repair brakes cost you: " + BRAKES_REPAIR_PRICE * PRICE_FOR_FORD);
                car.value = car.value * 1.1;
                System.out.println("Car value increased by 10%");
            }
            else if(this.brakes.equals("Broken") && car.brand.equals("Honda")){
                player.cash = player.cash - BRAKES_REPAIR_PRICE * PRICE_FOR_HONDA;
                System.out.println("Repair brakes cost you: " + BRAKES_REPAIR_PRICE * PRICE_FOR_HONDA);
                car.value = car.value * 1.1;
                System.out.println("Car value increased by 10%");
            }
            else if(this.brakes.equals("Broken") && car.brand.equals("Nissan")) {
                player.cash = player.cash - BRAKES_REPAIR_PRICE * PRICE_FOR_NISSAN;
                System.out.println("Repair brakes cost you: " + BRAKES_REPAIR_PRICE * PRICE_FOR_NISSAN);
                car.value = car.value * 1.1;
                System.out.println("Car value increased by 10%");
            }
            else if(this.brakes.equals("Broken") && car.brand.equals("Hyundai")) {
                player.cash = player.cash - BRAKES_REPAIR_PRICE * PRICE_FOR_HYUNDAI;
                System.out.println("Repair brakes cost you: " + BRAKES_REPAIR_PRICE * PRICE_FOR_HYUNDAI);
                car.value = car.value * 1.1;
                System.out.println("Car value increased by 10%");
            }
            else if(this.brakes.equals("Broken") && car.brand.equals("Audi")) {
                player.cash = player.cash - BRAKES_REPAIR_PRICE * PRICE_FOR_AUDI;
                System.out.println("Repair brakes cost you: " + BRAKES_REPAIR_PRICE * PRICE_FOR_AUDI);
                car.value = car.value * 1.1;
                System.out.println("Car value increased by 10%");
            }
            else if(this.brakes.equals("Broken") && car.brand.equals("Kia")) {
                player.cash = player.cash - BRAKES_REPAIR_PRICE * PRICE_FOR_KIA;
                System.out.println("Repair brakes cost you: " + BRAKES_REPAIR_PRICE * PRICE_FOR_KIA);
                car.value = car.value * 1.1;
                System.out.println("Car value increased by 10%");
            }
            else if(this.brakes.equals("Broken") && car.brand.equals("Mercedes")) {
                player.cash = player.cash - BRAKES_REPAIR_PRICE * PRICE_FOR_MERCEDES;
                System.out.println("Repair brakes cost you: " + BRAKES_REPAIR_PRICE * PRICE_FOR_MERCEDES);
                car.value = car.value * 1.1;
                System.out.println("Car value increased by 10%");
            }
            else if(this.brakes.equals("Broken") && car.brand.equals("BMW")) {
                player.cash = player.cash - BRAKES_REPAIR_PRICE * PRICE_FOR_BMW;
                System.out.println("Repair brakes cost you: " + BRAKES_REPAIR_PRICE * PRICE_FOR_BMW);
                car.value = car.value * 1.1;
                System.out.println("Car value increased by 10%");
            }
        }

        Double CHASSIS_REPAIR_PRICE = 1000.0;
        if(this.chassis.equals("Efficient")){
            System.out.println("Chassis do not require repair");
        }else{
            if(this.chassis.equals("Broken") && car.brand.equals("Toyota")){
                player.cash = player.cash - CHASSIS_REPAIR_PRICE * PRICE_FOR_TOYOTA;
                System.out.println("Repair chassis cost you: " + CHASSIS_REPAIR_PRICE * PRICE_FOR_TOYOTA);
                car.value = car.value * 1.2;
                System.out.println("Car value increased by 20%");
            }
            else if(this.chassis.equals("Broken") && car.brand.equals("Volkswagen")){
                player.cash = player.cash - CHASSIS_REPAIR_PRICE * PRICE_FOR_VOLKSWAGEN;
                System.out.println("Repair chassis cost you: " + CHASSIS_REPAIR_PRICE * PRICE_FOR_VOLKSWAGEN);
                car.value = car.value * 1.2;
                System.out.println("Car value increased by 20%");
            }
            else if(this.chassis.equals("Broken") && car.brand.equals("Ford")){
                player.cash = player.cash - CHASSIS_REPAIR_PRICE * PRICE_FOR_FORD;
                System.out.println("Repair chassis cost you: " + CHASSIS_REPAIR_PRICE * PRICE_FOR_FORD);
                car.value = car.value * 1.2;
                System.out.println("Car value increased by 20%");
            }
            else if(this.chassis.equals("Broken") && car.brand.equals("Honda")){
                player.cash = player.cash - CHASSIS_REPAIR_PRICE * PRICE_FOR_HONDA;
                System.out.println("Repair chassis cost you: " + CHASSIS_REPAIR_PRICE * PRICE_FOR_HONDA);
                car.value = car.value * 1.2;
                System.out.println("Car value increased by 20%");
            }
            else if(this.chassis.equals("Broken") && car.brand.equals("Nissan")) {
                player.cash = player.cash - CHASSIS_REPAIR_PRICE * PRICE_FOR_NISSAN;
                System.out.println("Repair chassis cost you: " + CHASSIS_REPAIR_PRICE * PRICE_FOR_NISSAN);
                car.value = car.value * 1.2;
                System.out.println("Car value increased by 20%");
            }
            else if(this.chassis.equals("Broken") && car.brand.equals("Hyundai")) {
                player.cash = player.cash - CHASSIS_REPAIR_PRICE * PRICE_FOR_HYUNDAI;
                System.out.println("Repair chassis cost you: " + CHASSIS_REPAIR_PRICE * PRICE_FOR_HYUNDAI);
                car.value = car.value * 1.2;
                System.out.println("Car value increased by 20%");
            }
            if(this.chassis.equals("Broken") && car.brand.equals("Audi")) {
                player.cash = player.cash - CHASSIS_REPAIR_PRICE * PRICE_FOR_AUDI;
                System.out.println("Repair chassis cost you: " + CHASSIS_REPAIR_PRICE * PRICE_FOR_AUDI);
                car.value = car.value * 1.2;
                System.out.println("Car value increased by 20%");
            }
            else if(this.chassis.equals("Broken") && car.brand.equals("Kia")) {
                player.cash = player.cash - CHASSIS_REPAIR_PRICE * PRICE_FOR_KIA;
                System.out.println("Repair chassis cost you: " + CHASSIS_REPAIR_PRICE * PRICE_FOR_KIA);
                car.value = car.value * 1.2;
                System.out.println("Car value increased by 20%");
            }
            else if(this.chassis.equals("Broken") && car.brand.equals("Mercedes")) {
                player.cash = player.cash - CHASSIS_REPAIR_PRICE * PRICE_FOR_MERCEDES;
                System.out.println("Repair chassis cost you: " + CHASSIS_REPAIR_PRICE * PRICE_FOR_MERCEDES);
                car.value = car.value * 1.2;
                System.out.println("Car value increased by 20%");
            }
            else if(this.chassis.equals("Broken") && car.brand.equals("BMW")) {
                player.cash = player.cash - CHASSIS_REPAIR_PRICE * PRICE_FOR_BMW;
                System.out.println("Repair chassis cost you: " + CHASSIS_REPAIR_PRICE * PRICE_FOR_BMW);
                car.value = car.value * 1.2;
                System.out.println("Car value increased by 20%");
            }
        }

        Double ENGINE_REPAIR_PRICE = 10000.0;
        if(this.engine.equals("Efficient")){
            System.out.println("Engine do not require repair");
        }else{
            if(this.engine.equals("Broken") && car.brand.equals("Toyota")){
                player.cash = player.cash - ENGINE_REPAIR_PRICE * PRICE_FOR_TOYOTA;
                System.out.println("Repair engine cost you: " + ENGINE_REPAIR_PRICE * PRICE_FOR_TOYOTA);
                car.value = car.value * 2.0;
                System.out.println("Car value increased by 100%");
            }
            else if(this.engine.equals("Broken") && car.brand.equals("Volkswagen")){
                player.cash = player.cash - ENGINE_REPAIR_PRICE * PRICE_FOR_VOLKSWAGEN;
                System.out.println("Repair engine cost you: " + ENGINE_REPAIR_PRICE * PRICE_FOR_VOLKSWAGEN);
                car.value = car.value * 2.0;
                System.out.println("Car value increased by 100%");
            }
            else if(this.engine.equals("Broken") && car.brand.equals("Ford")){
                player.cash = player.cash - ENGINE_REPAIR_PRICE * PRICE_FOR_FORD;
                System.out.println("Repair engine cost you: " + ENGINE_REPAIR_PRICE * PRICE_FOR_FORD);
                car.value = car.value * 2.0;
                System.out.println("Car value increased by 100%");
            }
            else if(this.engine.equals("Broken") && car.brand.equals("Honda")){
                player.cash = player.cash - ENGINE_REPAIR_PRICE * PRICE_FOR_HONDA;
                System.out.println("Repair engine cost you: " + ENGINE_REPAIR_PRICE * PRICE_FOR_HONDA);
                car.value = car.value * 2.0;
                System.out.println("Car value increased by 100%");
            }
            else if(this.engine.equals("Broken") && car.brand.equals("Nissan")) {
                player.cash = player.cash - ENGINE_REPAIR_PRICE * PRICE_FOR_NISSAN;
                System.out.println("Repair engine cost you: " + ENGINE_REPAIR_PRICE * PRICE_FOR_NISSAN);
                car.value = car.value * 2.0;
                System.out.println("Car value increased by 100%");
            }
            else if(this.engine.equals("Broken") && car.brand.equals("Hyundai")) {
                player.cash = player.cash - ENGINE_REPAIR_PRICE * PRICE_FOR_HYUNDAI;
                System.out.println("Repair engine cost you: " + ENGINE_REPAIR_PRICE * PRICE_FOR_HYUNDAI);
                car.value = car.value * 2.0;
                System.out.println("Car value increased by 100%");
            }
            else if(this.engine.equals("Broken") && car.brand.equals("Audi")) {
                player.cash = player.cash - ENGINE_REPAIR_PRICE * PRICE_FOR_AUDI;
                System.out.println("Repair engine cost you: " + ENGINE_REPAIR_PRICE * PRICE_FOR_AUDI);
                car.value = car.value * 2.0;
                System.out.println("Car value increased by 100%");
            }
            else if(this.engine.equals("Broken") && car.brand.equals("Kia")) {
                player.cash = player.cash - ENGINE_REPAIR_PRICE * PRICE_FOR_KIA;
                System.out.println("Repair engine cost you: " + ENGINE_REPAIR_PRICE * PRICE_FOR_KIA);
                car.value = car.value * 2.0;
                System.out.println("Car value increased by 100%");
            }
            else if(this.engine.equals("Broken") && car.brand.equals("Mercedes")) {
                player.cash = player.cash - ENGINE_REPAIR_PRICE * PRICE_FOR_MERCEDES;
                System.out.println("Repair engine cost you: " + ENGINE_REPAIR_PRICE * PRICE_FOR_MERCEDES);
                car.value = car.value * 2.0;
                System.out.println("Car value increased by 100%");
            }
            else if(this.engine.equals("Broken") && car.brand.equals("BMW")) {
                player.cash = player.cash - ENGINE_REPAIR_PRICE * PRICE_FOR_BMW;
                System.out.println("Repair engine cost you: " + ENGINE_REPAIR_PRICE * PRICE_FOR_BMW);
                car.value = car.value * 2.0;
                System.out.println("Car value increased by 100%");
            }
        }

        Double BODY_REPAIR_PRICE = 5000.0;
        if(this.body.equals("Efficient")){
            System.out.println("Body do not require repair");
        }else{
            if(this.body.equals("Broken") && car.brand.equals("Toyota")){
                player.cash = player.cash - BODY_REPAIR_PRICE * PRICE_FOR_TOYOTA;
                System.out.println("Repair body cost you: " + BODY_REPAIR_PRICE * PRICE_FOR_TOYOTA);
                car.value = car.value * 1.5;
                System.out.println("Car value increased by 50%");
            }
            else if(this.body.equals("Broken") && car.brand.equals("Volkswagen")){
                player.cash = player.cash - BODY_REPAIR_PRICE * PRICE_FOR_VOLKSWAGEN;
                System.out.println("Repair body cost you: " + BODY_REPAIR_PRICE * PRICE_FOR_VOLKSWAGEN);
                car.value = car.value * 1.5;
                System.out.println("Car value increased by 50%");
            }
            else if(this.body.equals("Broken") && car.brand.equals("Ford")){
                player.cash = player.cash - BODY_REPAIR_PRICE * PRICE_FOR_FORD;
                System.out.println("Repair body cost you: " + BODY_REPAIR_PRICE * PRICE_FOR_FORD);
                car.value = car.value * 1.5;
                System.out.println("Car value increased by 50%");
            }
            else if(this.body.equals("Broken") && car.brand.equals("Honda")){
                player.cash = player.cash - BODY_REPAIR_PRICE * PRICE_FOR_HONDA;
                System.out.println("Repair body cost you: " + BODY_REPAIR_PRICE * PRICE_FOR_HONDA);
                car.value = car.value * 1.5;
                System.out.println("Car value increased by 50%");
            }
            else if(this.body.equals("Broken") && car.brand.equals("Nissan")) {
                player.cash = player.cash - BODY_REPAIR_PRICE * PRICE_FOR_NISSAN;
                System.out.println("Repair body cost you: " + BODY_REPAIR_PRICE * PRICE_FOR_NISSAN);
                car.value = car.value * 1.5;
                System.out.println("Car value increased by 50%");
            }
            else if(this.body.equals("Broken") && car.brand.equals("Hyundai")) {
                player.cash = player.cash - BODY_REPAIR_PRICE * PRICE_FOR_HYUNDAI;
                System.out.println("Repair body cost you: " + BODY_REPAIR_PRICE * PRICE_FOR_HYUNDAI);
                car.value = car.value * 1.5;
                System.out.println("Car value increased by 50%");
            }
            else if(this.body.equals("Broken") && car.brand.equals("Audi")) {
                player.cash = player.cash - BODY_REPAIR_PRICE * PRICE_FOR_AUDI;
                System.out.println("Repair body cost you: " + BODY_REPAIR_PRICE * PRICE_FOR_AUDI);
                car.value = car.value * 1.5;
                System.out.println("Car value increased by 50%");
            }
            else if(this.body.equals("Broken") && car.brand.equals("Kia")) {
                player.cash = player.cash - BODY_REPAIR_PRICE * PRICE_FOR_KIA;
                System.out.println("Repair body cost you: " + BODY_REPAIR_PRICE * PRICE_FOR_KIA);
                car.value = car.value * 1.5;
                System.out.println("Car value increased by 50%");
            }
            else if(this.body.equals("Broken") && car.brand.equals("Mercedes")) {
                player.cash = player.cash - BODY_REPAIR_PRICE * PRICE_FOR_MERCEDES;
                System.out.println("Repair body cost you: " + BODY_REPAIR_PRICE * PRICE_FOR_MERCEDES);
                car.value = car.value * 1.5;
                System.out.println("Car value increased by 50%");
            }
            else if(this.body.equals("Broken") && car.brand.equals("BMW")) {
                player.cash = player.cash - BODY_REPAIR_PRICE * PRICE_FOR_BMW;
                System.out.println("Repair body cost you: " + BODY_REPAIR_PRICE * PRICE_FOR_BMW);
                car.value = car.value * 1.5;
                System.out.println("Car value increased by 50%");
            }
        }

        Double GEARBOX_REPAIR_PRICE = 4000.0;
        if(this.gearbox.equals("Efficient")){
            System.out.println("Gearbox do not require repair");
        }else{
            if(this.gearbox.equals("Broken") && car.brand.equals("Toyota")){
                player.cash = player.cash - GEARBOX_REPAIR_PRICE * PRICE_FOR_TOYOTA;
                System.out.println("Repair gearbox cost you: " + GEARBOX_REPAIR_PRICE * PRICE_FOR_TOYOTA);
                car.value = car.value * 1.5;
                System.out.println("Car value increased by 50%");
            }
            else if(this.gearbox.equals("Broken") && car.brand.equals("Volkswagen")){
                player.cash = player.cash - GEARBOX_REPAIR_PRICE * PRICE_FOR_VOLKSWAGEN;
                System.out.println("Repair gearbox cost you: " + GEARBOX_REPAIR_PRICE * PRICE_FOR_VOLKSWAGEN);
                car.value = car.value * 1.5;
                System.out.println("Car value increased by 50%");
            }
            else if(this.gearbox.equals("Broken") && car.brand.equals("Ford")){
                player.cash = player.cash - GEARBOX_REPAIR_PRICE * PRICE_FOR_FORD;
                System.out.println("Repair gearbox cost you: " + GEARBOX_REPAIR_PRICE * PRICE_FOR_FORD);
                car.value = car.value * 1.5;
                System.out.println("Car value increased by 50%");
            }
            else if(this.gearbox.equals("Broken") && car.brand.equals("Honda")){
                player.cash = player.cash - GEARBOX_REPAIR_PRICE * PRICE_FOR_HONDA;
                System.out.println("Repair gearbox cost you: " + GEARBOX_REPAIR_PRICE * PRICE_FOR_HONDA);
                car.value = car.value * 1.5;
                System.out.println("Car value increased by 50%");
            }
            else if(this.gearbox.equals("Broken") && car.brand.equals("Nissan")) {
                player.cash = player.cash - GEARBOX_REPAIR_PRICE * PRICE_FOR_NISSAN;
                System.out.println("Repair gearbox cost you: " + GEARBOX_REPAIR_PRICE * PRICE_FOR_NISSAN);
                car.value = car.value * 1.5;
                System.out.println("Car value increased by 50%");
            }
            else if(this.gearbox.equals("Broken") && car.brand.equals("Hyundai")) {
                player.cash = player.cash - GEARBOX_REPAIR_PRICE * PRICE_FOR_HYUNDAI;
                System.out.println("Repair gearbox cost you: " + GEARBOX_REPAIR_PRICE * PRICE_FOR_HYUNDAI);
                car.value = car.value * 1.5;
                System.out.println("Car value increased by 50%");
            }
            else if(this.gearbox.equals("Broken") && car.brand.equals("Audi")) {
                player.cash = player.cash - GEARBOX_REPAIR_PRICE * PRICE_FOR_AUDI;
                System.out.println("Repair gearbox cost you: " + GEARBOX_REPAIR_PRICE * PRICE_FOR_AUDI);
                car.value = car.value * 1.5;
                System.out.println("Car value increased by 50%");
            }
            else if(this.gearbox.equals("Broken") && car.brand.equals("Kia")) {
                player.cash = player.cash - GEARBOX_REPAIR_PRICE * PRICE_FOR_KIA;
                System.out.println("Repair gearbox cost you: " + GEARBOX_REPAIR_PRICE * PRICE_FOR_KIA);
                car.value = car.value * 1.5;
                System.out.println("Car value increased by 50%");
            }
            else if(this.gearbox.equals("Broken") && car.brand.equals("Mercedes")) {
                player.cash = player.cash - GEARBOX_REPAIR_PRICE * PRICE_FOR_MERCEDES;
                System.out.println("Repair gearbox cost you: " + GEARBOX_REPAIR_PRICE * PRICE_FOR_MERCEDES);
                car.value = car.value * 1.5;
                System.out.println("Car value increased by 50%");
            }
            else if(this.gearbox.equals("Broken") && car.brand.equals("BMW")) {
                player.cash = player.cash - GEARBOX_REPAIR_PRICE * PRICE_FOR_BMW;
                System.out.println("Repair gearbox cost you: " + GEARBOX_REPAIR_PRICE * PRICE_FOR_BMW);
                car.value = car.value * 1.5;
                System.out.println("Car value increased by 50%");
            }
        }
    }
}