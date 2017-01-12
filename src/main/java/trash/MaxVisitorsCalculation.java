package trash;

import java.util.*;

/**
 * Created by Maxim on 09.10.2016.
 */
public class MaxVisitorsCalculation {

    public static List<Visitor> visitorsList = new ArrayList<Visitor>();
    public static HashMap<Integer, Integer> counter = new HashMap();


    public static void main(String[] args) {
        generateDate();
        for (int i = 0; i<=10; i++){
            counter.put(i,0);
        }
        int counts = 0;
        for (int i = 0; i<=10; i++){
            counts += countByHour(i, true) - countByHour(i, false);
            counter.put(i,counts);
        }
        Map.Entry maxEntry = null;
        int maxValue = 0;
        int maxKey = 0;
        for (Map.Entry entry : counter.entrySet()){

            if(maxValue < (Integer) entry.getValue())
            {
                maxValue = (Integer) entry.getValue();
                maxKey =  (Integer) entry.getKey();
            }

        }
        System.out.println("Max count in time: " + maxKey + " count: " + maxValue);
    }

    public static Integer countByHour(int hour, Boolean type){
        int count = 0;

        for(int i = 0; i <= visitorsList.size()-1; i++) {
            if(type) {
                if (visitorsList.get(i).arrival == hour) count++;
            }else{
                if (visitorsList.get(i).departure == hour) count++;
            }
        }

        return count;
    }

    public static void generateDate(){
        visitorsList.add(new Visitor(2,5));
        visitorsList.add(new Visitor(3,6));
        visitorsList.add(new Visitor(3,4));
        visitorsList.add(new Visitor(3,4));
        visitorsList.add(new Visitor(3,4));
        visitorsList.add(new Visitor(3,4));
        visitorsList.add(new Visitor(4,5));
        visitorsList.add(new Visitor(4,6));
        visitorsList.add(new Visitor(4,7));
    }

static class Visitor{
    public Visitor(int arrival, int departure) {
        this.arrival = arrival;
        this.departure = departure;
    }

    int arrival;
    int departure;

    public int getArrival() {
        return arrival;
    }

    public void setArrival(int arrival) {
        this.arrival = arrival;
    }

    public int getDeparture() {
        return departure;
    }

    public void setDeparture(int departure) {
        this.departure = departure;
    }
}}