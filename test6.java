import java.util.Scanner;

class test6{
	public static void main (String z[]){

	int i=2,max=0,min=0;

	Scanner sc = new Scanner(System.in);

	System.out.println("enter the numbers for comparation");

	int a = sc.nextInt();
	max = a ;
	min = a;

	System.out.println("num 1 = " + a );

	while(i<=10) {

		int b = sc.nextInt();

		System.out.print("num"+ i+ " = " + b );

		if(b>max){
			max = b;
		}

		if(b<min){
			min = b;
		}

	i++;
	}

	System.out.println("the max value is  "+ max + "min value is  "+ min );




	}
}