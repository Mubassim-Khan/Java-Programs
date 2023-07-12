package Examples;
import java.util.Scanner;

// Checking Even or Odd number
// if...else
/*
public class FlowControlExamples {
    public static void main(String[] args) {
        System.out.print("Enter any number : ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();

        if (num % 2 == 0) {
            System.out.println("Number is EVEN");
        } else {
            System.out.println("Number is ODD");
        }        
    }
}
*/

// Using Ternary Operators
/*
public class FlowControlExamples {
    public static void main(String[] args) {
        System.out.print("Enter any Number : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        input.close();

        String decider = (num % 2 == 0) ? "Number is EVEN" : "Number is ODD";
        System.out.println(decider);
    }
}
*/

// A Simple Swtich case
/*
public class FlowControlExamples {
    public static void main(String[] args) {
        int num = 2;
        switch (num) {
            case 1:
                System.out.println("Case 1: Value is "+ num);
            case 2:
                System.out.println("Case 2: Value is "+ num);
            case 3:
                System.out.println("Case 3: Value is "+ num);
            default:
                System.out.println("Default case: " + num);;
        }
    }
}
*/

// Switch Case using break statement
/*
public class FlowControlExamples {
    public static void main(String[] args) {
        int num = 3;
        switch (num) {
            case 1:
                System.out.println("This is 1st Case : " + num);
                break;

            case 2:
                System.out.println("This is 2nd Case : " + num);
                break;
            
            case 3:
                System.out.println("This is 3rd Case : " + num);
                break;

            case 4:
                System.out.println("This is 4th Case : " + num);
                break;

            default:
                System.out.println("This is Default Case : " + num);
                break; 
        }
    }
}
*/

// To Check vowels or Consonents using Switch
/*
public class FlowControlExamples {
    public static void main(String[] args) {
        boolean isVowel = false;
        System.out.print("Enter input: ");
        Scanner scanner = new Scanner(System.in);
        char alpha = scanner.next().charAt(0);
        scanner.close();
        switch (alpha) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U': 
            isVowel = true;
        }
        if (isVowel == true) {
            System.out.println("Given input is VOWEL");
        } else {
            if ((alpha >= 'a' && alpha <= 'z') || (alpha >= 'A' && alpha <= 'Z')) {
                System.out.println("Given input is CONSONANT");
            } else {
                System.out.println("Input is not an alphabet");
            }
        }
    }
}
*/

// Calculator using Switch Cases

public class FlowControlExamples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter 2nd Number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Select Operation (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        scanner.close();
        double output = 0;

        switch (operator) {
            case '+':
                output = num1 + num2;
                break;
        
            case '-':
                output = num1 - num2;
                break;

            case '*':
                output = num1 * num2;
                break;

            case '/':
                output = num1 / num2;
                break;

            default:
            System.out.println("Enter correct operator !");
                break;
        }
        System.out.println(num1 + " " + operator + " " + num2 + " = " + output);
    }
} 

// Factorial using Loop
/*
public class FlowControlExamples {
    public static void main(String[] args) {
        int num = 3;
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + num + " is: " + fact);
    }
}
*/

// Fibonacci Series using loop
/*
public class FlowControlExamples {
    public static void main(String[] args) {
        int count = 10, a = 0, b = 1;
        System.out.println("Fibonacci Series for " + count + " numbers is : ");
        for (int i = 1; i <= count; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
*/

// Simple While Loop
/*
public class FlowControlExamples {
    public static void main(String[] args) {
        int i = 5;
        while (i > 0) {
            i--;
            System.out.println(i);
        }   
    }
}
*/

// Do-While loop
/*
public class FlowControlExamples {
    public static void main(String[] args) {
        int i = 5;
        do {
            System.out.println(i);
            i--;
        } while (i > 0);
    }
}
*/

// Continue in for loop
/*
public class FlowControlExamples {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }
}
*/

// Continue in While loop
/*
public class FlowControlExamples {
    public static void main(String[] args) {
        int i = 7;
        while (i >= 0) {
            if(i == 4){
                i--;
                continue;
            }
            System.out.println(i);
            i--;
        }
    }
}
*/

// Continue in Do...While Loop
/*
public class FlowControlExamples {
    public static void main(String[] args) {
        int i = 0;
        do {
            if (i==4) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        } while (i<=10);
    }
}
*/

// Pyramid using for loop
/*
public class FlowControlExamples {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
*/
