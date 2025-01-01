package exercise;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class exercise11 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 3, 8);
        Collections.sort(numbers);
        System.out.println("Sorted numbers are: " + numbers);
    }
}
