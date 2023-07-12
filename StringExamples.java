package Examples;
import java.util.Arrays;
import java.util.Scanner;
// JAVA String vs NEW String
/*
public class StringExamples {
    public static void main(String[] args) {
        String s1= "This is a String";
        String s2= "This is a String";

        String s3 = new String("This is a String");
        String s4 = new String("This is a String");

        if (s1 == s2) {
            System.out.println("Both JAVA String are equal");
        } else {
            System.out.println("Both JAVA String are NOT equal");
        }

        if (s3 == s4) {
            System.out.println("Both NEW String are equal");
        } else {
            System.out.println("Both NEW String are NOT equal");
        }
    }
}
 */

// A Simple Java String Example

/**
public class StringExamples {
    public static void main(String[] args) {
        String str1 = "A Good Day.";

        char arrayChar[] = {'i', 'c', 'e'};         // Put elements in an array

        String str2 = new String(arrayChar);        // Converted an array into String by TypeCasting (Narrowing Casting)

        String str3 = new String("A very bad day");

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
 */

// Display First & Last character of String 
/*
 public class StringExamples {
    public static void main(String[] args) {
        String str = "Got Straight Back to it";
        int len = str.length();         // Calculated length of a String

        System.out.println("First Character is : " + str.charAt(0));        // used .charAt() method and passed 0th index to it.

        System.out.println("Last Character is : " + str.charAt(len-1));         // and here passed len-1 as a parameter to not exceed the range of index.
    }
 }
*/

// Comparing STRING VS new STRING using .equals() method.
/*
public class StringExamples {
    public static void main(String[] args) {
        String str1 = "This is how it works";
        String str2 = new String("This is how it works");

        if (str1.equals(str2)) {            // .equals() method checks if the string is equal or not using word to word check
            System.out.println("Both are Equal");
        } else {
            System.out.println("Both are NOT Equal.");
        }
    }
}
*/

// String Concatenation
/*
public class StringExamples {
    public static void main(String[] args) {
        String str1 = "This is";
        String str2 = "Life";
        System.out.println(str1.concat(" ").concat(str2));      // .concat() concatenates up the string. Works the same as '+' sign.
    }
}
*/

// if-else (Voting Scenario)
/*
public class StringExamples {
    public static void main(String[] args) {
        int legalAge = 18;
        int myAge = 20;
        if (myAge >= legalAge) {
            System.out.println("You can vote.");
        } else {
            System.out.println("Your age is less then the legal age.");
        }        
    }
}
*/

// Sorting String Array
/*
public class StringExamples {
    public static void main(String[] args) {
        String[] cars = new String[] {"Porsche", "Ferrari", "Lamborghini", "BMW", "Mercedes", "Aston Martin"};
// Before Sorting
        System.out.println("Array before Sorting : ");
        for(String car : cars){
            System.out.println(car);
        }
        System.out.println();
// Sorting Method
        Arrays.sort(cars);
        System.out.println("Array after Sorting : ");
        for(String car : cars){
            System.out.println(car);
        }    
    }
}
*/

// Search an element in String Array.
/*
public class StringExamples {
    public static void main(String[] args) {
        String[] cars = new String[] {"Porsche", "Ferrari", "Lamborghini", "BMW", "Mercedes", "Aston Martin"};

        int index = 0;
        boolean foundItem = false;
        String item = "Porsche";

        for (int i = 0; i < cars.length; i++) {
            if (item.equals(cars[i])) {
                index = i+1;
                foundItem = true;
                break;
            }
        }
        if (foundItem==true) {
            System.out.println("Your item " + item + " is found at index " + index);
        } else {
            System.out.println("Your item " + item + " is not found");
        }
    }
}
*/

// Program to check whether String is palindrome using recursion
/*
public class StringExamples {
    public static boolean isPalindrome(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return true;
        }
        if (s.charAt(0) == s.charAt(s.length() -1)) {
        // * check for first and last char of String:
        // * if they are same then do the same thing for a substring
        // * with first and last char removed. and carry on this
        // * until you string completes or condition fails
        // * Function calling itself: Recursion
         
            return isPalindrome(s.substring(1, s.length()-1));
        }

        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your string : ");
        String input = scanner.nextLine();
        scanner.close();
        if (isPalindrome(input)) {
            System.out.println("Your input is a palindrome");
        } else {
            System.out.println("Your input is NOT palindrome");
        }
    }
}
*/

// Write programs to find out the factorial of a number using recursion.
/*
public class StringExamples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = scanner.nextInt();        
        scanner.close();

        int factorial = factorial(number);
        System.out.println("Factorial of " + number + " is " + factorial);
    }
    static int factorial(int n){
        if (n==1) {
            return 1;
        }
        int output = factorial(n-1) * n;
        return output;
    }
}
*/

// Program to reverse a string
/*
public class StringExamples {
    public static void main(String[] args) {
        System.out.print("Enter your name : ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();

        String reversed = reverseString(str);
        System.out.println("Your Reversed String is = " + reversed);
    }
    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
 */

 // Count number of vowels and cononants in a string
public class StringExamples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any word = ");
        String str = scanner.nextLine();
        scanner.close();
        str = str.toLowerCase();
        int vCount = 0, cCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vCount++;
            } 
            else if(ch >= 'a' && ch <= 'z'){
                cCount++;
            }    
        }
        System.out.println("Total Vowels are : " + vCount);
        System.out.println("Total Consonants are : " + cCount);
    }
}
