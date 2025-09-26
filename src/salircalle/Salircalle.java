package salircalle;

import java.util.Scanner;

public class Salircalle {

	public static void main(String[] args) {
		
		boolean llueve;					//Variable boolean para devolver true o false para si llueve o no
		boolean tareasFinalizadas;		//Variable boolean para devolver true o false para si tareas finalizadas o no
		boolean irBiblioteca;			//Variable boolean para devolver true o false para si hay que ir a la biblioteca o no
		boolean puedeSalir;				//Variable boolean para devolver true o false para si se puede salir o no
		
		  Scanner sc = new Scanner(System.in);		

	        System.out.print("¿Está lloviendo?: ");			
	        llueve = sc.nextBoolean();  

	        System.out.print("¿Has terminado tus tareas?: ");
	        tareasFinalizadas = sc.nextBoolean();

	        System.out.print("¿Necesitas ir a la biblioteca?): ");
	        irBiblioteca = sc.nextBoolean();

	         puedeSalir = (!llueve && tareasFinalizadas) || irBiblioteca;		//Utilizamos y jugamos con NOT , AND y OR para solucionar el problema.

	        System.out.println("¿Puedes salir a la calle? " + (puedeSalir? "Si" : "No"));	

	        sc.close();
	    }
	}