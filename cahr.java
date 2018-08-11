//char array



import java.util.Scanner;

class cahr{
	


	public static void main(String z[]){

	int count = 0;

	Scanner s = new Scanner(System.in);

	char a[] = new char[10];

	for(int i=0; i<a.length; i++ ){
		a[i] = s.next().charAt(0);

	}


	for (int j=0;j<a.length;j++){

/*		a[j] = Character.toLowerCase(a);
		System.out.println("Char ARRAY");*/
		/*System.out.print(a[j]);*/

		if(a[j] == 'a'|| a[j] =='e'|| a[j] == 'i'|| a[j] == 'o'|| a[j] == 'u'){

			System.out.println(a[j]);

			count++;



		}

		

	}
	

System.out.print("number of vowels: " + count);


	}
}