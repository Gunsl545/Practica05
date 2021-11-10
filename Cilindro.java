/**
 *@author Adrián Lima García
 *@version 1.0
 */


/**
 *Clase Cilindro, este programa calcula tanto el área, como el volumen de un cilindro cuyo radio es de 10cm y altura de 20cm.
 * @see https://www.calculat.org/es/volumen-area/cilindro.html
 */
public class Cilindro{
    public static void main(String[] args){
	/**
	 * @param radio (Valor asignado al radio)
	 */
	byte radio = 10;
	/**
	 * @param altura (Valor asignado a la altura)
	 */
	byte altura = 20;
	/**
	 * @param pi (Valor aproximado de pi)
	 */
	double pi = 3.14159;
	/**
	 * @return el valor del area
	 */
	double Area = (2*pi*radio*altura) + (2*pi*radio*radio) ;
	/**
	 * @return el calor del volumen
	 */
	double Volumen = pi * radio * radio * altura;
	/**
	 * @return imprime un mensaje con los valores del área y volumen.
	 */
	System.out.println("****Área y volumen de un cilindro");
	System.out.println("El area del cilindro es: " + Area);
	System.out.println("El volumen del cilindro es: " + Volumen);

    }
}
