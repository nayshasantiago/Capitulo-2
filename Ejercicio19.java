/*Escribe un programa que solicite al usuario que ingrese
  tres puntos (x1, y1), (x2, y2), (x3, y3) de un triángulo y muestra su área.
  La fórmula para calcular el área de un triángulo es
  s = (side1 + side2 + side3) / 2;
  área = raíz ((s - lado1) (s - lado2) (s - lado3))
 */
package capitulo2;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("0.0");
        System.out.print("Ingrese el primer punto del triángulo: ");
	double x1 = input.nextDouble();
	double y1 = input.nextDouble();
        System.out.print("Ingrese el segundo punto del triángulo: ");
        double x2 = input.nextDouble();
	double y2 = input.nextDouble();
        System.out.print("Ingrese el tercer punto del triángulo: ");
        double x3 = input.nextDouble();
	double y3 = input.nextDouble();
	double area = Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2d);
	System.out.print("El área del triángulo es : " + df.format(area));
	}
}
