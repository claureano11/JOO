import java.util.Scanner;

public class NumerosWhile {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		//pedir numero por consola
		//System.out.print("Introduce un numero: ");
		//int num=sc.nextInt();
		int cont=-1;
		int num=0;
		while(num>=0){
			cont++;
			System.out.print("Introduce un numero: ");
			num=sc.nextInt();
		}
		System.out.print("La cantidad de numeros positivos introducidos son: "+cont);
	}

}
