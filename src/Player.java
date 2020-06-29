import databases.CarBase;
import databases.ClientBase;
import vehicles.Car;

import java.text.DecimalFormat;
import java.util.ArrayList;


public class Player implements Purchase, Sale{
    public Double cash = 30000.0;
    public ArrayList<Car> playerCars;
    public Double tax = 0.02;

    public void removeCar(Car car){
        this.playerCars.remove(car);
    }

    public Double getCash(){
        return this.cash;
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
    public void sale(ClientBase clientBase, int number) throws Exception {

    }

    private String decimalFormat(Double value) {
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        return decimalFormat.format(value);
    }
}
