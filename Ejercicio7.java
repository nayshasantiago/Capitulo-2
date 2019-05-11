package capitulo2;
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int Min = 60 * 24;
	int Año = Min* 365;
	System.out.println("Ingrese el número de minutos: ");
	int Minutos = input.nextInt();
	int Años = Minutos/ Año;
	int Año1 = Minutos % Año;
	int Dia = Año1 / Min;
	System.out.println(Minutos + " minutos es aproximadamente " + Años + " años y " + Dia + " díass.");
    } 
}
