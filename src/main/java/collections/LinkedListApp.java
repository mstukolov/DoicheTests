package collections;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Maxim on 12.01.2017.
 */
public class LinkedListApp {

   /* LinkedList — реализует интерфейсы List, Dequeue, Queue и является представителем двунаправленного списка,
    где каждый элемент структуры содержит указатели на предыдущий и следующий элементы.
    Итератор поддерживает обход в обе стороны.
    LinkedList реализует методы получения, удаления и вставки в начало, середину и конец списка,
    а также позволяет добавлять любые элементы, в том числе и null.*/

    public static void main(String[] args) {
        LinkedList<String> states = new LinkedList<String>();

        // Добавление элементов в список
        states.add     ("Германия"      );
        states.add     ("Франция"       );
        states.addLast ("Великобритания"); // добавляем элемент в конец
        states.addFirst("Испания"       ); // добавляем элемент в первую позицию
        states.add     (1, "Италия"     ); // добавляем элемент с индексом 1

        System.out.printf("В списке %d элементов \n", states.size());
        System.out.println(states.get(1));
        states.set(1, "Дания");
        for (String state : states){
            System.out.println(state);
        }
        // проверка на наличие элемента в списке
        if (states.contains("Германия")){
            System.out.println("Список содержит государство Германия");
        }

        states.remove("Германия");
        states.removeFirst(); // удаление первого элемента
        states.removeLast();  // удаление последнего элемента
    }
}
