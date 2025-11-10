# What is a Package in Java?

A package in Java is a collection of related classes and interfaces grouped together under a single name.
It helps in organizing your code, reusing classes, and avoiding name conflicts.

You can think of a package as a folder on your computer that contains related Java files.
---
# Why We Use Packages

1. Code Reusability – Once a class is written, it can be reused in other programs by importing the package.

2. Organization – Helps to keep related classes together, making large projects easier to manage.

3. Avoids Name Conflicts – Two classes with the same name can exist in different packages.

4. Access Control – Packages help in restricting access using access modifiers like public, protected, private, and default.

5. Easier Maintenance – Classes related to similar functionality are grouped together.

---
# Types of Packages in Java
1. Built-in Packages (Java API Packages)

These are packages provided by Java itself.
They contain many pre-written classes that you can directly use in your programs.

Package	                 Description
java.lang :-	        Basic classes (String, Math, Object, Exception). Automatically imported.
java.util :-	        Utility classes (ArrayList, HashMap, Scanner, Date).
java.io	:-              Input/output (File handling, Streams).
java.awt :- 	        GUI components (windows, buttons, menus).
java.net :- 	        Networking (sockets, URLs).
java.applet	:-          Applets for web browsers.         

2. User-Defined Packages

Packages created by the programmer to group their own related classes.
Example 👇

Step 1: Create a package and class
```
package mypackage;

public class Greet {
    public void sayHello() {
        System.out.println("Hello from mypackage!");
    }
}
```
Step 2: Save it as → Greet.java
Inside a folder named mypackage

Step 3: Use the package in another program
```
import mypackage.Greet;  // import packageName.className

class Test {
    public static void main(String[] args) {
        Greet obj = new Greet();
        obj.sayHello();
    }
}
```

How to Import Packages

1. Import a single class
```
import mypackage.Greet;
```
2. Import all classes from a package
```
import mypackage.*;
```
3. Use fully qualified name (without import)
```
mypackage.Greet obj = new mypackage.Greet();
```

🏁 Summary

Package = folder containing related classes/interfaces.
Two types:
- Java API (built-in)
- User-defined
Main uses: organize code, reuse classes, and control access. 
Use the import statement to access classes from a package.

---
# Access Modifiers in Java

Access Modifiers in Java are keywords used to control the visibility (accessibility) of classes, methods, constructors, and variables in a program.

They help in implementing the principle of encapsulation — i.e., hiding internal details and exposing only what’s necessary.

1. private

Accessible only within the same class.
Cannot be accessed by any other class, even in the same package.
```
class A {
    private int data = 10;
    private void msg() { System.out.println("Hello"); }
}

class B {
    public static void main(String[] args) {
        A obj = new A();
        // obj.msg();  // ❌ Error: msg() has private access
    }
}
```

2. Default (no keyword)

Accessible with in the same class and also within the same package.
Also called package-private access.
```
class A {  
    // here A & B are in the same class
    void msg() { System.out.println("Default Access"); }
}

class B {
    public static void main(String[] args) {
        A obj = new A();  // ✅ Works: same package
        obj.msg();
    }
}
```

3. protected

Accessible:
Accessible with in the same class , with in the same package.
it is also Accessible even if they are in different packages

```
package pack1;
public class A {
    protected void msg() { System.out.println("Protected Access"); }
}

package pack2;
import pack1.*;
class B extends A {
    public static void main(String[] args) {
        B obj = new B();  // ✅ Works: subclass
        obj.msg();
    }
}
```
4. public

Accessible from anywhere in the program (any class, any package).
```
package pack1;
public class A {
    public void msg() { System.out.println("Public Access"); }
}

package pack2;
import pack1.*;
class B {
    public static void main(String[] args) {
        A obj = new A();  // ✅ Works from any package
        obj.msg();
    }
}
```
<img width="1308" height="614" alt="image" src="https://github.com/user-attachments/assets/cbdf294e-a7ef-418f-be39-a0cc7473aaf6" />

