import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePower = Integer.parseInt(scanner.nextLine()); // n
        int pokeTargetDistance = Integer.parseInt(scanner.nextLine()); // m
        int exhaustionFactor = Integer.parseInt(scanner.nextLine()); // y

        int pokedTargets = 0;
        int beginningPower = pokePower;
        while ( pokePower >= pokeTargetDistance ) {

            pokePower -= pokeTargetDistance;
            pokedTargets++;

            if (pokePower == beginningPower * 0.5) {
                if (exhaustionFactor > 0) {
                    pokePower /= exhaustionFactor;
                }
            }
        }
        System.out.println(pokePower);
        System.out.println(pokedTargets);
    }
}
