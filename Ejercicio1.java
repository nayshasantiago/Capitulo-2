/*Convertir celsius a farenheit*/
package capitulo2;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Ingrese una temperatura en Celsius: ");
    double celsius = input.nextDouble();
    double fahrenheit = 9.0 / 5 * celsius + 32;        
    System.out.println(celsius + " Celsius es " + fahrenheit + " Fahrenheit"); 
    }  
}
