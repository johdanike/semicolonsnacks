import java.util.Scanner;

public class PrimeNumEvaluator{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number: ");
		int number = input.nextInt();

		if(number % 2 != 0 && number / 2 != 0 )System.out.printf("%n%d is a Prime number", number);
		else System.out.printf("%n%d is not a Prime Number", number);


	}
}