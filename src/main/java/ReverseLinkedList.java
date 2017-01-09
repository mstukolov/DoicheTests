import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Maxim on 09.10.2016.
 */
public class ReverseLinkedList {

    public static LinkedList<Integer> list = new LinkedList();

    public static void main(String[] args) {

        fillData();
        int size = list.size();

        Iterator iterator = list.iterator();
        while(iterator.hasNext())   System.out.print(iterator.next() + ",");
        System.out.println("");

        for(int j=0; j <= size/2 - 1; j++) {
            Integer last = list.get(size - 1 - j);
            Integer first = list.get(0 + j);

            list.set(0 + j, last);
            list.set(size - 1- j, first);
        }

        Iterator iterator2 = list.iterator();
        while(iterator2.hasNext())   System.out.print(iterator2.next() + ",");




    }

    public static void fillData(){
        for(int i=0; i<=13;i++){
            list.add(i);
        }
    }

}
