class getDigit{
	public static void main(String[] args) {
		printParity(17);
		printParity(16);
	}
	public static void printParity(int x){
		if(x%2 == 0){
			System.out.println("The number is even");
		}else{
			System.out.println("The number is odd");
		}
	}
	
}