import java.util.*;

public class Gasmileage2{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

			int milesDriven = 0;
			int gallonsUsed = 0;
			int counter = 0;

		while(true){
			System.out.print("Enter miles driven: ");
			int miles = input.nextInt();

			if (miles < 1){
				break;
			}

			System.out.print("Enter amount of gallons used: ");
			int gallons = input.nextInt();

			double milesPerGallons = (double) miles / gallons;
			System.out.printf("Miles per gallon for this trip is: %.2f%n.", milesPerGallons);

			milesDriven += miles;
			gallonsUsed += gallons;
			counter ++;

			if(milesDriven > 0){
 				double average = (double) milesDriven / gallonsUsed;
				System.out.printf("The total miles driven is: %d%n.", milesDriven);
				System.out.printf("The total gallons used is: %d%n.", gallonsUsed);
				System.out.printf("The cummulative miles per gallons used is: %.2f%n.", average);
			}
			else {
				System.out.println("Invalid entry. Please enter the correct values!");
			}

		}
	}
}