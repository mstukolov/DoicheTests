import java.util.Date;

/**
 * Created by Maxim on 11.10.2016.
 */
public class WorkWithStrings {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        /*String hello = "Hello ";
        String name = "Maxim";
        String result  = hello + " " + name;
        System.out.println(result);
*/

       /* String r = "";
        for (int i = 0; i < 1000; i++)  r = r + String.valueOf(i) + " ";*/
        //System.out.println(r);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append(i).append(" ");
        }

        String name = "Hello";
        name.replace("ll", "NN");
        String name2 = name.replace("ll", "NN");

        System.out.println(sb.charAt(49));

        double d = 5D/2;
        double w = 9D/2;
        System.out.printf("d = %.3f, and w = %.2f\n", d, w);

        Date now = new Date();
        System.out.printf("%1$tY - %1$tm - %1$td\n", now);


        long usedBytes = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        System.out.println(usedBytes);
        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println(timeSpent);

    }
}
