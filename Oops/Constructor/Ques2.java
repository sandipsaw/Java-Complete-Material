// Parameterized Constructor
// Create a class Student with data members name, age, and grade.
// Use a parameterized constructor to initialize and display them.
import java.util.*;

class Student{
    String name;
    int age;
    char grade;

    Student(String name,int age,char grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    void display(){
        System.out.println("name : "+name+" age : "+age+" grade : "+grade);
    }
}
public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student("sandip saw", 21, 'A');
        s1.display();
        sc.close();
    }
}