package patterns.decorator;

/**
 * Created by Maxim on 22.12.2016.
 */
public class LeatherInterior extends CarDecorator {

    public LeatherInterior(ICar iCar) {
        super(iCar);
    }

    public int getPrice() {
        return iCar.getPrice() + 3000;
    }

    public String getDescription() {
        return iCar.getDescription() + " with leather interior";
    }
}
