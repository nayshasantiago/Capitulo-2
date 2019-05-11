/*Escriba un programa que calcule la energía necesaria para calentar el agua desde una temperatura inicial hasta una temperatura final.
 * Su programa debe indicar al usuario que ingrese la cantidad de agua en kilogramos y la inicial y
 * Temperaturas finales del agua.
 * La fórmula para calcular la energía es
 * Q = M * (temperatura final - temperatura inicial) * 4184
 * donde M es el peso del agua en kilogramos, las temperaturas están en grados Celsius y la energía Q se mide en julios.
 **/
package capitulo2;
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
    final Scanner input = new Scanner(System.in);
    System.out.print("Ingrese la cantidad de agua en Kilogramos: ");
    double kilograms = input.nextDouble();
    System.out.print("Ingrese la temperatura inicial : ");
    double temp1 = input.nextDouble();
    System.out.print("Ingrese la temperatura final : ");
    double temp2 = input.nextDouble();
    double q = kilograms * (temp2 - temp1) * 4184;
    System.out.println("La energia necesaria es : " + q);
    }
}
