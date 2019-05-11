package capitulo2;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Ingrese un valor en pies: ");
	double feet = input.nextDouble();
        double meters = feet * 0.305;
    System.out.println(feet + " pies es " + meters + " metros");
    } 
}
