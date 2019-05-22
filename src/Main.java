import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        Autor piotr = new Autor("piotr", "ko");
        Autor adam = new Autor("adam", "sadam");
        Ksiazka horror = new Ksiazka(100, "horrorowy", Rodzaj.HORRORY, piotr);
        Ksiazka fantasy = new Ksiazka(300, "fantastyczny tytul", Rodzaj.FANTASY, adam);

        System.out.println(horror.tytul);
        System.out.println(horror.iloscStron);
        System.out.println(horror.rodzaj);
        horror.osoba.przedstawSie();

        fantasy.osoba.przedstawSie();
    }
}
