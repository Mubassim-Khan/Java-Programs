package Examples;

// Abstract Classes
/*
abstract class abstractClass {
    public abstract void display();
}

class implementClass extends abstractClass{
    public void display(){
        System.out.println("This is display...");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        implementClass Obj = new implementClass();
        Obj.display();
    }
}
*/

// Interfaces
/*
interface A{
    int x = 100;
}

interface B{
    int x = 20;
}

public class Abstraction implements A, B{
    public static void main(String[] args) {
        System.out.println(A.x);
        System.out.println(B.x);
    }
}
*/

// Miscellaneous Example

abstract class Employee {
    private String name;
    private double balance;
    private String address;

    Employee(String name, String address, double balance){
        this.name = name;
        this.address = address;
        this.balance = balance;
    }

    public double checkBalance() {
        System.out.println("Your bank balance is: " + this.balance);
        return 0.0;
    }

    public void mailing() {
        System.out.println("Maling it to " + this.name + " at address " + this.address);
    }

// Getters & Setters for Private Attributes

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        name = Name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String Address) {
        address = Address;
    }

    public double getBalance(double Balance) {
        return balance;
    }

}

public class Abstraction extends Employee{
    Abstraction(){
        super("Cee", "\"Beverly Hills\"", 320000.43);
    }
    public static void main(String[] args) {
        Abstraction Obj = new Abstraction();
        Obj.checkBalance();
        Obj.mailing();
    }
}