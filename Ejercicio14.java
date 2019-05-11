/* El índice de masa corporal (IMC) es una medida de la salud en el peso.
 * Se puede calcular tomando su peso en kilogramos y dividiendo por el cuadrado de su altura en metros.
 * Escriba un programa que indique al usuario que ingrese un peso en libras y altura en pulgadas y muestre el IMC.
 * Tenga en cuenta que una libra es 0.45359237 kilogramos y una pulgada es 0.0254 metros.
 */
package capitulo2;
import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Ingrese el peso en libras: ");
    double weight_pounds = input.nextDouble();
    System.out.println("Ingrese la altura en pulgadas: ");
    double height_inches = input.nextDouble();
    double weight = weight_pounds * 0.45359237;
    double height = height_inches * 0.0254;
    double BMI = (weight / (height * height));
    System.out.println("El indice de masa corporal es: " + BMI);
    }
}
