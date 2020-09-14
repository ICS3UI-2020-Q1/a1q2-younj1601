import java.util.Scanner;
/**
 * This program asks the user for 2 intergers then gives you the quotient and remainder of the 2
 * @author Jackosn
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //Create a scanner for user input
    Scanner input = new Scanner(System.in);

    //ask the user for 2 intergers
    System.out.println("Please enter in two integers, on seperate lines, to divide.");
    
    //declare and initialize the variable for interger 1
    int numOne = input.nextInt();

    //declare and initialize the variable for interger 2
    int numTwo = input.nextInt();

    //declare and calculate the quotient
    int quotient = numOne / numTwo;

    //declare and calculate the remainder
    int remainder = numOne % numTwo;

    //tell the user the quotient and remainder
    System.out.println(numOne + "/" + numTwo + " is " + quotient + " with a remainder of " + remainder);

  }
}
