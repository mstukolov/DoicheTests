package streamapi;

import lambda.FunctionalInterfaces2Param;
import org.omg.PortableServer.THREAD_POLICY_ID;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/**
 * Created by Maxim on 12.01.2017.
 */
public class ConsumerApp {

    public static void main(String[] args) {

        // создаем какую-то коллекцию, например, List
        List<Integer> myList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) myList.add(i);

        // получаем итератор для работы в while цикле
        Iterator<Integer> it = myList.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            //System.out.println(i);
        }

        //обходим с помощью реализации интерфейса Consumer
        MyConsumer action = new MyConsumer();
        //myList.forEach(action);

        //myList.forEach((a)-> System.out.println("Lambda Consumer" + a));

        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("my");
        strings.add("friend");
        strings.add("?");
        strings.add("How");
        strings.add("are");
        strings.add("you");
        strings.add("?");

        strings.parallelStream().forEach((a) -> System.out.printf("Value is=%s\n", a));


        BinaryOperator<Integer> multiply = (x, y) -> x*y;
        System.out.println(multiply.apply(3, 5));

        FunctionalInterfaces2Param<Integer> minus = (x, y) -> x - y;
        System.out.println("Minus is: " + minus.apply(6,2));
    }


    static class MyConsumer implements Consumer<Integer> {

        public void accept(Integer t) {
            System.out.println("MyConsumer: " + t);
        }
    }




}
