import java.util.Scanner;

public class SumaCantidaNumerosWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int suma=0;
		int cont=0;
		int num;
		
		do{
			System.out.print("Introduce un numero: ");
		    num=sc.nextInt();
		    suma=suma+num;
		    cont++;
		}while(num!=0);
		
		System.out.println("La cantidad de numeros introducidos son: "+(cont-1));
		System.out.print("La suma de los numeros introducidos son: "+suma);
	}

}
