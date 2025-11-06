// Multiple Objects
// Create 3 objects of the class Employee using a parameterized constructor,
// each having different data, and display all employee details.

import java.util.*;

class Employee{
    String name;
    int salary;
    String role;

    Employee(String name,int salary,String role){
        this.name = name;
        this.salary = salary;
        this.role = role;
    }
    void display(){
        System.out.println("name : "+name+" salary : "+salary+" role : "+role);
    }
}
public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e1 = new Employee("sandip saw",50000,"Frontend");
        Employee e2 = new Employee("Rohit gupta",60000,"Backend");
        Employee e3 = new Employee("jeet gorai",70000,"Web Dev");
        e1.display();
        e2.display();
        e3.display();
        sc.close();
    }
}
