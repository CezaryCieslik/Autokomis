package databases;

import vehicles.Car;

import java.util.HashSet;
import java.util.Set;

public class CarBase {
    public Set<Car> baseOfCars;

    public CarBase(){
        this.baseOfCars = new HashSet<Car>();
    }

    public Car getCar(Integer i){
        Car[] array = new Car[baseOfCars.size()];
        baseOfCars.toArray(array);
        return array[i];
    }

    public Double getValue(Integer i){
        Car[] array = new Car[baseOfCars.size()];
        baseOfCars.toArray(array);
        return array[i].getValue();
    }

    public void removeCar(Car car){
        this.baseOfCars.remove(car);
    }
}
