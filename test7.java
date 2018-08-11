// do while loop
import java.util.Scanner;

class test7{
	
	public static void main (String z[]){

		int  t = 1 , k = 1;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		int i = sc.nextInt();
 
		System.out.println("Enter the power");
		int j = sc.nextInt();

		

		while (k<=j){

			t=t*i 	;

			k++;

		}

		System.out.println(t);

	}
}