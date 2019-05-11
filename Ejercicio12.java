package capitulo2;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Ingrese la velocidad : ");
	double v = input.nextDouble();
	System.out.print("Ingrese la aceleracion: ");
	double a = input.nextDouble();
	double length = Math.pow(v, 2) / (2 * a);
	System.out.println("La longitud mínima de la pista para el avión es : " + length);
    }
}
