package streamapi;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Maxim on 12.01.2017.
 */
public class JavaStreamApp {
    public static void main(String[] args) {
        Arrays.asList("сс1", "сс2", "сс3")
                .stream()
                .findFirst()
                .ifPresent(System.out::println);

        List<String> mList = Arrays.asList("aa1","cc2", "cc1", "aa2", "bb1");

        mList
                .stream()
                .filter(s -> s.startsWith("a"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}
