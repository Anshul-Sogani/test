import java.util.Scanner;

class array{
	
public static void main(String z[]){

	int a[] = new int[10];
	int b[] = new int[10];
	int c[] = new int[20]; 

	Scanner sc = new Scanner(System.in);

	for(int i = 0 ; i < 10; i++ ){

		a[i] = sc.nextInt();

	}


	System.out.print("kiedvhv");

	for(int i = 0 ; i < 10; i++ ){

		b[i] = sc.nextInt();

	}


/*for (int j = 0;j<10;j++){

	System.out.println(j +" " +a[j]);
*/


for(int j = 0 ; j<10 ; j++){

	 c[2*j] = a[j];
	 c[2*j+1] = b[j];

}

for(int k = 0 ; k<20 ; k++){

	System.out.println(c[k]);
}



}






}