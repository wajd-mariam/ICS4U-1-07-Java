/*
* Copyright (c) 2020
*
* This program asks user to enter the length and width, and it calculates 
* the height so that the result is exactly 1 board foot, which is 
* 144 inches^3
*
* @author  Wajd Mariam
* @version 1.0
* @since   2020/11/29
*/

// Imports Java Classes:
import java.util.Scanner;

public class Board {
  /**
   * This function calculates the height of 1 board foot
   * and returns it to the main function.
   */
  static float boardFoot(float length, float width) {
    
    // Declaring variables and constants:
    final int Volume = 144;
    float height = 0;
    
    // Calculating the height of 1 board foot using the given length and width:
    height = (Volume / (length * width));
    
    
    // Returning height:
    return height;
  }

  /**
  * This function gets input from the user,
  * and displays output.
  */
  public static void main(String[] args) {
    
    // Declaring used variables:

    float length = 0;
    float width = 0;
    float number = 0;
    
    // Try Catch statement:
    try {
      // User Input:
      // Length Input:
      Scanner input1 = new Scanner(System.in);
      System.out.println("Enter length: ");
      length = input1.nextInt();
      System.out.println("");
      // Width Input:
      Scanner input2 = new Scanner(System.in);
      System.out.println("Enter width: ");
      width = input2.nextInt();
      System.out.println("");
  
      // Process
      // Checking if input received isn't 0:
      if ((length == 0) || (width == 0)) {
        System.out.println("You can't have a length or width of 0 inches");
      } else {
        // Calling BoardFoot Function:
        number = boardFoot(length, width);
        // Output
        System.out.println("The height of 1 board foot with the given dimensions is "
                          + number + " inches");
      }
  
    // Error Output:
    } catch (Exception e) {
      System.out.println();
      System.out.println("An error occurred");
    } 
  }
}