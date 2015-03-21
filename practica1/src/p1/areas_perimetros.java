package p1;
import java.util.Scanner;

public class areas_perimetros {
	public static void main(String[] args) {
		System.out.println("C: Area y perimetro de un circulo");
		System.out.println("U: Area y perimetro de un cuadrado");
		System.out.println("T: Area y perimetro de un triangulo");
		System.out.println("");
		System.out.println("Ingrese la letra de la operacion que desea realizar");
	
		String x;
		Scanner s= new Scanner(System.in);
		x = s.next();
	
		if(x.equals("c")){
			System.out.println("");
			System.out.println("ingrese el valor del radio");

			double num1, num2, num3;
			Scanner a= new Scanner(System.in);
			num1 = a.nextDouble();
			num2 = num1*num1*Math.PI;
			num3 = 2*Math.PI*num1;
			System.out.println("El valor del area es de " + num2 + " unidades cuadradas");
			System.out.println("El valor del perimetro es de " + num3 + " unidades");
		
		} else if(x.equals("u")){
			System.out.println("");
			System.out.println("ingrese el valor de un lado");

			double num1, num2, num3;
			Scanner a= new Scanner(System.in);
			num1 = a.nextDouble();
			num2 = num1*num1;
			num3 = 4*num1;
			System.out.println("El valor del area es de " + num2 + " unidades cuadradas");
			System.out.println("El valor del perimetro es de " + num3 + " unidades");
			
		}  else if(x.equals("t")){
			System.out.println("");
			System.out.println("ingrese el valor de un lado");

			double num1, num2, num3, num4;
			Scanner a= new Scanner(System.in);
			num1 = a.nextDouble();
			num2 = (Math.sqrt(3)/4)*num1*num1;
			num3 = 3*num1;
			num4 = (Math.sqrt(3)/2)*num1;
			System.out.println("El valor del area es de " + num2 + " unidades cuadradas");
			System.out.println("El valor del perimetro es de " + num3 + " unidades");
			System.out.println("El valor de la altura es de " + num4 + " unidades");
		}
	}
		
		
	
}
