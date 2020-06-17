package vehicles;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class Car {
    public Double value;
    public String brand;
    public Integer mileage;
    public String color;
    public String segment;
    public Double costOfAllRepairs = 0.0;
    public Double costOfAllWashes = 0.0;
    Integer randomMileage = ThreadLocalRandom.current().nextInt(0,500000);

    public String brandGenerator(){
        Random random = new Random();
        String[] brands = {"Toyota", "Volkswagen", "Ford", "Honda", "Nissan", "Hyundai", "Chevrolet", "Kia", "Mercedes", "BMW", "Alfa Romeo", "Audi", "Fiat", "Citroen", "Mazda", "Opel", "Peugeot", "Renault", "Volvo", "Skoda"};
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
}

