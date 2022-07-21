import model.Citroen;
import model.Honda;
import model.Volkswagen;

import java.util.List;

public class main {
    public static void main(String[] args) {

        var civic = new Honda("Civic","Honda","150HP","Preto");
        var kiwid = new Citroen("Kiwid","Citroen","90HP","Branco");
        var gol = new Volkswagen("Gol","Volkswagen","100HP","Vermelho");

        var carros = List.of(civic,kiwid,gol);

        carros.forEach(System.out::println);

    }
}
