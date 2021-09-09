package ejercicio1_22;

import java.util.Scanner;

public class Ejercicio1_22 {

	/*- Realizar un programa Java, en el que se dan de alta alumnos de la escuela, y posteriormente mostrar sus datos.
	
	Preguntar cuántos alumnos matriculados hay y guardar esa cantidad.

	Según el número de alumnos matriculados, preguntar sus nombres y sus edades.

	Mostrar la información obtenida anteriormente: Nombre y edad de cada alumno

	Obtener la media de la edades de los alumnos

	Mostrar qué alumno es el que tiene mayor edad (mostrando el alumno y su edad)

	Mostrar qué alumno es el que tiene menor edad (mostrando el alumno y su edad)

	Obtener el alumno con el nombre más largo. */
	
	public static int cantidadAlum(Scanner entrada) {
		int cantidad=0;
			System.out.println("Cuantos alumnos matriculados hay?");
			cantidad=entrada.nextInt();
			
		return cantidad;
	}
	
	public static int[] edadAlum(int cantidad, Scanner entrada) {
		int edadAlumnos [] = new int[cantidad];
		for (int i=0;i<cantidad;i++) {
			System.out.println("Por favor introduzca la edad del alumno numero " + (i+1));
			edadAlumnos[i]=entrada.nextInt();
		}
		return edadAlumnos;
	}
	
	public static String [] nombreAlum(int cantidad, Scanner entrada) {
		String nombreAlumnos [] = new String [cantidad];
		for (int i=0;i<cantidad;i++) {
			System.out.println("Por favor introduzca el nombre del alumno numero " + (i+1));
			nombreAlumnos[i]=entrada.next();
		}
		return nombreAlumnos;
	}
	
	public static void mostrar (int[] edadAlu, String[] nombreAlu, int cantidad) {
		for(int i=0; i<cantidad;i++) {
			System.out.println("El alumno " + i  + " tiene " + edadAlu[i] + " y su nombre es " + nombreAlu[i] );
		}
	}
	
	public static int media(int[] edadAlu, int cantidad) {
		int media=0;
		for(int i=0;i<cantidad;i++) {
			media=media+edadAlu[i];
		}
		media=media/cantidad;
		System.out.println("La media de edad es "+ media);
		return media;
	}
	
	public static void mayorEdad(int media, int[] edadAlu, int cantidad, String [] nombreAlu ) {
		int mayor=0;
		String nombre="a";
		for (int i=0; i<cantidad; i++) {
			if (mayor<edadAlu[i]) {
				mayor=edadAlu[i];
				nombre= nombreAlu[i];
			}
		}
		System.out.println("El alumno mas mayor tiene " + mayor + " años y su nombre es " + nombre);
	}
	
	public static void menorEdad(int media, int[] edadAlu, int cantidad, String [] nombreAlu ) {
		int menor=100;
		String nombre="a";
		for (int i=0; i<cantidad; i++) {
			if (menor>edadAlu[i]) {
				menor=edadAlu[i];
				nombre= nombreAlu[i];
			}
		}
		System.out.println("El alumno mas joven tiene " + menor + " años y su nombre es " + nombre);
	}
	
	public static void nombreLargo(String [] nombreAlu, int cantidad) {
		int masLargo=100; 
		String nombre = "a";
		for (int i=0; i<cantidad; i++) {
			if (masLargo>nombreAlu[i].length()) {
				nombre = nombreAlu[i];
			}
		}
		System.out.println("El nombre mas largo es: " + nombre);
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int cant, med;
		int edad [];
		String nombre [];
		cant=cantidadAlum(entrada);
		edad=edadAlum(cant, entrada);
		nombre=nombreAlum(cant, entrada);
		mostrar(edad, nombre, cant);
		med=media(edad, cant);
		mayorEdad(med, edad, cant, nombre);
		menorEdad(med, edad, cant, nombre);
		nombreLargo(nombre, cant);
		entrada.close();
	}

}
