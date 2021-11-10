/**
 *@author Adrián Lima garcía
 *@version 1.0
 */

import java.util.Scanner;


/**
 *Clase Bisiesto, Este programa se encarga de pedirle al usuario un número, y con el decirle al usuario si se trata de un año bisiesto.
 */
public class Bisiesto{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	// Con Scanner, el programa le solicita al usuario un núumero.
	System.out.println("Ingresa un año: ");
	int year = sc.nextInt();

	// a-1 Se divide el número entre 4 y en caso de que su reciduo sea 0 se pasa a la siguiente línea.
	if (year % 4 == 0){
	    // b-1 Se divide el número entre 100 y en caso de tener residuo 0 se pasa a la siguiente línea.
	    if (year % 100 == 0){
		// c-1 Se divide entre 400 y si el residuo es 0 pasa a la siguiente línea e imprime el mensaje.
		if (year % 400 == 0){
		    System.out.println("Ya se armo, este si es bisiesto c:");
		// c-2 Si el residuo es distinto de 0 al dividir entre 400, se imprime el siguiente mensaje.
		} else System.out.println("Hijole, este no es bisiesto :");
	    // b-2 Si el residuo es distinto de 0 al dividir entre 100, se imprime el siguiente mensaje.
	    } else System.out.println("Ya se armo, este si es bisiesto c:");
	// a-2 Si el residuo es distinto de 0 al dividir entre 4, se imprime el siguiente mensaje.
	} else{
	    System.out.println("Hijole, este no es bisiesto :c");
	} 
    }
}
