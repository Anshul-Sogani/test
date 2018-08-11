import java.util.Scanner;

class swapchr{
	
	public static void main(String a[]){


		Scanner sc = new Scanner(System.in);

		char b[] = new char[5];
		char c[] = new char[5];
		char d[] = new char[5];

		for(int i = 0 ; i<b.length;i++){

			b[i] = sc.next().charAt(0);
		}


			for(int j = 0 ; j<b.length;j++){

			c[j] = sc.next().charAt(0);
		}


			for(int k = 0 ; k < b.length;k++){

					d[k] = b[k];
					b[k] = c[k];
					c[k] = d[k];


			}


			for(int q= 0 ;q<b.length;q++){
				System.out.print(b[q]);
				// System.out.println(b[q]+"   changed :)   " + c[q]);
			}

	}
}