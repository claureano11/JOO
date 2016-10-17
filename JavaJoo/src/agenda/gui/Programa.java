package agenda.gui;

import java.util.Scanner;

import agenda.datos.Amigo;

public class Programa {

	public static void main(String[] args) {
		//declaracion del scanner
		Scanner sc=new Scanner(System.in);
		
		//declaracion de variables
		String nombre;
		
		//crear el objeto amigo de la clase "Amigos"
		Amigo amigo;
		
		//pedir por consola
		System.out.print("Introduce un nombre: ");
		nombre=sc.nextLine();
		//amigo=new Amigo();
		amigo=new Amigo(nombre);
		System.out.print("Introduce un email: ");
		amigo.setEmail(sc.nextLine());
		System.out.print("Introduce un telefono: ");
		amigo.setTelefono(sc.nextLine());

		System.out.print("El amigo "+amigo.getNombre()+" tiene el email "+amigo.getEmail()+" y su telefono "+amigo.getTelefono());
		
	}

}
