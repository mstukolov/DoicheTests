package patterns.decorator;

/**
 * Created by Maxim on 22.12.2016.
 */
public class Conditioner extends CarDecorator {

    public Conditioner(ICar iCar) {
        super(iCar);
    }
    public int getPrice() {
        return iCar.getPrice() + 2000;
    }

    public String getDescription() {
        return iCar.getDescription() + " with conditioner";
    }


}
