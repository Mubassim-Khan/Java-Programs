package Examples;

import java.util.Scanner;

// Exception Handling Example 1
/*
public class ExceptionHandling {
    public static void main(String[] args) {
        int num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st Number (Dividend): ");
        num1 = scanner.nextInt();

        System.out.print("Enter 2nd Number (Divisor): ");
        num2 = scanner.nextInt();
        scanner.close();

        try {
            int result = num1 / num2;
            System.out.print("Quotient: " + result);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Divisor should not be Zero, else it\s \"INFINITY\".");
            System.out.println("ERROR: " + e);
        }
    }
}
*/

// Example 2
class Example{
    public static void main(String args[]){
       try{
          int arr[]=new int[7];
          arr[10]=10/5;
          System.out.println("Last Statement of try block");
       }
       catch(ArithmeticException e){
          System.out.println("You should not divide a number by zero");
       }
       catch(ArrayIndexOutOfBoundsException e){
          System.out.println("Accessing array elements outside of the limit");
       }
       catch(Exception e){
        System.out.println("Some Other Exception");
     }
       System.out.println("Out of the try-catch block");
    }
 }
