//find the largest prime

import java.util.Scanner;

class largestprime{


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


	void find(int x){
		int max = 0;

		for(int i = 1 ; i<= x; i++){

			if(check(i)==true){

				System.out.println(i);

				if(max<i){
					max=i;
				}
			}

			

		}


System.out.println("largestprime is "+max);


	}




	

	public static void main (String a[]){

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the number : ");

		int i = sc.nextInt();

		largestprime p = new largestprime();

		p.find(i);



	}


















}