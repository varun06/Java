class XCopy{
	public static void main(String[] args) {
		int orig = 42; // primitive type
		XCopy x = new XCopy(); //create an object
		int y = x.go(orig); //assign the return value
		System.out.println(orig + " " + y);
	}

	int go(int arg){ //method declaration and method
		arg = arg * 2; // is returning int value
		return arg;
	}
}