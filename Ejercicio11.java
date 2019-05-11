package capitulo2;
import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int starting_pop = 312032486;
	int seconds_year = 365 * 24 * 60 * 60;
	int birthsPerYear = seconds_year / 7;
	int deathsPerYear = seconds_year / 13;
	int immigrantsPerYear = seconds_year / 45;
        System.out.print("Ingrese número de años: ");
	int years = input.nextInt();
        int population = starting_pop + years * (birthsPerYear + immigrantsPerYear - deathsPerYear);
        System.out.print("La poblacion en " + years + " años es de " + population +" personas");
    }
}
