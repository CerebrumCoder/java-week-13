import java.util.Arrays;
import java.util.List;

public class CobaFilter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

        names.stream()
                .filter(x -> x.length()<4)
                .forEach(System.out::println); // point free style
    }
}
