import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Lista de nomes
        List<String> nomes = Arrays.asList(
                "Ana",
                "Bruno",
                "Carlos",
                "Amanda",
                "Beatriz"
        );

        // Implementação da interface usando Lambda
        FiltroNome filtro = nome -> nome.startsWith("A");

        System.out.println("Nomes que começam com a letra A:");

        nomes.stream()
                .filter(filtro::testar)
                .forEach(System.out::println);
    }
}