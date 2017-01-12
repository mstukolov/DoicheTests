package trash;

import java.util.Scanner;

/**
 * Created by Maxim on 27.10.2016.
 */
public class IfElseOperators {

    public static void main(String[] args) {

        int n = 4;
        String s = (n==0) ? "0" : "not 0";
        //System.out.println(s);
        //����������� ���������� ����� �� ������

        Scanner sc = new Scanner(System.in);
        Integer count = Integer.parseInt(sc.nextLine())%100;
        String str = "voron";

        Integer last = count%10;

        if(count >= 10 && count <= 20)
        {
            System.out.println(count + " " + str);

        } else {
            if (last >= 2 && last <= 4) {
                System.out.println(count + " " + str + "y");
            } else if (last >= 5 && last <= 9 || last == 0) {
                System.out.println(count + " " + str);
            } else if (last == 1) {
                System.out.println(count + " " + str + "a");
            }
        }
    }
}
