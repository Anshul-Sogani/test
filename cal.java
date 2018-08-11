import java.util.Scanner;


class cal{



	void add(int x,int y){

		
		int sum = 0;

		for(int i = x+1;i<y;i++){

			sum = sum + i; 
		}

		System.out.println(sum);
	}
	

	void mul(int x,int y){
		int z = x+1;
		int sum = 1;

		for(int i = z ;i<y;i++){

			sum = sum * i; 
		}

		System.out.println(sum);
	}




	public static void main(String a[]){

		Scanner sc = new Scanner(System.in);

		System.out.println("entrer the number phela: ");

		int x = sc.nextInt();

		System.out.println("enter the next number: ");

		int y = sc.nextInt();

		cal c = new cal();

		c.add(x,y);
		c.mul(x,y);



	}
}