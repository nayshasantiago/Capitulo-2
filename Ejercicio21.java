/*Escriba un programa que lea la cantidad de inversión, la tasa de interés anual y la cantidad de años,
 * y muestra el valor de la inversión futura mediante la siguiente fórmula:
 * futureInvestmentValue = investmentAmount x (1 + MonthlyInterestRate) ^ numberOfYears * 12
 */
package capitulo2;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("0.00");
	System.out.println("Ingrese la cantidad invertida: ");
	double investment_amount = input.nextDouble();
	System.out.println("Ingrese el porcentaje del interes anual: ");
        double annual_rate = input.nextDouble();
	double monthly_rate = (annual_rate) / (12 * 100);
	System.out.println("Ingrese el número de año: ");
	int year = input.nextInt();
	double value = investment_amount * (Math.pow((1 + monthly_rate), (year * 12)));
	System.out.println("El valor total es de $" + df.format(value));
    }
}
