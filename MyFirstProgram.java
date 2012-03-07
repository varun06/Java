import java.io.*;
class MyFirstProgram {
	static BufferedReader keyboard = new BufferedReader (new InputStreamReader(System.in));
	static PrintWriter screen = new PrintWriter(System.out,true);
public static void main(String[] args) throws IOException
{
String name;
screen.print("Please enter your name; ");
screen.flush();
name = keyboard.readLine();

screen.print("\n\n Hello " + name);
screen.println(" - Welcome to Programming with Java \n\n");
}
}
