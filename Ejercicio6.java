/*Suma de los digitos de un entero*/
package capitulo2;
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número entre 0 y 1000:");
	int Numero = input.nextInt();
        int Suma = 0;
	do{
	Suma = Suma + (Numero % 10);
	Numero = Numero / 10;
        }
        while (Numero > 0 && Numero < 1000) ;
	System.out.println("La suma de dígitos es "+Suma );
    }
}