import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Maxim on 26.10.2016.
 */
public class LinkedVSArrayList {
    static LinkedList<Integer> linkedList = new LinkedList();
    static ArrayList<Integer> arrayList = new ArrayList();
    static long startTime, timeSpent;

    static int limit = 100000, addition = 10000;
    public static void main(String[] args) {
        addToLists();
        setEndLists();

       /* System.out.println(LinkedVSArrayList.arrayList);
        System.out.println(LinkedVSArrayList.linkedList);*/

        //removeStartLists();
        //insertStartLists();
        //insertLastLists();
        //iterateLists();
        //removeLists();
    }
    public static void addToLists(){
        /* Add to Lists: LinkedLists(15056), ArrayLists(994)*/
        startTime = System.currentTimeMillis();
        for (int i = 0; i < limit; i++) {
            linkedList.add(i);
        }
        timeSpent = System.currentTimeMillis() - startTime;
        System.out.printf("LinkedList add: %s\n", timeSpent);

        startTime = System.currentTimeMillis();
        for (int i = 0; i < limit; i++) {
            arrayList.add(i);
        }
        timeSpent = System.currentTimeMillis() - startTime;
        System.out.printf("ArrayList add: %s\n", timeSpent);
    }

    public static void removeLists(){

        /* Add to Lists: LinkedLists(140), ArrayLists(11)*/
        long startTime = System.currentTimeMillis();
        linkedList.clear();
        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.printf("LinkedList remove: %s\n", timeSpent);

        startTime = System.currentTimeMillis();
        arrayList.clear();
        timeSpent = System.currentTimeMillis() - startTime;
        System.out.printf("ArrayList remove: %s\n", timeSpent);
    }

    public static void iterateLists(){
        startTime = System.currentTimeMillis();
        ListIterator<Integer> itr = linkedList.listIterator();
        while (itr.hasNext())itr.next();
        timeSpent = System.currentTimeMillis() - startTime;
        System.out.printf("LinkedList iterate: %s\n", timeSpent);

        startTime = System.currentTimeMillis();
        ListIterator<Integer> itr2 = arrayList.listIterator();

        int j = 0;
        while (itr2.hasNext())itr2.next();
            j++;
        timeSpent = System.currentTimeMillis() - startTime;
        System.out.printf("ArrayList iterate: %s\n", timeSpent);


        startTime = System.currentTimeMillis();
        int k = 0;
        for(Integer temp : arrayList){
            k++;
        }
        timeSpent = System.currentTimeMillis() - startTime;
        System.out.printf("Old ArrayList iterate: %s\n", timeSpent);

    }

    public static void insertLastLists(){

        startTime = System.currentTimeMillis();
        for(int j = 0; j <  addition; j++) {
            linkedList.addLast(j);
           // System.out.println("Add in Linked: " + j);
        }
        timeSpent = System.currentTimeMillis() - startTime;
        System.out.printf("LinkedList LAST insert: %s\n", timeSpent);

        startTime = System.currentTimeMillis();
        for(int j = 0; j <  addition; j++) {
            arrayList.add(j);
            //System.out.println("Add in Array: " + j);
        }
        timeSpent = System.currentTimeMillis() - startTime;
        System.out.printf("ArrayList LAST insert: %s\n", timeSpent);

    }

    public static void insertStartLists(){

        startTime = System.currentTimeMillis();
        for(int j = 5; j <  addition; j++) {
            linkedList.addFirst(j);
            // System.out.println("Add in Linked: " + j);
        }
        timeSpent = System.currentTimeMillis() - startTime;
        System.out.printf("LinkedList First insert: %s\n", timeSpent);

        startTime = System.currentTimeMillis();
        for(int j = 5; j <  addition; j++) {
            arrayList.add(0, j);
            //System.out.println("Add in Array: " + j);
        }
        timeSpent = System.currentTimeMillis() - startTime;
        System.out.printf("ArrayList First insert: %s\n", timeSpent);
    }

    public static void removeStartLists(){

        startTime = System.currentTimeMillis();
        for(int j = 0; j <  addition; j++) {
            linkedList.removeFirst();
        }
        timeSpent = System.currentTimeMillis() - startTime;
        System.out.printf("LinkedList First REMOVE: %s\n", timeSpent);

        startTime = System.currentTimeMillis();
        for(int j = 0; j <  addition; j++) {
            arrayList.remove(0);
        }
        timeSpent = System.currentTimeMillis() - startTime;
        System.out.printf("ArrayList First REMOVE: %s\n", timeSpent);
    }

    public static void setEndLists(){

        startTime = System.currentTimeMillis();

        int ls = linkedList.size() / 2 ;
        int la = arrayList.size() / 2;

        for(int j = ls; j <  ls + addition; j++) {
            linkedList.set(j, j*2);
        }
        timeSpent = System.currentTimeMillis() - startTime;
        System.out.printf("LinkedList SET END: %s\n", timeSpent);

        startTime = System.currentTimeMillis();
        for(int j = la; j <  la + addition; j++) {
            arrayList.set(j, j*2);
        }
        timeSpent = System.currentTimeMillis() - startTime;
        System.out.printf("ArrayList SET END: %s\n", timeSpent);
    }
}
