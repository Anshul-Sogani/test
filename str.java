
import java.util.Scanner;

class str1{

void rep(String x){

	String b =  x.replace(" " , ", " );
			

		System.out.println(b);
}


void rev(String y){

	StringBuilder sb = new StringBuilder();

	sb.append(y);

	sb=sb.reverse();




}






	
	public static void main(String z[]){

		System.out.println("enter the string: ");
		

		Scanner sc = new Scanner(System.in);

		String a = sc.nextLine();

		str1 s = new str1();

		s.rep(a);

		s.rev(a);
		
		


	}
}