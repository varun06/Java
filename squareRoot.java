class squareRoot{
	public static void main(String[] args) {
		System.out.println(findSquareRoot(36));
	}

	public static double findSquareRoot(double a){
		double initialGuess = a/2;
		double finalGuess = (initialGuess + (a/initialGuess))/2;
		while(Math.abs(finalGuess-initialGuess) > 0.0001){
			initialGuess = finalGuess;
			finalGuess = (initialGuess + (a/initialGuess))/2;
		}
	return finalGuess;
	}
}