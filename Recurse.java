class Recurse{
// first: returns the first character of the given String
public static char first(String s) {
return s.charAt(0);
}
// last: returns a new String that contains all but the
// first letter of the given String
public static String rest(String s) {
return s.substring(1, s.length());
}
// length: returns the length of the given String
public static int length(String s) {
return s.length();
}
public static void printString(String s){
	for (int i = 0;i<s.length();i++) {
		System.out.println(s.charAt(i));
	}
}
public static void printBackward(String s){
	for (int i = 4;i>=0;i--) {
		System.out.println(s.charAt(i));
	}
}
public static void reverseString(String s){
	String str = new StringBuffer(s).reverse().toString();
	System.out.println(str);
}
public static void main(String[] args) {
	// public static String stringValue = "Varun";
	// System.out.println(first(stringValue));
	// System.out.println(rest(stringValue));
	// System.out.println(length(stringValue));
	// printString(stringValue);
	// printBackward(stringValue);
	reverseString("Varun");
}
}