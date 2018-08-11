// print all the number present in both the arrays

import java.util.Scanner;

class array3{

public static void main(String a[]){

Scanner sc = new Scanner(System.in);

int b[] = new int[10];
int c[] = new int[10];



System.out.println("enter the values for the 1nd arary");

for(int i=0;i<b.length;i++)
{
		b[i] = sc.nextInt();

}

System.out.println("enter the values for the 2nd arary");

for(int i=0;i<c.length;i++)
{
		c[i] = sc.nextInt();

}

System.out.println("the common elements in the arrays are: ");

for(int j=0;j<b.length;j++)
{
for(int k=0;k<c.length;k++){

	if (b[j] == c[k]){

		System.out.println(c[k]);
	}

}
}


}
	

}