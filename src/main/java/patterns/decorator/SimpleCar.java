package patterns.decorator;

/**
 * Created by Maxim on 22.12.2016.
 */
public class SimpleCar implements ICar{
    @Override
    public int getPrice() {
        return 100000;
    }

    @Override
    public String getDescription() {
        return "Simple auto";
    }
}
