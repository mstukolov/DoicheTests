package patterns.decorator;

/**
 * Created by Maxim on 22.12.2016.
 */
public class CarWithABS extends CarDecorator{

    public CarWithABS(ICar iCar) {
        super(iCar);
    }

    public int getPrice() {
        return iCar.getPrice() + 6000;
    }

    public String getDescription() {
        return iCar.getDescription() + " with ABS";
    }
}
