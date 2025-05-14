import java.util.function.Consumer;

// Fungsi tanpa nama
public class CobaLambda {
    public static void main(String[] args) {
        // A simple lambda expression example with a parameter
        Consumer<String> greet = name -> System.out.println("Hello " + name +"!");
        greet.accept("Lambda");

    }
}
