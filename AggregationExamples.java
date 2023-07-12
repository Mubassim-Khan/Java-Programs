package Examples;
// Taking Address & Student as an Example

class Address {
    int StreetNo;
    String City;
    String State;
    String Country;
    Address(int StreetNo, String City, String State, String Country){
        this.StreetNo = StreetNo;
        this.City = City;
        this.State = State;
        this.Country = Country;
    }
}

class Student {
    int Rollno;
    String StudentName;
    Address StudentAddress;
    Student(int Rollno, String StudentName, Address StudentAddress){
        this.Rollno = Rollno;
        this.StudentName = StudentName;
        this.StudentAddress = StudentAddress;
    }
}

public class AggregationExamples {
    public static void main(String[] args) {
        Address address = new Address(34, "New York", "NYC", "USA");
        Student student = new Student(8, "Mubassim", address);
        
        System.out.println(student.StudentName);
        System.out.println(student.StudentAddress.City);
        System.out.println(student.StudentAddress.Country);
        System.out.println(student.StudentAddress.State);
        System.out.println(student.StudentAddress.StreetNo);
    }
}
