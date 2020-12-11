import java.util.Scanner;

public class monthgenerator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("MONTH GENERATOR");
		System.out.println("---------------");
		System.out.println();
		
		System.out.print("Enter a year: ");
		int year  = input.nextInt();
		
		boolean leap_year = leap(year);
		
	}
	
	public static boolean leap(int year) {
		if(year%4 != 0) {
			return false;
		}else if(year%100 != 0) {
			return true;
		}else if(year%400 != 0) {
			return false;
		}else {
			return true;
		}
	}

}
