package es.studium.ListaConAlumnos;

public class NodoLista
{
	String nom;
	int calif1;
	int calif2;
	int calif3;
	double media;

	public NodoLista(String n, int c1, int c2, int c3, double m)
	{
		nom = n;
		calif1 = c1;
		calif2 = c2;
		calif3 = c3;
		media = m;
	}

	public String mostrarNodo()
	{
		String resultado;
		resultado = "Nombre del alumno:" + this.nom + "\n";
		resultado += "Calificación 1:" + this.calif1 + "\n";
		resultado += "Calificación 2:" + this.calif2 + "\n";
		resultado += "Calificación 3:" + this.calif3 + "\n";
		resultado += "Media:" + this.media + "\n";
		return resultado;
	}
}
