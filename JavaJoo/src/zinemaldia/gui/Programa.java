package zinemaldia.gui;
import java.util.Scanner;
import zinemaldia.datos.Pelicula;
public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pelicula peli= new Pelicula("Mascotas");
	
		Scanner sc=new Scanner(System.in);
		String titulo;
		Pelicula peli;
		//String director;
		System.out.print("Titulo: ");
		titulo=sc.nextLine();
		peli=new Pelicula(titulo);
		System.out.print("Director: ");
		peli.setDirector(sc.nextLine());
		//peli.getDirector();
		System.out.print("Duracion: ");
		peli.setDuracion(sc.nextInt());
	}

}
