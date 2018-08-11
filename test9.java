// rwo sum question

class test9{

	int a[] = {1,2,3,4,5,6,7,8};

	int t = 8 ;


boolean test() {
	boolean flag = false;

	for(int i = 0; i < a.length-1 ; i++)
	{

		for(int j = i+1; j<a.length;j++){

			if(t==a[i]+a[j]){
				flag = true;
				return flag;
					}


}

}
return flag;
}




boolean test1(){


	int low = 0;
	int high = a.length-1;

	while(high>=low){

		if(a[low] + a[high] == t){

			return true;

		}
		if(a[low] + a[high] > t){
			
			high--;
			
		}
		if(a[low] + a[high] < t){
			
			low++;
		}
	}

return false;



}





public static void main(String z[]){

	

	test9 obj = new test9();
	
	boolean twoSum = obj.test1();
	System.out.print(twoSum);
	
	}



}