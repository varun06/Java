import java.io.*;
class Radius {
	static BufferedReader keyBoard = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter screen = new PrintWriter(System.out,true);

	public static void main(String[] args) throws IOException {
		//data declaration
		float radius;
		float circumference;
		float area;

		//prompt and input radius
		System.out.print("input Radius");
		radius = new Float(keyBoard.readLine()).floatValue();

		//Calculate cirumference and area

		circumference = 2.0f * (float) Math.PI * radius;
		area = (float) Math.PI * radius * radius;

		//display values

		System.out.println("Radius: " + radius);
		System.out.println("circumference: " + circumference);
		System.out.println("Area: " + area);
	}
}