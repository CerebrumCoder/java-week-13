import java.util.Arrays;
import java.util.List;

public class CobaStream {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

        // Data engga langsung di load, dia itu load satu2. Kalo ArrayList, data langsung menuhin memori.
        names.stream().forEach(datum -> System.out.println(datum));

        names.stream().forEach(System.out::println); // point free style
    }
}
