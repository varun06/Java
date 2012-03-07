class Multadd{
	public static double multadd(double a, double b, double c){
		return ((a*b) + c);
	}
	public static double yikes(double x){
		double a = x;
		double b = Math.exp(-x);
		double c = Math.sqrt(1.0-b);
		double result = multadd(a,b,c);
		return result;
	}
	public static void main(String[] args) {
		System.out.println(multadd(3.0,2.0,3.0));
		System.out.println(yikes(5));
	}
}