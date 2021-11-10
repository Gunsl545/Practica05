/**
 *@author Adrián Lima García
 *@version 1.0
 */


/**
 *Clase primitivo, este programa informa al usuario de la cantidad de bytes que puede contener cada tipo primitivo de java
 * @see 
 */
public class Primitivo{
    public static void main(String[] args){
	System.out.println("****Tipos primitivos****");
	/**
	 * Las 8 lineas posteriores a este comentario se encargan de almacenar potencias de 2 que mas adelante me ayudan a saber la cantidad de bytes utilizados por cada primitivo
	 */
	byte n8 = 8;
	byte n16 = 16;
	byte n32 = 32;
	byte n64 = 64;
	byte By = (byte) Math.pow(2,7);
	short Sh =  (short) Math.pow(2,15);
	int In = (int) Math.pow(2,31);
	long Lo = (long) Math.pow(2,63);
	/**
	 * A continuación el programa imprime en la terminal 8 mensajes con la cantidad de bytes de cada primitivo, y un pequeño mensaje que explica que pueden almacenar esos primitivos.
	 */
	System.out.println("Byte: representa un tipo de dato de " + n8 + " bits, i.e. puede almacenar valores numeridos desde " + By + " hasta " + (-By-1));
	System.out.println("Short: representa un tipo de dato de " + n16 + " bits, i.e. puede almacenar valores numeridos desde " + Sh + " hasta " + (-Sh-1));
	System.out.println("int: representa un tipo de dato de " + n32 + " bits, i.e. puede almacenar valores numeridos desde " + -In + " hasta " + (In-1));
	System.out.println("long: representa un tipo de dato de " + n64 + " bits, i.e. puede almacenar valores numeridos desde " + -Lo + " hasta " + (+Lo-1));
	System.out.println("float: representa un tipo de dato de " + n32 + " bits, es un tipo de dato para almacenar números en coma flotante ");
	System.out.println("double: representa un tipo de dato de " + n64 + " bits, es un tipo de dato para almacenar números en coma flotante" );
	System.out.println("boolean: representa un tipo de dato de " + 1 + " bit, son aquellos que tienen un valor de true o false.");
	System.out.println("char: representa un tipo de dato de " + n16 + " bits, es un tipo de dato que representa a un carácter Unicode");	



    }
}
