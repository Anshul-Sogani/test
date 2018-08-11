// bubble sort

import java.util.Scanner;

class bubble{

	 


	  void set(int[] z){
	 	Scanner sc = new Scanner(System.in);

		for(int i=0 ; i<z.length;i++){

			z[i] = sc.nextInt();
		}

	
	}

	 void get(int[] z){

		for(int j =0 ;j<z.length;j++){
			System.out.println(z[j]);
		}
	}



	int b_sort(int[] z){

		int temp = 0;
		

		for(int j =0 ; j<z.length; j++){

				int flag = 0;
				

		for(int i =0 ;i<z.length-j-1;i++){

			if(z[i]>z[i+1]){



				temp = z[i];
				z[i] = z[i+1];
				z[i+1] = temp;

				flag++;

				} 


			}

				if(flag==0){

					return 0;
				}

		}			

		return 0;

		}




		void selection(int[] z){

			int temp = 0;



		for(int i = 0 ; i<z.length;i++){

			int min = z[i];
			int minindex = i;

				for(int j =i ; j<z.length;j++){

					if(z[j]<min){

						min = z[j];
						minindex = j;

					}
					if(min<z[i]){

					temp = z[i];
					z[i] = z[minindex];
					z[minindex]=temp;
				}
				}

		




		}
			}



	void insertion(int[] z){

		int i , j ,k, temp,key;

		for( i = 1 ; i<z.length;i++){

			 key = z[i];
			 j = i - 1 ;

			 while (j>=0 && key<z[j]){

			 	temp = z[j] ;
			 	z[j] = z[j+1];
			 	z[j+1]=temp;

			 	

			 	j--;
			 }


		}





	} 


	void sort(int[] z,int left , int right) {

		if(left < right ){

			int middle = (left + right)/ 2 ;

				// devide futthr

			sort(z,left,middle);
			sort(z,middle+1,right);

			//merge halves
			merge(z,left,middle,right);
		}






	}
	
	void merge(int[] z,int left,int middle,int right){

	
			int n1 = middle - left +1;

			int n2 = right - middle ;


			//create temp ARRAYS

				int x [] = new int [n1];
				int y [] = new int [n2];

			//insert the values in the arrays:

				for(int i = 0 ;i<n1 ;i++ ) {

					x[i] = z[left+i];


				}


				for(int j = 0 ;j<n2;j++ ){

					y[j] = z[middle+1+j];
				}


				for(int i = 0 ;i<x.length ;i++ ) {

					System.out.println("left"+x[i]);
				}


				for(int i = 0 ;i<y.length ;i++ ) {

					System.out.println("right"+y[i]);
				}

System.out.println();

					//merger the temp array:

				int i = 0 ; int j = 0;

				//initialise the index of the merged subarray

				int k = left ;

				while( i < n1 && j < n2){

					if(x[i]<=y[j]){

						z[k] = x[i];

						i++; 
					}else{

						z[k] = y[j];
						j++; 
					}

						k++;

				}


					while(i<n1){
						z[k] = x[i];
						i++;
						k++;
					}

					while(j<n2){
						z[k]= y[j];
						k++;
						j++;
					}
				

	}

	




	public static void main(String a[]){

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the number of elements in the array");

		 int n = sc.nextInt();


		int z[] = new int[n];

		bubble b = new bubble();
		System.out.println("enter the elements");
		b.set(z);
		
		System.out.println("Sorted Array is :");
		/* b.b_sort(z);
		 b.get(z);

		b.selection(z);
		b.get(z);*/
			
 
		b.sort(z,0,z.length-1);
		b.get(z);


	
	}
}