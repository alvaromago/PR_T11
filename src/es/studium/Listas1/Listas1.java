package es.studium.Listas1;

import java.util.ArrayList;
import java.util.Iterator;

public class Listas1
{
	public static void main(String[] args)
	{
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Andrea");
		lista.add("Amaya");
		lista.add("Julio");
		Iterator<String> iter = lista.iterator(); // Creamos iterador para la lista
		while (iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}
}
