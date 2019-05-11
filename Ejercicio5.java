/*(Aplicación financiera: calcular consejos) Escriba un programa que lea el subtotal
y la tasa de propinas, luego calcula la propina y el total. Por ejemplo, si el
el usuario ingresa 10 para el subtotal y 15% para la tasa de propina, el programa muestra $ 1.5
Como propina y $ 11.5 como total. */
package capitulo2;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Ingrese el subtotal: ");
    int Subtotal = input.nextInt();
    System.out.println("Ingrese la tasa de propina: ");
    int TasaPropina = input.nextInt();
    double Propina = (Subtotal * TasaPropina * 1.0) / 100; 
    double Total = Subtotal + Propina;
    System.out.println("La propina es $" + Propina + " y el total " + Total);
   } 
}
