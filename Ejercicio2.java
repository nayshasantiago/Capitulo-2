package capitulo2;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
	final double PI = 3.14159265359;
        System.out.print("Ingrese el radio del cilindro: ");
	double Radio = input.nextDouble();
        System.out.print("Ingrese la altura del cilindro: ");
        double Altura = input.nextDouble();
        double Area = Radio* Radio * PI;
	double Volumen = Area * Altura;
	System.out.println("The area is " + Area);
	System.out.println("The volume is " + Volumen);  
    }  
}
