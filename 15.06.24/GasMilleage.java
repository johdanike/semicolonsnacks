import java.util.*;

public class GasMilleage{
  public static void main(String[]args){

    Scanner input = new Scanner(System.in);

    int milesDriven = 0;
    int gallonUsed = 0;
    int counter = 0; 

    while(true){

      System.out.printf("Enter miles driven or -1 to exit: %n");
      int miles = input.nextInt();

      if (miles <= 0){
      break;
      }

      System.out.printf("Enter amount of gallons used: %n");
      int gallon = input.nextInt();

      double milesPerGallon = (double) miles / gallon;
      System.out.printf("Miles per gallons used is %.2f%n ", milesPerGallon);

       milesDriven += miles;
       gallonUsed += gallon;
       counter ++;
      
    if (counter > 0){
     double average = milesDriven / gallonUsed;

     System.out.printf("The total miles driven is %d%n", milesDriven);
     System.out.printf("The total gallons used is %d%n", gallonUsed);
     System.out.printf("The total miles per gallons used is %.2f%n", average);
    }
    else{
     System.out.print("Please enter trips entry!");
    }

    }

      

  }
}