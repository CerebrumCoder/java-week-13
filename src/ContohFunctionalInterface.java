@FunctionalInterface
interface StringFungsi {
    String fungsi(String str);
}

@FunctionalInterface
interface StringFungsiDuaParameter {
    String fungsi(String str1, String str2);
}

public class ContohFunctionalInterface {

    public static void main(String[] args) {

        StringFungsi seru = (s) -> s + "!";
        StringFungsi tanya = (s) -> s + "?";

        System.out.println(seru.fungsi("Hello"));
        System.out.println(tanya.fungsi("Hello"));

        StringFungsiDuaParameter koma = (s,t) -> s + ", " + t;

        System.out.println(koma.fungsi("Hello","world"));

        StringFungsiDuaParameter titikdua = (s,t) -> s + ": " + t;

        System.out.println(titikdua.fungsi("Hello","world"));

    }
}
