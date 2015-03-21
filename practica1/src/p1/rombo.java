package p1;

public class rombo {

	public static void main(String[] args) {
		for(int i=1 ; i<=5 ; i++){
			for(int es=5-i; es>0;es--)
				System.out.print(" ");
			for(int p=1; p<2*i;p++)
				System.out.print("*");
				System.out.println("");
		}
		for(int i=4 ; i>=0 ; i--){
			for(int esp=i; esp<5;esp++)
				System.out.print(" ");
			for(int l=i*2 ; l >1 ; l--)
				System.out.print("*");
				System.out.println("");
		
		}
	}
}
