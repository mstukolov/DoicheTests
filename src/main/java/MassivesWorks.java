import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Maxim on 27.10.2016.
 */
public class MassivesWorks {

    public static void main(String[] args) {

        int[] a = {10};
        int[] b = a; // Копируется только ссылка на объект. Т.о. при изменении b, а также измениться
        a[0] = 11;

        //System.out.printf("a = %d\n b = %d", a[0], b[0]);

        ArrayList list1 = new ArrayList();
        list1.add("Hello");
        ArrayList list2 = (ArrayList) list1.clone();//При клонировании создается новый объект и заполняется значенями из исходного.
        list1.set(0, "Buy!!!!!!!!!");

        boolean isEqual = list1.equals(list2);

        //System.out.printf("value1 = %s\n value2 = %s\n", list1.get(0), list2.get(0));
        //System.out.printf("Massives is eq = %s", isEqual);

        //Простая Сортировка массива
        String[] names = {"Maxim", "Sergey", "Alex"};
        Arrays.sort(names);
        for(String val: names){
            System.out.println(val);
        }


    }
}
