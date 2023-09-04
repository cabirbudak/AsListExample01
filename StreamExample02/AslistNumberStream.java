package StreamExample01;

import java.util.Arrays;
import java.util.List;

public class AslistNumberStream {
    public static void main(String[] args) {
        Integer[] numbersArray = {2,4,6,8,10};

        List<Integer> numbersList = Arrays.asList(numbersArray);
        int sum = numbersList.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("The sum of the numbers is: " + sum);
    }
}
