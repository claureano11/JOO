package zinemaldi.gui;

import java.util.Scanner;

import zinemaldi.datos.Pelicula;

public class Programa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String titulo;
		Pelicula peli;
		System.out.print("Titulo");
		titulo=sc.nextLine();
		peli=new Pelicula(titulo);
		System.out.print("Director");
		//problem
		peli.director=sc.nextLine();
		System.out.print("Duracion");
		peli.setDuracion(sc.nextInt());
		
		
	}

}
