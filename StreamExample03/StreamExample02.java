package StreamExample01;

import java.util.Arrays;
import java.util.List;

public class StreamExample02 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,5);
        int sum = numbers.stream().reduce(Integer::sum).get();
        System.out.println(sum);
    }
}
