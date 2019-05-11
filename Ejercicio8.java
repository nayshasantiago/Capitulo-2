/*ShowCurrentTime.java, proporciona un programa que muestra
La hora actual en GMT. Revisa el programa para que solicite al usuario que ingrese
la zona horaria se desplaza a GMT y muestra la hora en la zona horaria especificada. aquí*/
package capitulo2;
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);
		System.out.println("Ingrese la zona horaria de desplazamiento a GTM : ");
		int offset = input.nextInt();

		long TotalMiliSegundos = System.currentTimeMillis(); 

		long TotalSegundos=  TotalMiliSegundos/ 1000; 

		long SegundoActual= (int) (TotalSegundos % 60); 

		long TotalMinutos = TotalSegundos / 60; 

		long MinutoActual = (int) (TotalMinutos % 60);

		long TotalHoras = TotalMinutos / 60; 
		TotalHoras += offset;

		long HoraActual = (int) (TotalHoras % 24); 

		System.out.println("La hora actualmente es " + HoraActual + ":" + MinutoActual + ":" + SegundoActual);
	}
    
}
