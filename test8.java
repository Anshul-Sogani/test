class test8{
	
	public static void main (String z[]){

		int t = 1;
		int temp = 0;
		for(int j= 1; j<=100; j++){

			if ( j % 2 == 0 ){

				temp = temp + j;
			}



		}





		for(int i = 1 ; i <= 20 ; i++){

			if (i % 2 != 0){

				t=t*i;
			}

			


		}


System.out.println("===" + t);
System.out.println("===" + temp);
	}
}