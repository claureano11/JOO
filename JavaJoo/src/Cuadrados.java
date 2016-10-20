import java.util.Scanner;
public class Cuadrados{

	public static void main(String[] args){
		//definicion de la clase scanner
		Scanner sc= new Scanner(System.in);
		
		//pedir numero por consola
		System.out.print("Introduce un numero: ");
		int n=sc.nextInt();
		System.out.print("\n");
		//System.out.println((int)(Math.pow(2,3)));
		//declaracion de las variables
		int num=(int)(Math.pow(n,2));
		int cont=0;
		
		//dibujar el cuadrado con FOR
		for(int i=1;i<=num;i++){		
			System.out.print("* ");
			cont=cont+1;
				if(cont==n){
					System.out.print("\n");
					cont=0;
				}		
		}				
	}
}
