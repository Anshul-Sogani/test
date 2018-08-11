import java.util.Scanner;


class index{
			
	public static void main(String a[]){

		System.out.println("enter the values :  ");

		int b[] = new int[10];

		Scanner sc= new Scanner(System.in);

		for(int i = 0 ; i<b.length; i++){

			b[i] = sc.nextInt();
		}

		System.out.println("enter the number to check if present in array " );

		int z = sc.nextInt();

		for(int s = 0 ; s<b.length ; s++){

			if( z == b[s] ){

				System.out.print ( " index : " + s);
			}
		}



	}


}