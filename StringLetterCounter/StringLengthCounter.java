package streamapiexamples01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class StringLengthCounter {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Merhaba", "Dünya", "Java", "Stream", "API");

        long totalLength = stringList.stream()
                .mapToLong(String::length)
                .sum();

        System.out.println("Total length of strings: " + totalLength);
    }
}
