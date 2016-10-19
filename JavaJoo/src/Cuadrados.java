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
		int cont=0;
		for(int i=1;i<=n;i++){	
			System.out.print("*");
			cont++;
		}	
			if(cont==n){
				for(int x=1;x<=n;x++){
				System.out.print("*");
				}
			
			}			
	}

}
