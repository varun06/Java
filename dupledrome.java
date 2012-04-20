public class dupledrome{
	public static boolean isdupledrome(String s){
		int index = 0;
		int count = 0;
		while(index<s.length() -1){
			if(s.charAt(index) == s.charAt(index+1)){
				count += 1 ;
			}
		index = index + 2;
		}
		System.out.println(count);
		if (count == (s.length()/2)){
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println(isdupledrome("llammaa"));
	}
}