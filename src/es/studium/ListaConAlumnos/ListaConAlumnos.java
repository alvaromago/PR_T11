package es.studium.ListaConAlumnos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ListaConAlumnos
{
	public static void main(String args[])
	{
		Scanner leer = new Scanner(System.in);
		int op;
		String nombre;
		int calif1, calif2, calif3;
		double media;
		// Creamos la lista donde guardaremos los nodos
		ArrayList<NodoLista> lista1 = new ArrayList<NodoLista>();
		do
		{
			// Vamos preguntando los datos...
			System.out.println("Ingrese el nombre del alumno:");
			nombre = leer.nextLine();
			System.out.println("Ingrese la primera calificación:");
			calif1 = leer.nextInt();
			System.out.println("Ingrese la segunda calificación:");
			calif2 = leer.nextInt();
			System.out.println("Ingrese la tercera calificación:");
			calif3 = leer.nextInt();
			// Calculamos la media
			media = calcularMedia(calif1, calif2, calif3);
			// Metemos los datos en un Nodo y éste en la lista
			lista1.add(new NodoLista(nombre, calif1, calif2, calif3, media));
			System.out.println("¿Desea ingresar otro alumno?");
			System.out.println("1.-Si\t 2.-No");
			op = leer.nextInt();
			leer.nextLine(); // Resetear Buffer teclado
		} while (op != 2);
		// Creamos una segunda lista con los datos de la primera
		ArrayList<NodoLista> lista2 = new ArrayList<NodoLista>(lista1);
		// Creamos el iterador para recorrer la lista
		Iterator<NodoLista> it = lista2.iterator();
		// Recorremos la lista con el iterador
		while (it.hasNext())
		{
			System.out.println(it.next().mostrarNodo() + "");
		}
		leer.close();
	}

	private static double calcularMedia(int calif1, int calif2, int calif3)
	{
		int suma;
		double media;
		suma = calif1 + calif2 + calif3;
		// Calcular la media
		media = (double) suma / 3.0;
		// Redondear a 2 decimales
		media = Math.rint(media * 100) / 100;
		return media;
	}
}