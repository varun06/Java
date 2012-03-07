public class printTable{
	public static void main(String[] args) {
		printMultTables(9);
	}
	public static void printMultTables(int high){
		int i = 1;
		while(i<=high){
			printMultiples(i,i);
			i++;
		}
	}
	public static void printMultiples(int n,int high){
		int i = 1;
		while(i<=high){
			System.out.print(n*i + "   ");
			i++;
		}
		System.out.println("");
	}
}