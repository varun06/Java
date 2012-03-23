//method to count the number of "(" and ")" in a string
class getNumber{
	public static void getNumberS(String s){
		int len = s.length();

		int i = 0;
		int count = 0;

		while(i<len){
			char c = s.charAt(i);

			if(c == '('){
				count +=1;
			}else if(c == ')'){
				count -=1;
			}
			i = i + 1;
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		String s = "((3+7) * 2)";
		getNumberS(s);
	}
}