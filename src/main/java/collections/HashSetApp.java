package collections;

import java.util.*;

/**
 * Created by Maxim on 11.01.2017.
 */
public class HashSetApp {
    /*Название Hash... происходит от понятия хэш-функция.Хэш-функция — это функция,
    сужающая множество значений объекта до некоторого подмножества целых чисел.
    Класс Object имеет метод hashCode(),
    который используется классом HashSet для эффективного размещения объектов, заносимых
    в коллекцию. В классах объектов, заносимых в HashSet, этот метод должен быть переопределен (override).*/

    public static void main(String[] args) {
        HashSet<String> countryHashSet = new HashSet<>();
        countryHashSet.add("Франция");
        countryHashSet.add("Кот-Д'Ивуар");
        countryHashSet.add("Россия");
        countryHashSet.add("Гондурас");
        countryHashSet.add("Кот-Д'Ивуар"); // любимая страна всех котов

        // Получим размер HashSet
        System.out.println("Размер HashSet = " + countryHashSet.size());

        Iterator<String> iterator = countryHashSet.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }

        Random random = new Random(30);
        Set<Integer> numberSet = new HashSet<>();

        for(int i = 0; i < 1000; i++)
            numberSet.add(random.nextInt(10));

    }
}
