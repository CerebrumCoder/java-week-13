import java.util.Optional;

public class CobaOptional {
    public static void main(String[] args) {
        Pesan pesan = new Pesan("Hello world");

        // Without Optional
        if (pesan != null && pesan.getPesan() != null) {
            System.out.println("Pesan tanpa Optional: " + pesan.getPesan());
        } else {
            System.out.println("Pesan tanpa Optional: Pesan default");
        }

        // With Optional
        Optional<Pesan> optionalPesan = Optional.ofNullable(pesan);
        System.out.println("Pesan dengan Optional: " +
                optionalPesan.orElse(new Pesan("Pesan default")));
    }
}

class Pesan {
    private String pesan;

    public Pesan(String pesan) {
        this.pesan = pesan;
    }

    public String getPesan() {
        return pesan;
    }
    public String toString() {
        return pesan;
    }
}