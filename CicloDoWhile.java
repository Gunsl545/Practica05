/**
 *@author Adrián Lima garcía
 *@version 1.0
 */

import java.util.Scanner;


/**
 * Clase CicloDoWhile, Este programa se encarga de pedirle al usuario un número entero positivo, y le regresa todos los números primos anteriores a el.
 */

public class CicloDoWhile{
    public static void main(String[] args){
	// El programa le solicita al usuario que digite un número entero positivo
	Scanner sc = new Scanner(System.in);
	System.out.println("Escribe un número entero positivo: ");
	long primo = sc.nextLong();

	/**
	 * @param primo1, define un valor booleano.
	 */
	boolean primo1 = true;


	// si el número ingresado es mayor a cero
	if(primo > 0){
	    // si el primo es distinto de 1 el programa continua
	    if(primo != 1){
		// se crea la variable i que comienza en 2
		long i = 2;
		// se crea la variable j que comienza en 3
		long j=3;

		do{
		    do{
			// si i/j tiene como residuo 0, el programa termina
			if(i % j == 0){
			    primo1 = false;
			    break;
			    
			    
			}
			// j aumenta 1
			j++;
		    // si j es menor que i
		    } while(j < i);
		    if(primo1){
			// los números que lleguen aquí se imprimen en el siguiente mensaje.
			System.out.println(i + " Es primo");
		    }
		    // i aumenta 1
		    i++;
		    j=2;
		    primo1=true;

		} while(i <= primo);

	       
	    // Sí el número es 1 imprime el siguiente mensaje y acaba el número.
	    } else System.out.println("El 1 no es primo :c");


	// Sí el número es menor o igual a cero imprime el siguiente texto y el programa termina.
	} else System.out.println("Que paso? habiamos quedado que pondrias un entero positivo");
    }
}
