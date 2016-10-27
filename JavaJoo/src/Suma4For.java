import java.util.Scanner;

public class Suma4For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int suma=0;

		for(int i=0;i<=3;i++){
			System.out.print("Introduce un numero: ");
			int num=sc.nextInt();
			suma=suma+num;
		}
		
		System.out.print("La suma de los numeros es: "+suma);
	}

}
