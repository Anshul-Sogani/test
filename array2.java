
import java.util.Scanner;

class array2{
	
public static void main(String a[]){

	
	int s2 = -1;
	int s3 = 0;

	int b[] = new int[] {11,212,3,13,2,4,5,67,8,9};


int s1 = b[0]  ; 


	for (int i = 0; i<b.length ; i++){

		if (b[i] < s1){
			s3 = s2;

			s2 = s1;

			s1 = b[i];
		}




	}

System.out.println("fianl  " + s1 + " " + s2 + " " + s3);	

}
}