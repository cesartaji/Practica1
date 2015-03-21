package p1;
import java.util.Scanner;

public class tablas {

	public static void main(String[] args) {
		System.out.println("Ingrese un número");
		
		int x,num=0;
		Scanner s= new Scanner(System.in);
		x = s.nextInt();

		for(int i=10 ; i>=0 ; i--){
				System.out.println(x + " X " + i + " = " + (x*i) );
		}
	}

}
