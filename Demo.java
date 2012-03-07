class Demo{
	public static boolean isTriangle(int a, int b, int c){
		if(a>(b+c) || b>(a+c) || c>(a+b)){
			return false;
		}else{
			return true;
		}
	}
	public static void main(String[] args) {
		System.out.println(isTriangle(3,2,5));	
	}
}