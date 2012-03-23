class iFactorial{
	public static long factorial(long n){
		int product = 1;
  		for ( int j=1; j<=n; j++ ){
  			product *= j;

  		}
    return product;	
	}
	public static void main(String[] args) {
		System.out.println(factorial(20));
	}
}