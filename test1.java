// to print 
// for 

class test1{
	
	public static void main (String a[]){

		for ( int i = 1 ;  i<=6 ; i ++ ){

				for(int j=1 ; j <= i ; j++ ){

					System.out.print(j);

				}

				for(int k=6;k>i;k--){
					System.out.print("*");
				}

				System.out.println();



		}

	}

}