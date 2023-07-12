package Examples;


// Modify static variable in main method and other methods of the class
/*
public class Static_FinalKeywords {
    static int a = 10;
    static int b;
    public static void printStaticValue() {
        a = a / 2;
        b = a;
        System.out.println("From printStaticValue: Value of a is " + a + " & b is " + b);
    }
    public static void main(String[] args) {
        printStaticValue();
        b = a * 5;
        System.out.println("From main: Value of a is " + a + " & b is " + b);
    }
}
*/

// Static variable as a counter
/*
class Counter {
    static int counter = 0;
    Counter(){
        counter++;
        System.out.println("Value of counter is: " + counter);
    }
}
public class Static_FinalKeywords {
    public static void main(String[] args) {
        System.out.println("Value of Static Variable (Counter): ");
        Counter Obj1 = new Counter();
        Counter Obj2 = new Counter();
        Counter Obj3 = new Counter();
    }
}
*/

// Static Method
/*
public class Static_FinalKeywords {
    public static void Static_Method() {
        System.out.println("Called Without making any object");
    }
    public static void main(String[] args) {
        Static_Method();        // Called without making any object 
    }
}
*/

// Static Method Overloading
/*
public class Static_FinalKeywords {
    public static void Static_Method() {
        System.out.println("Method without any parameters");
    }
    public static void Static_Method(String args) {         // Method Overloading
        System.out.println("This is a Method using parameter -> " + args);
    }
    public static void main(String[] args) {
        Static_Method("This is arrgument");
        Static_Method();
    }
}
 */

// Static Method Overriding
/*
class parentClass {
    public static void Static_Method() {
        System.out.println("Parent Class -> Static Method");
    }
}

class childClass extends parentClass{
    public static void Static_Method() {
        System.out.println("Child Class -> Static Method");
    }
}

public class Static_FinalKeywords {
    public static void main(String[] args) {
        parentClass parent = new parentClass();
        childClass child = new childClass();

        parent.Static_Method();
        child.Static_Method();        
    }
}
*/

// Static Block
/*
public class Static_FinalKeywords {
    static int sum;
    static int a = 3;
    static int b = 4;
    // Static
    static{
        sum = a + b;
        System.out.println("In Static Block: ");
        System.out.println("Values of a: " + a + "; b: " + b + "; Sum: " + sum);
        a = b * 2;
        sum = a + b;
    }
    public static void main(String[] args) {
        System.out.println("In Main method: ");
        System.out.println("Values of a: " + a + "; b: " + b + "; Sum: " + sum);
    }
}
*/

// Multiple Static Blocks
/*
public class Static_FinalKeywords {
    static int num;
    static int sum;

    static{
        num = 8;
        sum = 1282;
    }
// In sequential static blocks, values of 1st block overwrites values of 2nd block.
    static{
        num = 10;
        sum = 2002;
    }
    public static void main(String[] args) {
        System.out.println("Value of num : " + num + ", sum: " + sum);
    }
}
*/

// Calling Static & Non-Static Methods
/*
public class Static_FinalKeywords {
    static int num = 2002;
    static String name = "Cee";

    public static void static_display() {
        System.out.println("Number : " + num + "; Name: " + name);
    }

    void nonStatic_display(){
        System.out.println("Number: " + num + "; Name: " + name);
    }
    public static void main(String[] args) {
        Static_FinalKeywords Obj = new Static_FinalKeywords();
        Obj.nonStatic_display();
        static_display();   
    }
}
*/

// Static Binding
/*
class human {
    public static void Generation() {
        System.out.println("An honurable guy");
    }
}

class boy extends human{
    public static void Generation() {
        System.out.println("No self respect");
    }
}
public class Static_FinalKeywords {
    public static void main(String[] args) {
        human Obj1 = new boy();
        human Obj2 = new human();
        
        Obj1.Generation();
        Obj2.Generation();
    }
}
*/

// Dynamic Binding
/*
class human {
    public void Generation() {
        System.out.println("An honurable guy");
    }
}

class boy extends human{
    public void Generation() {
        System.out.println("No self respect");
    }
}
public class Static_FinalKeywords {
    public static void main(String[] args) {
        human Obj1 = new boy();
        human Obj2 = new human();
        
        Obj1.Generation();
        Obj2.Generation();
    }
}
*/

// Memory Efficient Static Variable
/*
class Example {
    int rollNum;
    String collegeName = "XYZ";
    String studentName;
    Example(int rollNum, String studentName){
        this.rollNum = rollNum;
        this.studentName = studentName;
    }

    public void method() {
        System.out.println("Name: " + studentName + "; Roll No: " + rollNum + "; College: " + collegeName);
    }
}

public class Static_FinalKeywords {
    public static void main(String[] args) {
        Example Obj1 = new Example(24, "Cee");
        Example Obj2 = new Example(8, "Cench");

        Obj1.method();
        Obj2.method();
    }
}
*/

// Counter without static variable
/*
class Counter {
    int counter = 0;

    public void increment() {
        counter++;
        System.out.println(counter);
    }
}

public class Static_FinalKeywords {
    public static void main(String[] args) {
        Counter Obj1 = new Counter();
        Counter Obj2 = new Counter();
        Counter Obj3 = new Counter();
        // Doesn't increment value, bcz counter variable is not static.
        Obj1.increment();
        Obj2.increment();
        Obj3.increment();
    }
}
*/

// Counter with static varibale
/*
class Counter {
    static int counter = 0;

    public void increment() {
        counter++;
        System.out.println(counter);
    }
}

public class Static_FinalKeywords {
    public static void main(String[] args) {
        Counter Obj1 = new Counter();
        Counter Obj2 = new Counter();
        Counter Obj3 = new Counter();
        // Increments value, bcz counter variable is static.
        Obj1.increment();
        Obj2.increment();
        Obj3.increment();
    }
}
*/

// Static Method performing Calculation
/*
public class Static_FinalKeywords {
    static int num;
    public static int Cube(int num) {
        return num*num*num;
    }
    public static void main(String[] args) {
        System.out.println(Cube(9));
    }
}
*/

// Static Block invoked
/*
public class Static_FinalKeywords {
    static{
        System.out.println("This block is always called...");
    }
    public static void main(String[] args) {
        System.out.println("Main method");
    }
}
*/

// Static & Non-Static Methods
class staticMethods {
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }
    // Static Method
    public static int addition(int num1, int num2) {
        return num1 + num2;
    }
}

public class Static_FinalKeywords {
    public static void main(String[] args) {
        staticMethods Obj1 = new staticMethods();
        int prod = Obj1.multiply(3, 4);
        int sum = staticMethods.addition(2, 2);

        System.out.println("(Non-Static) Product is: " + prod);
        System.out.println("(Static) Sum is: " + sum);
    }
}

