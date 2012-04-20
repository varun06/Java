public class Test1{
	static int x = 5; //define a global variable
	public static void main(String[] args) {
		while(x>1){ //loop for x
			int x = 1; //define local variable
			x -= 1;
			while(x<10){
				x += 1;
				if(x<=3){
					if(x>3){
						System.out.println("small x"); //print the value
						System.out.println("big x"); //print the value
					}
					
				}
			}
			
		}
	}
}