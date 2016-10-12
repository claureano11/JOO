package zubiri.gui;

import java.util.Scanner;

import zubiri.model.Alumno;

public class Programa {

	public static void main(String[] args) {
		//definir scanner
		Scanner sc=new Scanner(System.in);
		
		//declaracion de variables
		//String nombre;
		//String asignatura;
		//double nota;
		
		//crear un objeto alumno
		Alumno alumno=new Alumno();
		
		// pedir los datos del usuario por consola
		System.out.print("Introduce alumno: ");
		//nombre=sc.nextLine();
		alumno.setNombre(sc.nextLine());
		
		System.out.print("Introduce una asignatura: ");
		//asignatura=sc.nextLine();
		alumno.setAsignatura(sc.nextLine());
		
		System.out.print("Introduce una nota: ");
		//nota=sc.nextDouble();
		alumno.setNota(sc.nextDouble());
	
		//asignarle los datos introducidos por usuario
		
		//alumno.setNombre(nombre);
		//alumno.setAsignatura(asignatura);
		//alumno.setNota(nota);
		
		//mostrar resultado
		System.out.print(alumno.getNombre()+" estas "+alumno.getCalificacion()+" en "+alumno.getAsignatura());
	}

}