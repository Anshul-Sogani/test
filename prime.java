 	//prime or not
	
	import java.util.Scanner;
	import java.lang.Math;

	class prime{

	boolean check(int x) {

		if (x == 2){
			return true;
		}
		if( x %2 ==0){
			return false;
		}
		
		int i = 3;

		while( i <= Math.pow(x, 0.5)){

			if(x % i == 0){
				return false;

				
			}

			i= i + 2;

		}

		return true;


	}



 	

 	public static void main(String z[]){

 	Scanner sc = new Scanner(System.in);
 	System.out.print("enter the number to check for prime number");
 	int b = sc.nextInt();

 	prime a = new prime();

 	boolean result = a.check(b);

 	System.out.println(result);


 	}


 	}