import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CobaMap {
    public static void main(String[] args) {
        // Create a list of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Use the map function to square each number
        numbers.stream()
                .map(number -> number * number)
                .forEach(System.out::println);

        List<Integer> squares =
                numbers.stream()
                        .map(number -> number * number)
                        .collect(Collectors.toList());

        System.out.println("Squares: " + squares);
    }
}
