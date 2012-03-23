class taylor2{
	private static final int NUM_TERMS = 18; //CONSTANT VALUE

	public static double exp(double x){
		return exp(x,NUM_TERMS);
	}

	public static double exp(double x, int n){
		return eval(getExpCoeffs(n),x);
	}

	private static double [] getExpCoeffs(int n){
		double [] p = new double[n];
		p[0] = 1.0;

		for (int i = 1;i<n ;++i ) {
			p[i] = p[i-1]/i;
		}
		return p;
	}

	private static double eval(double [] p,double x){
		double result = 0.0;
		for (int i = p.length-1;i>0 ;--i ) {
			result = p[i] + (result*x);
		}
		System.out.println(result);
		return result;
	}
	public static void main(String[] args) {
		System.out.println(exp(3));
		System.out.println(Math.exp(3));
	}
}
