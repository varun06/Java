import java.util.Scanner;

public class Palindrome{
	public static char first(String s){
		return s.charAt(0);
	}

	public static char last(String s){
		int length = s.length();
		return s.charAt(length - 1);
	}

	public static String middle(String s){
		int length = s.length();
		return s.substring(1,length - 1);
	}

	public static boolean isPalindrome(String s)
    {
        if(s.length() == 0 || s.length() == 1)
            return true;//if length =0 OR 1 then it is 
        if(first(s) == last(s))//check for first and last char of String, if they are same then do the same thing for a substring with first and last char removed. and carry on this until you string completes or condition fails
            return isPalindrome(middle(s)); //if its not the case than string is not.
        return false;
    }

    public static boolean isPalindromeIter(String s){
    	int length = s.length(); //get the length of the string
    	int mid = length/2; // get the middle point of the string
    	if(length == 0 || length == 1) //return if the string is empty or 1 chracter
    		return true;
    	for(int i = 0; i < mid; i++){
    		if (s.charAt(i) != s.charAt(length-i-1)){ //iterate and return if the characters are not matching
    			return false;
    		}
        }
    return true;
    }

    public static boolean isPalindromewhile(String s) {
    	int left  = 0;                 // index of leftmost unchecked char
    	int right = s.length() -1;  // index of the rightmost

    	while (left < right) {         // continue until they reach center
    		if (s.charAt(left) != s.charAt(right)) {
    			return false;          // if chars are different, finished
    		}
    		left++;                    // move left index toward the center
    		right--;                   // move right index toward the center
    	}
    return true;                   // if finished, all chars were same
	}

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	String word = scan.nextLine();
	System.out.println(isPalindromeIter("word"));
	System.out.println(isPalindromewhile("word"));
	}
}