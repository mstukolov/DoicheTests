package methods;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by Maxim on 03.11.2016.
 */
public class MethodsofClasses {

    static int [] mass = {4};
    static int a = 4;

    public static void main(String[] args) {

        System.out.println(a);
        multiply2(a);
        System.out.println(a);

        System.out.println(mass[0]);
        multiply2(mass);
        System.out.println(mass[0]);

        //Функциональный подход, за счет копирования ссылки на объект в метод
        String [] names = {"Костя","Ваня","Федор", "Алексей"};
        for(String name : names) System.out.print(name + ",");
        System.out.println();

        sortNames(names);

        for(String name : names) System.out.print(name + ",");

        //for(String name : sortNames(names)) System.out.println(name);

        //System.out.printf("Agrr is: %s", calcAgr(4D,5D,6D,7D,8D));
    }

    public static List<String> sortNames(String... names){
        List<String> c = Arrays.asList(names);
        Collections.sort(c);
        return c;
    }
    private static void multiply2(Integer value){
            value *= 2;
    }
    private static void multiply2(int [] mass){
            mass[0] *= 2;
    }

    private static double calcAgr(Double... values){

        Double summary = 0.0;
        for(Double value : values){
            summary += value;
        }
        return (summary/ values.length);
    }
}
