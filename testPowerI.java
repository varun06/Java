class testPowerI{
	public static double testPower(double x, int n){
		while (n>1){
			x = x*x;
			n = n -1;
		}
		return x;
	}
	public static void main(String[] args) {
		System.out.println(testPower(10,2));
	}
}