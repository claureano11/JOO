import java.util.Scanner;

public class NumFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int numFactor;
		int factorial=1;
		System.out.print("Introduce un numero: ");
		numFactor=sc.nextInt();
		
		for(int i=1;i<=numFactor;i++){
			factorial=factorial*i;
		}
		//5!=1*2*3*4*5
		System.out.print(numFactor+"! es "+factorial);
		
		
	}

}
