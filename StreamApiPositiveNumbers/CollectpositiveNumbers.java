package streamapiexamples01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class CollectpositiveNumbers {

    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(3,-1,8,-2,5,12);

        int sumOfPositiveNumbers = numbers.stream()
                .filter(number -> number > 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum of positive numbers: " + sumOfPositiveNumbers);
    }
}

