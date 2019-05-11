/** Si conoce el saldo y la tasa de interés porcentual anual,
  puede calcular el interés en el próximo pago mensual mediante la siguiente fórmula
 interés = saldo * (tasa de interés anual / 1200)
  Escriba un programa que lea el saldo y la tasa de interés porcentual anual y
  Muestra el interés para el próximo mes.*/
package capitulo2;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Ejercicio20 {
 	public static void main(String[] args) {
	final Scanner input = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("0.00000");
	System.out.println("Ingrese el saldo y la tasa de interes (por ejemplo 3 por 3%): ");
	double Balance = input.nextDouble();
	double InteresAnualR = input.nextDouble();
	double interes = Balance * (InteresAnualR/ 1200);
	System.out.println("El interes es :" + df.format(interes));
        }    
}
