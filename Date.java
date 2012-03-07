public class Date{
	public static void main(String[] args) {
		int date,year;
		String day,month;

		day = "Saturday";
		date = 18;
		month = "Febuary";
		year  = 2012;

		System.out.println("American Format: ");
		System.out.println(" " + day + "," + month +" " + date  + "," + year);

		System.out.println("European Format: ");
		System.out.println(" " + day + " " + date +" "+ month + "," + year);

	}
}