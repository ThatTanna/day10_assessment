package task02.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      double result = 0; // store value of last result. ALso be used for $last
  
      while (true) {
        System.out.print("Enter an operation (or 'exit' to quit): ");
        String input = sc.nextLine();
  
        if (input.equals("exit")) {
          System.out.println("Bye!");
          break; // exit loop if user enters 'exit'
        }
  
        // Split input into nums with space. \\s+ is space. + means any extra space.
        String[] nums = input.split("\\s+");
  
        // Check if input is in the correct format (two numbers + operator)
        if (nums.length != 3) {
          System.out.println("Invalid input. Please try again.");
          continue;
        }
  
        double num1 = 0; // first number
        if (nums[0].equals("$last")) {
          num1 = result; // use the value of last result if user enters '$last'
        } else {
          num1 = Double.parseDouble(nums[0]); // change to double.
        }
        double num2 = 0; // second number
        if (nums[2].equals("$last")) {
          num2 = result; // use the value of last result if user enters '$last'
        } else {
          num2 = Double.parseDouble(nums[2]); // change to double.
        }
        char operation = nums[1].charAt(0); // operator
  
        switch (operation) {
          case '+':
            result = num1 + num2;
            break;
          case '-':
            result = num1 - num2;
            break;
          case '*':
            result = num1 * num2;
            break;
          case '/':
            result = num1 / num2;
            break;
          default:
            System.out.println("Invalid operator");
            continue; // restart
        }
  
        System.out.println("Result: " + result);
      }
    }
}
