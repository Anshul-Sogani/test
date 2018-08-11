//strings

import java.util.Scanner;

class a1 {


	void builder(String x){

			StringBuilder sb = new StringBuilder(x);

			sb = sb.append("sogani");

			sb= sb.replace(1,2,"Hello");
			sb= sb.delete(4,6);
			sb = sb.reverse();

			System.out.println(sb);


	}	



	
	public static void main(String a[]){

		String x = "anshul";

			Scanner sc = new Scanner(System.in);

		x=x.concat("sogani");

		x=x.toUpperCase();

		a1 st = new a1();

		String n =sc.next();

		st.builder(n); 
/*

		System.out.println(x);
		System.out.println(x.startsWith("A"));
		System.out.println(x.charAt(2));
		System.out.println(x.length());
		System.out.println(x.replace("A","AA"));
		System.out.println(x.substring(2,7));
*/


	}
}