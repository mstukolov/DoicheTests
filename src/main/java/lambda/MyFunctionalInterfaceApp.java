package lambda;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Maxim on 12.01.2017.
 */
public class MyFunctionalInterfaceApp {

    public static void main(String[] args) {
        run(new MyFunctionalInterface(){
            @Override
            public void printAll() {
                System.out.println("Print from Anonym class");
            }
        });

        run(() -> System.out.println("Print from Lambda class"));

        List<String> mList = Arrays.asList("aa1","cc2", "cc1", "aa2", "bb1");

        mList
                .stream()
                .filter(s -> s.startsWith("a"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }

    public static void run(MyFunctionalInterface mfi){
        mfi.printAll();
    }
}
