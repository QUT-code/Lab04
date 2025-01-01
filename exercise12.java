import java.util.stream.IntStream;

public class exercise12 {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 3, 8};

        int max = IntStream.of(numbers).max().orElseThrow();
        int min = IntStream.of(numbers).min().orElseThrow();

        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min);
    }
}
