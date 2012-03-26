public class Enigma{
	public static void enigma(int x){
		if(x == 0){
			return;
		}else{
			enigma(x/2); //recursively calling enigma
		}
		System.out.print(x%2);
	}
	public static void main(String[] args) {
		enigma(5);
		System.out.println("");
	}
}