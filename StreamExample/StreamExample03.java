package StreamExample01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample03 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);


        List<Integer> intNumbers = numbers.stream()
                .map(Integer::valueOf)
                .filter(e -> e % 2 == 0)
                .map(e -> e * 2)
                .collect(Collectors.toList());

        intNumbers.forEach(System.out::println);
    }
}
