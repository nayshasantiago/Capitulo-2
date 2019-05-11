/*Temperatura del viento */
package capitulo2;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Ejercicio17 {
	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00000");
		System.out.print("Ingrese la temperatura en  Fahrenheit  entre -58°F y 41°F: ");
		double ta = input.nextDouble();
		System.out.print("Ingrese la velocidad del viento (>=2) en millas por hora : ");
		double v = input.nextDouble();

		double windChill = 35.74 + (0.6215 * ta) - (35.75 * Math.pow(v, 0.16)) + (0.4275 * ta * Math.pow(v, 0.16));

		System.out.println("El indice de sensacion termica es : " + df.format(windChill));
	}
}
