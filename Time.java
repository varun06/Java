public class Time{
	public static void main(String[] args) {
		float hour = 7f;
		int minute = 25;
		int second = 40;

		System.out.println(((hour*60)+minute)*60 + second);
		System.out.println((hour/24)*100);
	}
}