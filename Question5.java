import java.util.Scanner;
import java.util.Arrays;
public class Question5
{
  
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner integer = new Scanner(System.in);
    Scanner ListIntegers = new Scanner(System.in);
    
    
    while(true)
    {
      System.out.println("Please enter an integer");
      int NumberOfIntegers = integer.nextInt();
      System.out.println("now please enter "+ NumberOfIntegers + "Integers");
      int[] list = new int[NumberOfIntegers];
      while (NumberOfIntegers>0)
      {
        int NewInt = ListIntegers.nextInt();
        list[NumberOfIntegers-1] = NewInt;
        NumberOfIntegers -= 1;
        
      }

      int element = 0;
      int count = 0;

      for (int j = 0 ; j< list.length ; j++){
        int tempElement = list[j];
        int tempCount = 0;
        for(int p = 0; p<list.length; p++){
          if(list[p] == tempElement){
            tempCount++;
          }
          if(tempCount>count){
            element = tempElement;
            count= tempCount;
          }
        }
        
      }
      
      System.out.println("The mode is " + element);

      
    }
    


  }
}
