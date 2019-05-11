/* aceleración media se define como el cambio de la velocidad
dividido por el tiempo necesario para hacer el cambio, como se muestra en la siguiente fórmula:
a = v1 - v0 t
Escriba un programa que indique al usuario que ingrese la velocidad de inicio v0 en metros /
segundo, la velocidad v1 que termina en metros / segundo, y el lapso de tiempo t en segundos,
y muestra la aceleración media.*/
package capitulo2;
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
    final Scanner input = new Scanner(System.in);
    System.out.print("Ingrese la velocidad inicial: ");
    double v0 = input.nextDouble();
    System.out.print("Ingrese la velocidad final: ");
    double v1 = input.nextDouble();
    System.out.print("Ingrese el tiempo: ");
    double t = input.nextDouble();
    double acceleration = (v1 - v0) / t;
    System.out.println("La aceleracion media es : " + acceleration);
    }  
}
