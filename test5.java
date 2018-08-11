// loops

import java.util.Scanner;

class test5 {
	public static void main(String a[]){

		Scanner sc = new Scanner(System.in);

			
		int x = sc.nextInt();
		 int y = sc.nextInt();

		 if (x <=0 || y <= 0){
		 	System.out.println("Enter a valid number for making a square");

		 }

		 else{



		for(int i=1;i<=x;i++){

			for(int j=1;j<=y;j++){

				System.out.print("B");

			}
			System.out.println();

		}

	}
	
	}
}