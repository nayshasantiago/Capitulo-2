/*Escribe un programa que solicite al usuario que ingrese dos puntos (x1, y1) y (x2, y2) y
 * Muestra su distancia entre ellos. La fórmula para calcular la distancia es
 * raíz ((x2 - x1) ^ 2 + (y2 - y1) ^ 2)
 * Tenga en cuenta que puede usar Math.pow (a, 0.5) para calcular 2a.*/
package capitulo2;
import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String args[]) {
	Scanner input = new Scanner(System.in);
	System.out.print("Ingrese el valor de  x1 y y1: ");
	double x1 = input.nextDouble();
	double y1 = input.nextDouble();
	System.out.print("Ingrese el valor de x2 y y2: ");
	double x2 = input.nextDouble();
	double y2 = input.nextDouble();		
        double Distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("La distancia entre dos puntos es " + Distancia);
	}
    
    
}
