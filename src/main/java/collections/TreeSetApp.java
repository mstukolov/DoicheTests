package collections;

import java.util.*;

/**
 * Created by Maxim on 11.01.2017.
 */
public class TreeSetApp {
   /* Переделанный пример для вывода случайных чисел в отсортированном порядке.
    HashSet не может гарантировать, что данные будут отсортированы, так как работает по другому алгоритму.
    Если сортировка для вас важна, то используйте TreeSet.*/

    public static void main(String[] args) {
        SortedSet<Integer> numberSet = new TreeSet<>();
        numberSet.add(3);
        numberSet.add(2);
        numberSet.add(1);

        Iterator<Integer> iterator = numberSet.iterator();
        while (iterator.hasNext()){
            System.out.println("TreeSet: " + iterator.next());
        }

        SortedSet<String> countrySet = new TreeSet<>();
        countrySet.add("Россия");
        countrySet.add("Франция");
        countrySet.add("Гондурас");
        countrySet.add("Кот-Д'Ивуар");

        Iterator<String> countrySetIterator = countrySet.iterator();
        while (countrySetIterator.hasNext()){
            System.out.println("countrySet: " + countrySetIterator.next());
        }

        Set<Integer> numberHashSet = new HashSet<>();
        numberHashSet.add(2);
        numberHashSet.add(3);
        numberHashSet.add(1);

        Iterator<Integer> hashsetiterator = numberHashSet.iterator();
        while (hashsetiterator.hasNext()){
            System.out.println("HashSet: " + hashsetiterator.next());
        }

    }



}
