import java.util.Scanner;

public class monthgenerator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int month = 0, day  = 0, year = 0;
		
		System.out.println("MONTH GENERATOR");
		System.out.println("---------------");
		System.out.println();
		
		while(true) {
			System.out.print("Enter a year: ");
			year  = input.nextInt();
			
			if(year<=0) {
				System.out.println("Not a valid year");
			}else {
				break;
			}
		}
		
		
		System.out.println("Select a month: ");
		System.out.println("-----------------------------");
		System.out.println("[1] JANUARY     [7] JULY");
		System.out.println("[2] FEBRUARY    [8] AUGUST");
		System.out.println("[3] MARCH       [9] SEPTEMBER");
		System.out.println("[4] APRIL       [10] OCTOBER");
		System.out.println("[5] MAY         [11] NOVEMBER");
		System.out.println("[6] JUNE        [7] DECEMBER");
		
		while(true){
			System.out.print("   -Enter your choice: ");
			month = input.nextInt();
			
			if(month < 1 || month > 12) {
				System.out.println("Option only ranges from 1 - 12");
			}else {
				break;
			}
		}
		
		
		System.out.println("Select a day: ");
		System.out.println("-----------------------------");
		System.out.println("[1] SUNDAY     [5] THURSDAY");
		System.out.println("[2] MONDAY     [6] FRIDAY");
		System.out.println("[3] TUESDAY    [7] SATURDAY");
		System.out.println("[4] WEDNESDAY");
		
		while(true) {
			System.out.print("   -Enter your choice: ");
			day = input.nextInt();
			
			if(day<1 || day>7) {
				System.out.println("Option only ranges from 1 - 7");
			}else {
				break;
			}
		}
		
		if(leap(year) && month == 2) {
			
		}
		
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
