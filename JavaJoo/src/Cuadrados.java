import java.util.Scanner;

public class Cuadrados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
	
		int n;
		System.out.print("Introduce un numero: ");
		n=sc.nextInt();
		
		
		/*
		CRUD
		for(int i=1;i<=64;i++){
			suma=suma+num;
			num=num*2;
		}*/
		int num=n*n;
		int cont=0;
		
		for(int i=1;i<=num;i++){	
			System.out.print("*");
			cont++;
			if(cont<=n){
				cont=0;
				System.out.print("*");
			}		
		}	
				
	}

}
