/**
 *@author Adrián Lima garcía
 *@version 1.0
 */

import java.util.Scanner;

/**
 * Clase Condicionales, Este programa le pide dos número al usuario y le dice si estos son iguales, o uno es mayor que otro
 */

public class condicionales{
    public static void main(String[] args){
	//Se le solicitan ambos valores al usuario
	Scanner sc = new Scanner(System.in);
	System.out.println("Ingrese un número: ");
	double uno = sc.nextDouble();
	System.out.println("Ingrese otro número: ");
	double dos = sc.nextDouble();

	// Si el primer número es mayor que el segundo, se imprime la siguiente lpinea.
	if (uno > dos){
	    System.out.println("El primer número que pusiste " + uno + " es el mayor");
	// Si son iguales se imprime la siguiente línea. 
	} else if (uno == dos){
	    System.out.println("Ambos números son iguales");
	// En caso contrario se imprime la siguiente línea.
	} else {
	    System.out.println("El segundo número que pusiste " + dos + " es el mayor");
	} 
    }
}
