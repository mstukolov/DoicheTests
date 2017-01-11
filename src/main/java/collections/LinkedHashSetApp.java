package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Maxim on 11.01.2017.
 */
public class LinkedHashSetApp {
    /*Класс LinkedHashSet расширяет класс HashSet, не добавляя никаких новых методов.
    Класс поддерживает связный список элементов набора в том порядке,
    в котором они вставлялись. Это позволяет организовать упорядоченную итерацию вставки в набор.*/

    public static void main(String[] args) {
        Set<String> countryHashSet = new LinkedHashSet<>();
        countryHashSet.add("Франция");
        countryHashSet.add("Кот-Д'Ивуар");
        countryHashSet.add("Россия");
        countryHashSet.add("Гондурас");
        countryHashSet.add("Кот-Д'Ивуар");

        Iterator<String> iterator = countryHashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
