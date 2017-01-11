package concurency.threads;

/**
 * Created by Maxim on 11.01.2017.
 */
public class SimpleThreadsApp {
    public static void main(String[] args) {
        Thread [] threads = new Thread[10];

        for (Thread th : threads){
            th = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            });
            th.start();
        }
    }
}
