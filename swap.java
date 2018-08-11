import java.util.Scanner;

class swap{

public static void main(String a[]){


System.out.print("enter the values for the ARRAY : ");
Scanner sc = new Scanner(System.in);

 int b [] = new int[10];

 for(int i = 0 ; i<b.length;i++){

 	b[i] = sc.nextInt();
 }

 System.out.print("enter the number to swap");

 int x = sc.nextInt();
 int y = sc.nextInt();

 for(int j = 0 ; j<b.length;j++){

 	if(b[j] == x ){

 		x = j ; 

 		System.out.print("value is at index" + j);


 	}

 	if(b[j] == y){

 		y = j;

 		System.out.print("value is at index " + j);
 	}
 }


int temp = 0 ; 

temp = b[x];
b[x] = b[y];
b[y] = temp;


System.out.println("values are swapped");


for(int i = 0 ; i<b.length;i++){

		System.out.print(b[i]);


}





}
	

}