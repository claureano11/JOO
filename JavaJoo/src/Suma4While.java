import java.util.Scanner;

public class Suma4While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int suma=0;
		int cont=0;
		int num;
		
		while(cont<4){
			System.out.print("Introduce un numero: ");
			    num=sc.nextInt();
			    suma=suma+num;
			cont++;
		}	
		System.out.print("La suma de los numeros es: "+suma);
	}
}
