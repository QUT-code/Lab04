package exercise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class exercise10 {
    public static void main(String[] args) {
        // Original list of numbers
        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("List of numbers before convert: " + number);


        List<Integer> afterNumber = number.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("List of numbers after convert to even numbers: " + afterNumber);
    }
}
