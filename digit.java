
import java.util.Scanner;

class digit{


	int check(int y){

		for(int i =1;y!=0;i++){

			y = y / 10 ;

			if (y == 0){

				return i;
			}


		}
		

return 0;


		}


	public static void main(String a[]){

	System.out.println("enter the number :");
	Scanner sc = new Scanner(System.in);
	digit d = new digit();
	int x = sc.nextInt();

	System.out.println(d.check(x));

	

	}

}
