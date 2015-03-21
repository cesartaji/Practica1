package p1;
import java.util.Scanner;
public class primos {

	public static void main(String[] args) {
		System.out.println(" Ingrese un número");
		Scanner s= new Scanner(System.in);
		int primo;
		primo = s.nextInt();
		
		System.out.println("Los numeros primos de " + primo +" son");
		System.out.println("1");
		
		for(int i=1; i<=primo; i++){
			int contador = 0;
			
		for ( int j=1; j<=i; j++){
					if (i%j==0)
					contador++;				
			}
			if(contador==2)
				System.out.println(i);
		}
	}

}
