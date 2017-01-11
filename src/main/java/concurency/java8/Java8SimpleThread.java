package concurency.java8;

/**
 * Created by Maxim on 11.01.2017.
 */
public class Java8SimpleThread {
    public static void main(String[] args) {
        // Lambda Runnable
        Runnable task2 = () -> { System.out.println("Task #2 is running"); };

        // start the thread
        new Thread(task2).start();
    }
}
