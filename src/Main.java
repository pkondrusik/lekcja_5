import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        Autor piotr = new Autor("piotr", "ko");
        Autor adam = new Autor("adam", "sadam");

        Ksiazka horror = new Ksiazka(100, "horrorowy tytul", Rodzaj.HORRORY, piotr);
        Ksiazka fantasy = new Ksiazka(300, "fantastyczny tytul", Rodzaj.FANTASY, adam);

        System.out.println("tytul: " + horror.tytul + "\nstron: " + horror.iloscStron + "\nrodzaj: " + horror.rodzaj);
        horror.osoba.przedstawSie();
        System.out.println("tytul: " + fantasy.tytul + "\nstron: " + fantasy.iloscStron + "\nrodzaj: " + fantasy.rodzaj);
        fantasy.osoba.przedstawSie();


        Kontakt test = new Kontakt("imie1", "nazwisko1", 3342, "test1@test.com");

    }
}
