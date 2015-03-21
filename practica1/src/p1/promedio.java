package p1;
import java.util.Scanner;

public class promedio {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		int num6 = 0;
		int pro = 0;
		System.out.println(" Ingrese 6 notas");
		Scanner s= new Scanner(System.in);
		num1 = s.nextInt();
		num2 = s.nextInt();
		num3 = s.nextInt();
		num4 = s.nextInt();
		num5 = s.nextInt();
		num6 = s.nextInt();
		
		pro = (num1 + num2 + num3 + num4 + num5 + num6)/6;
		if(pro>=0 && pro<=59){
			System.out.println("Nota Puntuación ");
			System.out.println( pro + "        E ");
		
		} else if (pro>=60 && pro<=69){
			System.out.println("Nota Puntuación ");
			System.out.println( pro + "        D ");

		} else if (pro>=70 && pro<=79){
			System.out.println("Nota Puntuación ");
			System.out.println( pro + "        C ");
			
		} else if (pro>=80 && pro<=89){
			System.out.println("Nota Puntuación ");
			System.out.println( pro + "        B ");
			
		} else if (pro>=90 && pro<=100){
			System.out.println("Nota Puntuación ");
			System.out.println( pro + "        A ");
}
	}

}
