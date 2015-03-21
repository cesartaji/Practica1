package p1;
import java.util.Scanner;

public class piramide {

	public static void main(String[] args) {
		System.out.println("Ingrese un número");
		
		int x,num=1;
		Scanner s= new Scanner(System.in);
		x = s.nextInt();
		
		for(int i=x ; i>=0 ; i--){
			for(int esp=i; esp<x;esp++)
				System.out.print(" ");
			for(int l=i ; l >=1 ; l--)
				System.out.print(num + " " );
				System.out.println("");
				num++;
	}
	}
}
