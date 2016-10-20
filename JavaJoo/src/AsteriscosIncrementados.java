import java.util.Scanner;

public class AsteriscosIncrementados {

	public static void main(String[] args) {
		//definicion de la clase scanner
				Scanner sc= new Scanner(System.in);
						
				//pedir numero por consola
				System.out.print("Introduce un numero: ");
				int numCar=sc.nextInt();
				System.out.print("\n");
				
				//StringBuffer texto;
				int cont=0;
				String car="*";
				
				for(int i=1;i<=numCar;i++){
					cont++;
					for(int fila=1;fila<=cont;fila++){
						
						System.out.print(car);
					}
					System.out.print("\n");
				}

	}

}
