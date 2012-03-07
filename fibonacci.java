public class fibonacci{
	public static int testFibonacci(int n){
		if (n == 0 || n == 1) {
			return 1;
		}else{
			return testFibonacci(n-1) + testFibonacci(n-2);
		}
	}
	public static void main(String[] args) {
		System.out.println(testFibonacci(5));
	}
}