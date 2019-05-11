/*Convertir libras a kilogramos*/
package capitulo2;
import java.util.Scanner;
public class Ejercicio4 {
        public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un valor en libras: ");
	double libras= input.nextDouble();
        double kilogramos = libras * 0.454 ;
        System.out.println(libras + " libras es " + kilogramos+ " kilogramos");
    }
}
    

