package Examples;

/* KEEP IN MIND: Always initialize Blank final vars in Class constructor !! */

// Blank Final Variable Example: 1
/*
public class FinalKeywords {
    final int num;
    FinalKeywords(){
        num = 10;
    }
    void sumUp() {
        System.out.println(num);
    }
    public static void main(String[] args) {
        FinalKeywords foo = new FinalKeywords();
        foo.sumUp();
    }
}
*/

// Blank Final Variable Example: 2
/*
public class FinalKeywords {
    final int rollNo;

    FinalKeywords(int rNum){
        rollNo = rNum;
    }   

    public void studentNo() {
        System.out.println("Student Number is: " + rollNo);
    }
    public static void main(String[] args) {
        FinalKeywords student1 = new FinalKeywords(2002);
        FinalKeywords student2 = new FinalKeywords(1282);
        
        student1.studentNo();
        student2.studentNo();
    } 
}
*/

// Uninitialized Static Variables
/*
public class FinalKeywords {
    static String name;

    static{
        name = "Fatal";
    }
    public static void main(String[] args) {
        System.out.println(FinalKeywords.name);
    }
}
*/

// Final Methods (Can not be overridden by child class)
/*
class parentClass {
    final public void display() {
        System.out.println("This is Final method of Parent Class");
    }
}
public class FinalKeywords extends parentClass{
    public static void main(String[] args) {
        parentClass Obj = new parentClass();
        Obj.display();
    }
}
*/

// Final Classes (Can not be extended by other classes)
/*
final class parentClass {
    public void overRiding() {
        System.out.println("Parent Class Method");
    }
}
public class FinalKeywords extends parentClass{         // Here it throws the error (As Final Class can not be Inherited)
    public static void main(String[] args) {
        
    }
}
*/

// Final Parameters (Can not be modified later)

public class FinalKeywords {
    public void details(int num, final String name) {
        num = num + 2;              // Can be changed, as it is not final

        // name = name + "rew";         // A Final Variable can not be modified, once assigned (As a Parameter)

        System.out.println("Name: " + name + "; Number: " + num);
    }
    public static void main(String[] args) {
        FinalKeywords Obj1 = new FinalKeywords();
        Obj1.details(8, "Cee");
    }
}

