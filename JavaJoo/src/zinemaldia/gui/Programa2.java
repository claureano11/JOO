package zinemaldia.gui;
import java.util.Scanner;

import zinemaldia.datos.Director;
//import zinemaldia.datos.Pelicula;

public class Programa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//String titulo;
		//Pelicula peli;
		Director director=new Director();
		System.out.print("Nombre Director: ");
		director.setNombre(sc.nextLine());
		//titulo=sc.nextLine();
		//peli=new Pelicula(titulo);
		System.out.print("Edad: ");
		director.setEdad(sc.nextInt());
		//problemas
		//peli.director=sc.nextLine();
		//System.out.print("Duracion");
		//peli.setDuracion(sc.nextInt());
		
		
	}

}
