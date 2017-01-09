package patterns.decorator;

/**
 * Created by Maxim on 22.12.2016.
 */
public class CarDecorator implements ICar {

    protected final ICar iCar;

    public CarDecorator(ICar iCar) {
        this.iCar = iCar;
    }


    @Override
    public int getPrice() {
        return iCar.getPrice();
    }

    @Override
    public String getDescription() {
        return iCar.getDescription();
    }
}
