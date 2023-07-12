package Examples;

// Simple Inheritance
/*
class Teacher {
    String designation = "Teacher";
    String School = "ABC School";

    public void Teaches() {
        System.out.println("Teaching...");
    }
}

class physicsTeacher extends Teacher {
    String subjectTeacher = "Physics";
}

public class InheritanceExamples {
    public static void main(String[] args) {
        physicsTeacher teacher = new physicsTeacher();
        System.out.println(teacher.School);
        System.out.println(teacher.designation);
        System.out.println(teacher.subjectTeacher);
        teacher.Teaches();
    }
}
*/

// Instanceof Example
/*
class A {
}

class B extends A {
}

public class InheritanceExamples extends B{
    public static void main(String[] args) {
        A Obj1 = new A();
        B Obj2 = new B();
        InheritanceExamples Obj3 = new InheritanceExamples();

        System.out.println(Obj1 instanceof A);
        System.out.println(Obj2 instanceof B);
        System.out.println(Obj3 instanceof InheritanceExamples);

        System.out.println(Obj1 instanceof B);
        System.out.println(Obj2 instanceof InheritanceExamples);
        System.out.println(Obj3 instanceof B);
    }
}
*/

// Access Modifiers (Private)
/*
class Teacher {
    private String designation = "Teacher";
    private String School = "ABC School";

    public void Teaches() {
        System.out.println("Teaching...");
    }


    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDesignation(){
        return designation;
    }

    public void setSchool(String School) {
        this.School = School;
    }

    public String getSchool() {
        return School;
    }
}

class physicsTeacher extends Teacher {
    String subjectTeacher = "Physics";
}


public class InheritanceExamples {
    public static void main(String[] args) {
        physicsTeacher teacher = new physicsTeacher();
        System.out.println(teacher.getDesignation());
        System.out.println(teacher.getSchool());
        System.out.println(teacher.subjectTeacher);
        teacher.Teaches();
    }
}
*/

// Method OverLoading
/*
class Teacher {     // Parent Class
    Teacher(){
        System.out.println("This is a Parent Class.");
    }
    public void does() {
        System.out.println("Teaches CHILDREN");
    }
}


public class InheritanceExamples extends Teacher{       // Child Class
    InheritanceExamples(){
        System.out.println("Child Class Constructor");
    }
    public void does() {
        System.out.println("Child method");
        super.does();
    }

    public static void main(String[] args) {
        InheritanceExamples child = new InheritanceExamples();
        child.does();
    }
} 
*/

// Super Class & Child Class
/*
class superClass {
    int num = 2;
}

class subClass extends superClass {
    int num = 4;
    public void printNo() {
        System.out.println(super.num);          // Will print number of Parent Class
        System.out.println(num);                // Will print number of Child Class
    }
}

public class InheritanceExamples {
    public static void main(String[] args) {
        subClass objClass = new subClass();
        objClass.printNo();
        // System.out.println(objClass.num);
    }
}
*/

// Parameterized super() call to invoke parameterized constructor of parent class
/*
class ParentClass {
    ParentClass() {
        System.out.println("Parent Constructor without args");
    }
    ParentClass(String s) {
        System.out.println("Parent Constructor with args");
    }
}
public class InheritanceExamples extends ParentClass{
    InheritanceExamples() {
        super("Hello there");          
 // *** If we want to use the constructor with args we would have to use super keyword and pass the arrguments in it. ***
 // Else it will run using default constructor
        System.out.println("Child Constructor");
    }
    public void does() {
        System.out.println("Plays");
    }
    public static void main(String[] args) {
        InheritanceExamples Obj = new InheritanceExamples();
        Obj.does();
    }
}
*/

// How to use super keyword in case of method overriding
/*
class parentClass {
    public void display() {
        System.out.println("This is a Parent Class");
    }
}


class childClass extends parentClass {
    public void display() {
        System.out.println("This is Child Class");
    }
    public void linker() {
        super.display();
        display();
    }
}

public class InheritanceExamples {
    public static void main(String[] args) {
        childClass Obj = new childClass();
        Obj.linker();
    }
}
*/

// super Keyword in Inheritance
/*
class Janwar {
    public void khana() {
        System.out.println("Mein khata hon");
    }
}

class Kutta extends Janwar {
    @Override
    public void khana() {
        super.khana();
        System.out.println("Mein kutte ka khana khata hon");
    }
    public void awaz() {
        System.out.println("Mein kutte ki trah bhonkta hon");
    }
}

public class InheritanceExamples {

    public static void main(String[] args) {
        Kutta Object = new Kutta();
        Object.khana();
        Object.awaz();
    }
}
*/

// protected Members in Inheritance
/*
class Animal {
    protected String name;

    protected void display() {
        System.out.println("I am a animal");
    }
}

class Cat extends Animal{
    protected void sound() {
        System.out.println("Meoaw");
    }
}

public class InheritanceExamples {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "Kitty";

        System.out.println(cat.name);
        cat.display();
        cat.sound();
    }
}
*/

// Calculator using Inheritance
/*
class Calculator {
    int ans;

    public void Addition(int num1, int num2) {
        ans = num1 + num2;
        System.out.println("The sum of 2 numbers is: " + ans);
    }

    public void Subtraction(int num1, int num2) {
        ans = num1 - num2;
        System.out.println("The difference of 2 numbers is: " + ans);
    }
}

public class InheritanceExamples extends Calculator{

    public void Multiplication(int num1, int num2) {
        int ans = num1 * num2;
        System.out.println("The product of 2 numbers is: " + ans);
    }
    public static void main(String[] args) {
        int a = 5, b = 3;
        InheritanceExamples Obj = new InheritanceExamples();
        Obj.Addition(a, b);
        Obj.Subtraction(a, b);
        Obj.Multiplication(a, b);
    }
}
*/

// Inheritance Super Class Examples
/*
class superClass {
    int age;

    superClass(int age){
        this.age = age;
    }

    public void getAge() {
        System.out.println("The age is: " + age);
    }
}

class subClass extends superClass{
    subClass(int age){
        super(age);
    }
}

public class InheritanceExamples {
    public static void main(String[] args) {
        subClass Obj = new subClass(23);
        Obj.getAge();
    }
}
*/

// Inheritance (Instance Example)

class Animal {
    
}


class landAnimals extends Animal{

}

class Lion extends landAnimals{
    
}

class waterAnimals extends Animal{

}

public class InheritanceExamples {
    public static void main(String[] args) {
        Animal animal = new Animal();
        landAnimals land_animal = new landAnimals();
        Lion lion = new Lion();
        waterAnimals water_Animal = new waterAnimals();

        System.out.println(animal instanceof Animal);
        System.out.println(animal instanceof landAnimals);
        System.out.println(water_Animal instanceof Animal);
        System.out.println(lion instanceof landAnimals);
        System.out.println(land_animal instanceof Animal);
    }
}

