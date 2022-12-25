

/**
* Calculo de una ecuaci�n de 1er Grado
*
* @author Amparo Izquierdo
* @mail   amizba@gmail.com
* @url    https://empezandojava.blogspot.com/
*
*/
import java.util.Scanner;
public class Ecuacion1Grado {

	public static void main(String[] args) {
		
		System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Por favor, introduzca el valor de a: ");
		
		Double a = sc.nextDouble();
		
		System.out.print("Por favor, introduzca el valor de b: ");
		
		Double b = sc.nextDouble();
		
		if (a == 0) {
			
			System.out.println("Esa ecuaci�n no tiene soluci�n real.");
			
				} else {
					
				System.out.println("x = " + (-b/a));
				}
				}
				


	}


