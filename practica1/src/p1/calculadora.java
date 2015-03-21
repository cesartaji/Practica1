package p1;
import java.util.Scanner;

public class calculadora {
	public static void main(String[] args) {
		System.out.println("Ingrese 2 numeros");
		System.out.println("");
	
		double num1, num2;
		Scanner s= new Scanner(System.in);
		num1 = s.nextDouble();
		num2 = s.nextDouble();
		
		System.out.println("");
		System.out.println("Ingrese la operacion que desea seleccionar");

		String operacion;
		Scanner o= new Scanner(System.in);
		operacion = s.next();
		
		if(operacion.equals("s")){
	
			System.out.println("El valor de la suma es " + (num2+num1) );
		
		} else if(operacion.equals("r")){
			System.out.println("El valor de la resta es " + (num1-num2) );
			
		}  else if(operacion.equals("m")){
			System.out.println("El valor de la multiplicacion es " + (num2*num1) );
			
		}	else if(operacion.equals("d")){
			System.out.println("El valor de la dvision es " + (num1/num2) );
		}
	}
}
