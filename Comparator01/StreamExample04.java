package StreamExample01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamExample04 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java", "Python", "C++", "JavaScript", "Ruby");

        strings.sort(Comparator.comparingInt(String::length));

        strings.forEach(System.out::println);
    }
}

