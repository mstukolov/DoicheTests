package collections;

import java.util.Hashtable;

/**
 * Created by Maxim on 11.01.2017.
 */
public class HashtableApp {

   /* Hashtable реализует интерфейс Map, которая хранит пары ключ-значения.
    Hashtable является синхронизированной и потокобезопасной коллекцией.
    Hashtable не допускается null-ключей и дублирующих ключей, а также null-значений.*/

    public static void main(String[] args) {

        Hashtable<Integer, String> studentsHashtable = new Hashtable<Integer, String>();
        studentsHashtable.put(1, "Andrii");  // здесь все хорошо,
        studentsHashtable.put(2, null); // вылетит NullPointerException
    }
}
