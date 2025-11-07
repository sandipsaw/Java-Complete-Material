import java.util.*;
class Student{
    String name;
    int age;

    public void printinfo(String name){
        System.out.println("your name is : "+name);
    }
    public void printinfo(int age){
        System.out.println("your age is : "+age);
    }
    public void printinfo(String name,int age){
        System.out.println("your name is : "+name+" and your age is : "+age);
    }
}
public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        s1.printinfo("sandip");
        s1.printinfo(25);
        s1.printinfo("sandip",25);
        sc.close();
    }
}