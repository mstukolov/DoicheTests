package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/**
 * Created by Maxim on 11.01.2017.
 */
public class HashMapApp {

    /*HashMap реализует интерфейс Map, который подразумевает хранение данных в виде пар ключ-значение.
    HashMap не является синхронизированным и потокобезопасным.
    Также HashMap допускает хранение null ключей и значений, но недопускает дублей ключей.
    Следует помнить, что для null-ключа hashCode() всегда равен нулю.*/

    public static void main(String[] args) {
        HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
        hashmap.put(1, null);  // здесь все хорошо,
        hashmap.put(null, 2); // и здесь тоже все без проблем

        Random random = new Random(30);
        for (int j = 0; j < 1000000; j++) {
            hashmap.put(random.nextInt(), random.nextInt());
        }
        System.out.println("Inserted is Finished: " + Thread.currentThread().getName());


        for (int i = 0; i < 100; i++) {

            System.out.println("Начат перебор");
            new Thread(()->{
                System.out.println(Thread.currentThread().getName());

                for (Integer key : hashmap.keySet()) {
                    System.out.println(hashmap.get(key));
                }
            }).start();
        }

    }

}
