import java.util.Scanner;

class array1{

	public static void main(String a[]){


		int b[] = new int[10]; 



		Scanner sc = new Scanner(System.in);



		System.out.println("enter the vlues : ");

		for(int i = 0 ; i < 10; i++){

		b[i] = sc.nextInt();

		}

		int max = 0;

		for(int i =0 ; i<b.length ; i++){

		if(b[i]>max){

			max = b[i];
		}
	}

	System.out.println("maximun is = " + max);


	max = max - 1;
	for(int q = 0 ; q <b.length;q++){

		if(b[q] == max ){

			max = b[q];
			System.out.println("2nd max value = "+ max );
		}
	}

		











	}







}