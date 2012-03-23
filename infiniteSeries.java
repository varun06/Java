class infiniteSeries{
	public static double testPower(double x, int n){
		double xout = 1;
		for(int i = 0;i<n;i++){
			xout = xout*x;
		}
		return xout;
	}

	public static double factorial(long n){
		int product = 1;
  		for ( int j=1; j<=n; j++ ){
  			product *= j;

  		}
    return product;	
	}

	public static double myexp(int x){
		double value = 0;
		for(int i = 0; i<=10;i++){
			// System.out.println(factorial(i));
			// System.out.println(testPower(x,i));
			value += testPower(x,i)/factorial(i);			
		}
	return value;
	}
	public static void main(String[] args) {
		System.out.println(myexp(3));
		System.out.println(Math.exp(3));
	}
}