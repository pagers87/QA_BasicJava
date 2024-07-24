//zarezerwowane miejsce w pamieci z określonym typem danych
public class Zmienne {
    String name = "Piotr";

    public static void main(String[] args) {
        int liczba1;
        int liczba2;
        int result;

        String name = "Piotr";
        liczba1 = 1;
        liczba2 = 2;
        result = liczba1 + liczba2;

        name = "Kasia";
        System.out.println(name);
        System.out.println(result);
    }
}
