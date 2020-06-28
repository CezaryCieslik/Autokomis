package vehicles;

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
}
