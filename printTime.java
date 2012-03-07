class printTime{
	public static void printAmerican(String day, int date, String month, int year){
		System.out.println("American Time: ");
		System.out.print(day);
		System.out.print(",");
		System.out.print(" ");
		System.out.print(month);
		System.out.print(" ");
		System.out.print(date);
		System.out.print(",");
		System.out.print(" ");
		System.out.println(year);
	}
	public static void printEuropean(String day, int date, String month, int year){
		//For European format
		System.out.println("European Time: ");
		System.out.print(day);
		System.out.print(" ");
		System.out.print(date);
		System.out.print(" ");
		System.out.print(month);
		System.out.print(",");
		System.out.print(" ");
		System.out.println(year);
	}

	public static void main(String[] args){
		String day = "Sunday";
		int date = 19;
		String month = "Febuary";
		int year = 2012;
		printAmerican(day,date,month,year);
		printEuropean(day,date,month,year);
	}
	
}