import java.util.Scanner;
/**
 *
 * @ Gavin Sandhar 
 */
public class Main {
  public static double firstDigit(int number){
    int division = number / 10;
    while(number > 9){
     number = number / 10;
    } System.out.println(number);
    return number;
   } 
  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create scanner for user input
    Scanner input = new Scanner(System.in);

    // ask user to enter a number
    System.out.println("Please enter a number");
    int number = input.nextInt();

    firstDigit(number);

  
    
  }
}
