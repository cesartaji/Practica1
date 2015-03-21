package p1;

import java.util.Scanner;

public class cuadrado {

	public static void main(String[] args) {
	System.out.println("Ingrese un número");
		
		int x,num=1;
		Scanner s= new Scanner(System.in);
		x = s.nextInt();
		
		for(int i=x ; i>0 ; i--){
		System.out.print("*" + " ");
		}
		
		System.out.println("");
		
		if(x>2){
			
			
		for(int i=x ; i>2 ; i--){
			System.out.print("*" + " ");
			for(int l=x ; l>2 ; l--)
				System.out.print("  ");
				System.out.print("*");
				System.out.println("");
	
		}
		
		
		}
		
		
		if(x>1)
		for(int i=x ; i>0 ; i--){
			System.out.print("*" + " ");
			}
	
	}
	
	
}
