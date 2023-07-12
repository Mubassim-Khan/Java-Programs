package Examples;
import java.util.Arrays;
import java.util.Scanner;

// Making an Array of Integers

/*
public class ArrayExamples {
    public static void main(String[] args) {
        int numbers[] = {2, 3, 4, 5, 6};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number ["+i+"] : " + numbers[i]);
        }
    }
}
*/

// Making an Array of String 

/*
public class ArrayExamples {
    public static void main(String[] args) {
        String names[] = {"Cee", "Maignan", "Khan"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(i + " : " + names[i]);
        }
    }
}
*/

// Multi-Deminsional Arrays

/*
public class ArrayExamples {
    public static void main(String[] args) {
        int multiArray[][] = {{1, 2, 3, 4}, {11, 22, 33, 44}};
        for(int i=0; i<2; i++){         // Outer loop (For Row)
            for(int j=0; j<4; j++){     // Inner loop (For Column)
                System.out.println(multiArray[i][j]);
            }
        }
    }
}
*/

// Printing an Array using for-each loop

/*
public class ArrayExamples {
    public static void main(String[] args) {
        String names[] = {"Hello", "Sam", "Lee"};
        for (String name : names) {
            System.out.println(name);
        }

        int nums[] = {2, 4, 6, 8};
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
*/

// Printing an Array using for loop

/*
public class ArrayExamples {
    public static void main(String[] args) {
        int numArray[] = {2, 3, 4, 5, 6, 9};
        for (int i = 0; i < numArray.length; i++) {
            System.out.println(numArray[i]);
        }
    }
}
*/

// Sorting an Array by user input

/*
public class ArrayExamples {
    public static void main(String[] args) {
        int temp, count;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements you want in an Array: ");
        count = scanner.nextInt();

        int numArray[] = new int[count];
        System.out.println("Enter Elements : ");

        for (int i = 0; i < count; i++) {
            numArray[i] = scanner.nextInt();
        }
        scanner.close();

        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if(numArray[i] > numArray[j]){
                    temp = numArray[i];
                    numArray[i] = numArray[j];
                    numArray[j] = temp;
                }
            }
        }
        System.out.println("Array elements sorted in Asscending order is: ");
        for (int i = 0; i < count - 1; i++) {
            System.out.print(numArray[i] + ", ");
        }
        System.out.println(numArray[count - 1]);
    }
}
*/

// Adding 2d Matrices

/*
public class ArrayExamples {
    public static void main(String[] args) {
        int rows = 2, columns = 4;

        int[][] Matrix_A = {{2, 3, 4, 5}, {2, 3, 2, 5}};
        int[][] Matrix_B = {{3, 0, 1, -1}, {9, 8, 7, 2}};

        int[][] Sum = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                Sum[i][j] = Matrix_A[i][j] + Matrix_B[i][j];
            }
        }

        System.out.println("Sum of given Matrices is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(Sum[i][j] + "      ");
            }
        }
    }
}
*/

// Array sorting using .sort()

/*
public class ArrayExamples {
    public static void main(String[] args) {
        char Array24[] = new char [] {'a', 'm', 'l', 'o', 's', 'b', 'e', 'y', 'r', 'z', 'm'};

        Arrays.sort(Array24);
        for (char ch : Array24) {
            System.out.print(ch + " ");
        }
    }
}
*/

// Selective Sorting 

/*
public class ArrayExamples {
    public static void main(String[] args) {
        char Array24[] = {'a', 'z', 'l', 'o', 's'};

        Arrays.sort(Array24, 0, 4);
        for (char ch : Array24) {
            System.out.print(ch + " ");
        }
    }
}
*/

// To print duplicate items of an Array

/*
public class ArrayExamples {
    public static void main(String[] args) {
        String namesArray[] = {"Kareem", "Mujeeb", "Fareed", "Ghareeb", "Waleed", "Waleed", "Mujeeb"};  
        for (int i = 0; i < namesArray.length; i++) {
            for (int j = i+1; j < namesArray.length; j++) {
                if (namesArray[i].equals(namesArray[j])) {
                    System.out.println(namesArray[i]);
                }
            }
        }
    }
}
*/

// To remove duplicated element from an Array


public class ArrayExamples {
    public static void main(String[] args) {
        
    }
}