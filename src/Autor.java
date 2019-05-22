public class Autor {
    String imie;
    String nazwisko;


    public Autor(String imie, String nazwisko)
    {
        this.imie=imie;
        this.nazwisko=nazwisko;
    }

    void przedstawSie()
    {
        System.out.println("Autor: " + imie +" "+ nazwisko);
    }

}
