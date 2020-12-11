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
		
		System.out.println("Select a month: ");
		System.out.println("-----------------------------");
		System.out.println("[1] JANUARY     [7] JULY");
		System.out.println("[2] FEBRUARY    [8] AUGUST");
		System.out.println("[3] MARCH       [9] SEPTEMBER");
		System.out.println("[4] APRIL       [10] OCTOBER");
		System.out.println("[5] MAY         [11] NOVEMBER");
		System.out.println("[6] JUNE        [7] DECEMBER");
		
		System.out.print("   -Enter your choice: ");
		int month = input.nextInt();
		
		System.out.println("Select a day: ");
		System.out.println("-----------------------------");
		System.out.println("[1] SUNDAY     [5] THURSDAY");
		System.out.println("[2] MONDAY     [6] FRIDAY");
		System.out.println("[3] TUESDAY    [7] SATURDAY");
		System.out.println("[4] WEDNESDAY");
		
		System.out.print("   -Enter your choice: ");
		int day = input.nextInt();
		
		
		
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
