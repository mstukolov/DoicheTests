package patterns.decorator;

/**
 * Created by Maxim on 22.12.2016.
 */
public class Client {
    public static void main(String[] args) {

        ICar car = new SimpleCar();
        System.out.println("Price: " + car.getPrice()
                + ", Description: " + car.getDescription());

        car = new Conditioner(car);
        System.out.println("Price: " + car.getPrice()
                + ", Description: " + car.getDescription());

        car = new LeatherInterior(car);
        System.out.println("Price: " + car.getPrice()
                + ", Description: " + car.getDescription());

        car = new CarWithABS(car);
        System.out.println("Price: " + car.getPrice()
                + ", Description: " + car.getDescription());

    }
}
