package com.company.vehicles;

import java.util.Random;

public class Parts {

    public boolean brakes;
    public boolean chassis;
    public boolean engine;
    public boolean body;
    public boolean gearbox;

    public Parts(){
        this.brakes = isBroken(new Random().nextBoolean());
        this.chassis = isBroken(new Random().nextBoolean());
        this.engine = isBroken(new Random().nextBoolean());
        this.body = isBroken(new Random().nextBoolean());
        this.gearbox = isBroken(new Random().nextBoolean());
    }

    public boolean isBroken(boolean isBroken){
        return isBroken;
    }

    public void setBrakesBroken(){
        this.brakes = isBroken(false);
        System.out.println("Brakes are broken.");
    }

    public void setChassisBroken(){
        this.chassis = isBroken(false);
        System.out.println("Chassis is broken.");
    }

    public void setEngineBroken(){
        this.engine = isBroken(false);
        System.out.println("Engine is broken.");
    }

    public void setBodyBroken(){
        this.body = isBroken(false);
        System.out.println("Body is broken.");
    }

    public void setGearboxBroken(){
        this.gearbox = isBroken(false);
        System.out.println("Gearbox is broken.");
    }

    public void setBrakes(){
        this.brakes = isBroken(true);
    }

    public void setChassis(){
        this.chassis = isBroken(true);
    }

    public void setEngine(){
        this.engine = isBroken(true);
    }

    public void setBody(){
        this.body = isBroken(true);
    }

    public void setGearbox(){
        this.gearbox = isBroken(true);
    }

    public boolean getBrakes(){
        return this.brakes;
    }

    public boolean getChassis(){
        return this.chassis;
    }

    public boolean getEngine(){
        return this.engine;
    }

    public boolean getBody(){
        return this.body;
    }

    public boolean getGearbox(){
        return this.gearbox;
    }

}
