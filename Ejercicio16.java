/* Escribe un programa que le pida al usuario que ingrese
El lado de un hexágono y muestra su área. La fórmula para calcular la
área de un hexágono es: área = (3 * v3 / 2) * s ^ 2
donde s es la longitud de un lado.*/
package capitulo2;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Ejercicio16 {
	public static void main(String[] args) {
	final Scanner input = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("0.0000");
	System.out.print("Ingrese el lado del hexagono : ");
	double lado = input.nextDouble();
        double area = ((3 * Math.sqrt(3)) / 2) * Math.pow(lado , 2);
	System.out.println("El area del hexagono es :" + df.format(area));
	}
}
