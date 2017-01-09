package statics;

/**
 * Created by Maxim on 30.10.2016.
 */
public class WorkWithStaticClass {

    public static void main(String[] args) {
        int a = 5;
        a += MainStaticClass.MAX_VALUE;
        MainStaticClass.Param1 = 6;
        System.out.println(MainStaticClass.calc_MAX_VALUE(a));
    }
}
