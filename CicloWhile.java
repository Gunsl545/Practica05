/**
 *@author Adrián Lima garcía
 *@version 1.0
 */


import java.util.Scanner;

/**
 * Clase CicloWhile, Este programa se encarga de pedirle al usuario un número entero positivo, y le regresa todos los números primos anteriores a el.
 */

public class CicloWhile{
    public static void main(String[] args){
   	// El programa le solicita al usuario que digite un número entero positiv
	Scanner sc = new Scanner(System.in);
	System.out.println("Escribe un número entero positivo: ");
	long primo = sc.nextLong();

	
	/**
	 * @param primo1, define un valor booleano.
	 */
	boolean primo1 = true;


	//Si el número ingresado es mayor a cero, el programa sigue
	if(primo > 0){
	    //sí el número ingresado es mayor a 1
	    if(primo != 1){
		// se define la variable i con valor de 2
		long i = 2;
		// mientras primo sea mayor o igual a i
		while(i <= primo ){
		    primo1 = true;
		    // se define la variable j con valor de 2
		    long j = 2;
		    // mientras j sea menor que i el programa sigue
		    while(j < i){
			// si el cociente entre i/j tiene como residuo 0 el programa acaba y continua el siguiente número
			if(i % j == 0){
			    primo1 = false;
			    break;
			    
			    
			}
			// j aumenta 1
			j++;
		    }
		    // si el número llega aquí se imprime en la consola
		    if(primo1){
			System.out.println(i + "Es primo");
		    }
		    // i aumenta 1
		    i++;
		}
	    // sí el número ingresado es 1, el programa imprime el siguiente mensale	
	    } else{
		System.out.println("El 1 no es primo :c");
	    }
	// si el número ingresado es menor a cero, el programa imprime el siguiente mensaje y termina.
	} else{
	    System.out.println("Que paso? habiamos quedado que pondrias un entero positivo");
	}
    }
}
