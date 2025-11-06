//6. Copy Constructor
// Create a class Person with name and age.
// Define a copy constructor that copies data from another object.

import java.util.*;

class Person{
    String name;
    int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    Person(Person p){
        this.name = p.name;
        this.age = p.age;
    }
    void display(){
        System.out.println("The age of "+name+" is almost "+age+" year old");
    }
}
public class Ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person p1 = new Person("sanip saw",23);
        p1.display();
        Person p2 = new Person(p1);
        p2.display();
        sc.close();
    }
}