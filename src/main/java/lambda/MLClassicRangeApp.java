package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by Maxim on 12.01.2017.
 */
public class MLClassicRangeApp {

    public static void main(String[] args) {

        MLrangeInterface<Double> cubeFunction = (x, a, b, c, d) ->
                a*Math.pow(x, 3) + b*Math.pow(x, 2) + c*Math.pow(x, 1) + d;


        List<Double> xParams = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
                xParams.add(Double.valueOf(i));

        }

        List<Double> yParams = new ArrayList<>();
        xParams.stream().mapToDouble((a) -> cubeFunction.apply(a,1D,1D,1D,1D)).forEach(yParams::add);

        for (int i = 0; i < 10; i++) {
            System.out.printf("x=%f;y=%f\n", xParams.get(i), yParams.get(i));
        }

    }
}
