public class captaincrunch{
	public static String encode(String s, int n) {
                String converted = "";
                n = n%26; 
                int index = 0;
                
                while(index < s.length()) {
                        char curChar = s.charAt(index); 
                        if ('a' <= curChar && curChar <= 'z' ) {
                                int convertedChar = curChar + n;
                                if (convertedChar > 'z') {
                                        convertedChar = (convertedChar - 'z') + 'a' - 1;
                                } else if (convertedChar < 'a') {
                                        convertedChar = 'z' - ('a' - convertedChar) + 1;
                                }
                                converted = converted + (char)convertedChar;     
                        } else if ('A' <= curChar && curChar <= 'Z' ) {
                                int convertedChar = curChar + n;
                                if (convertedChar > 'Z') {
                                        convertedChar = (convertedChar - 'Z') + 'A' - 1;
                                } else if (convertedChar < 'A') {
                                        convertedChar = 'Z' - ('A' - convertedChar) + 1;
                                }
                                converted = converted + (char)convertedChar;
                        } else {
                                converted = converted + (char)curChar;
                        }               
                        index = index + 1;
                }
                return converted;
        }
        public static void main(String[] args) {
        	System.out.println(encode("Varun",13));
        	System.out.println(encode("Ineha",-13));
        }
}