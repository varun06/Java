class printLetterB{
	public static void printLetter(String s){
		int index = s.length()-1;
		while(index>=0){
			char letter = s.charAt(index);
			System.out.print(letter);
			index--;
		}
	}

	public static void countLetters(String s){
		int length = s.length();
		int count = 0;

		int index = 0;
		while(index<length){
			if(s.charAt(index) == 'a'){
				count += 1;
			}
			index += 1;
		}
		System.out.println(count);
	}

	public static void countLetters2(String s){
		int length = s.length();
		int count = 0;

		int index = 0;
		while(index<length){
			count = s.indexOf('a',index);
			index += 1;
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		String s = "Varuna";
		printLetter(s);
		countLetters(s);
		countLetters2(s);
	}
}