/**
 *@author Adrián Lima garcía
 *@version 1.0
 */

import java.util.Scanner;

/**
 * Clase CicloFor, Este programa se encarga de pedirle al usuario un número entero positivo, y le regresa todos los números primos anteriores a el.
 */

public class CicloFor{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	// El programa le solicita al usuario que digite un número entero positivo
	System.out.println("Escribe un número entero positivo:");
	long primo = sc.nextLong();

	/**
	 * @param primo1, define un valor booleano.
	 */
	boolean primo1 = true;

	// a-1 si el número es por fuerza un entero positivo, pasa a las siguientes lineas de código.
	if (primo > 0){
	    // b-1 Sí el número es mayor a 1, pasa a las siguientes líneas.
	    if(primo != 1){
		/** Crea una variable i que comieza en 2, si el número que ingresa el usuario es mayor o igual a i 
		 *  entonces las siguientes líneas se ejecutan y el valor de i aumenta 1
		 */
		for(long i = 2; i <= primo; i++){
		    primo1 = true;
		    // Crea una varible j que comienza en 2, si j es menor que i, se ejecutan las siguientes lineas y j aumenta 1
		    for(long j = 2; j < i; j++){
			// si i/j tiene como residuo a 0, la variable primo1 se vuelve falsa y se intenta con el siguiente valor de i
			if (i % j == 0){
			    primo1 = false;
			    break;
			}
		    // cada número que llegue hasta aquí sera impreso por el programa. 
		    }
		    if(primo1){
			System.out.println(i + " Es primo");
		    }
		}
	    // b-2 Sí el número es 1, imprime el siguiente mensaje.
	    } else{
		System.out.println("El 1 no es primo :c");
	    }
	 // a-2 Le comunica al usuario que el número ingresado no es un entero positiva, y finaliza el programa.
	} else{
	    System.out.println("Que paso? haniamos quedado que pondrias un entero positivo");
	} 
    }
}
