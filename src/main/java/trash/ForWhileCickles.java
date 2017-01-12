package trash;

import java.util.Scanner;

/**
 * Created by Maxim on 28.10.2016.
 */
public class ForWhileCickles {

    public static void main(String[] args) {

        /*for (int i = 0; i < 10; i++) {
            if(i%2 == 0)continue;
            System.out.println(i);
            if(i == 5)break;
        }*/

        /*label:
        for (int i = 0; i < 10 ; i++) {

            if(i == 2) continue label;

            for (int j = 0; j < 10; j++) {
                int nm = i*j;
                if(j == 3) continue label;
               *//* System.out.printf("%4d", nm);*//*
            }
            System.out.println();
        }
        System.out.println("Out!!!");*/


       /* int c = 1;
        while (c < 1000){
            System.out.println(c);
            c *=2;
        }*/

        /*int c = 1000;
        do {
            System.out.println(c);
            c *= 2;
        } while (c < 1000);*/

        int c = 1;
        while(true){
            c += 1;
            System.out.println(c);
        }

    }
}
