class randomTest{
	public static int factorial(int n ){
		if(n >= 0){
			if (n == 0) { //if n = 0 return 1
			return 1;
			}
			else { //return the factorial value
			int recurse = factorial(n-1);
			int result = n * recurse;
			return result;
			}
		}else{
			System.out.println("The value of n should be greated than 0");
			return n; //should have a return value
		}
		
	}

	public static void main(String[] args) {

		System.out.println(factorial(0)); //Print the factorial of 10

	}
}