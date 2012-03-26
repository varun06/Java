class reverseDigit{
	public static void main(String[] args) {
		reversedigit(81);
	}
	public static void reversedigit(int n){
		int lastDigit = n%10;
		int firstDigit = n/10;
		System.out.print(lastDigit);
		System.out.println(firstDigit);
	}
}