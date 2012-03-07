public class Ackerman{
	public static int ack(int m, int n){
		if (m == 0) {
			return n+1;
		}
		else if (m>0 && n == 0) {
			int result = ack(m-1,1);
			return result;
		}
		else {
			int result = ack(m-1,ack(m,n-1));
			return result;
		}
	}
	public static void main(String[] args) {
		int result = ack(3,4);
		System.out.println(result);
	}
}