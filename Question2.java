import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the height and weight of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     

     //Prompt for height
    Scanner Height = new Scanner(System.in);
    System.out.println("Enter Height");
    double height = Height.nextDouble();
    

    //prompt for Weight
    Scanner Weight = new Scanner(System.in);
    System.out.println("Enter Weight");
    double weight = Weight.nextDouble();
    

    //print our height and weight
    System.out.println("The Height is "+ height + "m");
    System.out.println("The Weight is "+ weight + "KG");

    System.out.println("The bmi is " + (weight/(height*height)));
  }
}
