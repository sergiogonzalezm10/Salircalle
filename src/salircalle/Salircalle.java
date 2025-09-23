package salircalle;

import java.util.Scanner;

public class Salircalle {

	public static void main(String[] args) {
		
		boolean llueve;
		boolean tareasFinalizadas;
		boolean irBiblioteca;
		boolean puedeSalir;
		
		  Scanner sc = new Scanner(System.in);

	        System.out.print("¿Está lloviendo?: ");
	        llueve = sc.nextBoolean();  // Aquí el usuario escribe true o false

	        System.out.print("¿Has terminado tus tareas?: ");
	        tareasFinalizadas = sc.nextBoolean();

	        System.out.print("¿Necesitas ir a la biblioteca?): ");
	        irBiblioteca = sc.nextBoolean();

	         puedeSalir = (!llueve && tareasFinalizadas) || irBiblioteca;

	        System.out.println("¿Puedes salir a la calle? " + puedeSalir);

	        sc.close();
	    }
	}