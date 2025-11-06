In Object-Oriented Programming (OOPs), a constructor is a special method that is automatically called when an object is created from a class.

It is mainly used to initialize the object’s data members (i.e., give them initial values).

Key Points about Constructors:
Name:
The constructor has the same name as the class.
No Return Type:
Constructors don’t have a return type, not even void.
Automatic Execution:
It is called automatically when an object is created.
Purpose:
To set up (initialize) the object before it is used.


#include <iostream>
using namespace std;

class Student {
public:
    string name;
    int age;

    // Constructor
    Student(string n, int a) {
        name = n;
        age = a;
        cout << "Constructor called!" << endl;
    }

    void display() {
        cout << "Name: " << name << ", Age: " << age << endl;
    }
};

int main() {
    Student s1("Sandip", 21); // Constructor is called here
    s1.display();
    return 0;
}

In Simple Words:
A constructor is like a setup function that runs automatically when you make an object, to give it initial values or prepare it for use.\

There are mainly three types of constructors, though the exact names can vary slightly between languages like C++, Java, and Python.

1. Default Constructor:-
A default constructor is a constructor that takes no parameters.
It gives default values to the object’s data members.

class Student {
    String name;
    int age;

    // Default constructor
    Student() {
        name = "Unknown";
        age = 0;
        System.out.println("Default Constructor called!");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();  // Constructor called automatically
        s1.display();
    }
}

2. Parameterized Constructor:-
A parameterized constructor accepts arguments to initialize objects with specific values.

class Student {
    String name;
    int age;

    // Parameterized constructor
    Student(String n, int a) {
        name = n;
        age = a;
        System.out.println("Parameterized Constructor called!");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Sandip", 21); // Constructor called
        s1.display();
    }
}

3. Copy Constructor (Manual in Java):-
Unlike C++, Java does not have a built-in copy constructor,
but you can create your own to copy data from one object to another.

class Student {
    String name;
    int age;

    // Parameterized constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    // Copy constructor (created manually)
    Student(Student s) {
        name = s.name;
        age = s.age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Sandip", 21);
        Student s2 = new Student(s1); // Copy constructor called
        s2.display();
    }
}
