package collections;

import java.util.HashMap;

/**
 * Created by Maxim on 11.01.2017.
 */
public class HashMapApp {

    /*HashMap реализует интерфейс Map, который подразумевает хранение данных в виде пар ключ-значение.
    HashMap не является синхронизированным и потокобезопасным.
    Также HashMap допускает хранение null ключей и значений, но недопускает дублей ключей.
    Следует помнить, что для null-ключа hashCode() всегда равен нулю.*/

    public static void main(String[] args) {
        HashMap<Integer, Integer> studentsHashmap = new HashMap<Integer, Integer>();
        studentsHashmap.put(1, null);  // здесь все хорошо,
        studentsHashmap.put(null, 2); // и здесь тоже все без проблем


    }

}
