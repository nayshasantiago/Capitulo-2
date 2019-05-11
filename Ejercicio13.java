/*Suponga que ahorra $ 100 cada mes en una cuenta de ahorros con la tasa de interés anual del 5%.
 * Por lo tanto, la tasa de interés mensual es 0.05 / 12 = 0.00417. Después del primer mes,
 * El valor en la cuenta se convierte en.
 *
 * 100 * (1 + 0.00417) = 100.417
 *
 * Después del segundo mes, el valor en la cuenta se convierte en
 *
 * (100 + 100.417) * (1 + 0.00417) = 201.252
 *
 * Después del tercer mes, el valor en la cuenta se convierte en
 *
 * (100 + 201.252) * (1 + 0.00417) = 302.507
 *
 * y así.
 *
 * Escriba un programa que indique al usuario que ingrese un monto de ahorro mensual y que se muestre
 * El valor de la cuenta después del sexto mes. (En el ejercicio 4.30, usarás un
 * bucle para simplificar el código y mostrar el valor de la cuenta para cualquier mes.)*/
package capitulo2;
import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el ahorro mensual : ");
        double Ahorro = input.nextDouble();
	double Total = Ahorro * (1 + 0.00417);
		Total = (Ahorro + Total) * (1 + 0.00417);
		Total = (Ahorro + Total) * (1 + 0.00417);
		Total = (Ahorro + Total) * (1 + 0.00417);
		Total = (Ahorro + Total) * (1 + 0.00417);
		Total = (Ahorro + Total) * (1 + 0.00417);
		Total *= 100;
		Total = (int) (Total) / 100.0;
        System.out.println("Dentro de seis meses la cuenta tendra $" + Total);
    }
}
