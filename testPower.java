class testPower{
public static double power(double x, int n){
	if(n==0){
		return 1;
	}else{
	double result = x * power(x,(n-1));
	return result;
	}
}
public static void main(String[] args) {
	System.out.println(power(3,2));
}
}