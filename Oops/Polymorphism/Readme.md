# Meaning of Polymorphism

The word Polymorphism comes from Greek:

“Poly” = many
“Morph” = forms

So Polymorphism means “many forms.”

In simple words:
Polymorphism allows one action to behave differently based on the object performing it.

Types of Polymorphism in Java

# 1. Compile-Time Polymorphism (Method Overloading)
When multiple methods have the same name but different parameters (number or type).

```
class Calculator {
    void add(int a, int b) {
        System.out.println("Sum of integers: " + (a + b));
    }

    void add(double a, double b) {
        System.out.println("Sum of doubles: " + (a + b));
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(5, 10);       // calls int version
        calc.add(5.5, 3.2);    // calls double version
    }
}
```
Same method name → behaves differently depending on arguments.
This is Compile-time Polymorphism.

---
# CONDITIONS for Compile-Time Polymorphism (Method Overloading)
✅ What it means

Multiple methods with the same name but different parameters in the same class.

⚠️ Conditions / Rules
- Method name must be the same.
void add(int a, int b) 
void add(double a, double b) 

- Parameter list must be different.
Different number of parameters → ✅
Different type of parameters → ✅
Different order of parameters → ✅
Example:

void show(int a)
void show(double a)
void show(int a, double b)
void show(double a, int b)

- Return type doesn’t matter (it cannot alone distinguish methods).
❌ You cannot overload only by changing the return type.

int add(int a, int b)
double add(int a, int b)  // ❌ Invalid — same parameters

- Can be in the same class (no inheritance required).
---
# 2. Runtime Polymorphism (Method Overriding)

➡️ When a child class provides its own implementation of a method already defined in the parent class.
```
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Dog(); // reference of parent, object of child
        Animal a2 = new Cat();

        a1.sound(); // calls Dog's version
        a2.sound(); // calls Cat's version
    }
}
```
---

# CONDITIONS for Runtime Polymorphism (Method Overriding)
✅ What it means

A child class gives its own implementation of a method already defined in the parent class.

⚠️ Conditions / Rules

- Inheritance is required.
- Must be between a parent and child class.
- class Parent { void show() {} }
- class Child extends Parent { void show() {} }


- Same method name as parent method.
- Same parameter list (number, type, and order must match exactly).
- Return type must be same (or covariant — meaning, can return a subclass type).

Example:
```
class Parent {
    Parent getObj() { return this; }
}

class Child extends Parent {
    Child getObj() { return this; } // ✅ Covariant return
}
```

Access modifier should not be more restrictive than parent’s.

Example:

class Parent { protected void show() {} }
class Child extends Parent { public void show() {} } // ✅ allowed


❌ You cannot make it more restricted (like private).

static, final, or private methods cannot be overridden.
static → method hiding happens (not real overriding).
final → cannot override.
private → not visible in child.

The object type (not reference type) decides which method runs — that’s why it’s called runtime polymorphism.

Parent obj = new Child();
obj.show(); // runs Child's show()
---
# 🔐 ACCESS SPECIFIERS (or Access Modifiers)

Definition:
Access Specifiers in Java define the scope (visibility) of classes, methods, and variables —
that is, where they can be accessed from.

There are 4 types of access specifiers in Java:
---
1. private
The most restrictive access level.
Members declared as private are accessible only within the same class.

```
class Car {
    private String color = "Red"; // private variable

    private void showColor() {     // private method
        System.out.println(color);
    }
}
class Main {
    public static void main(String[] args) {
        Car c = new Car();
        // c.showColor(); ❌ Error: showColor() has private access
        // System.out.println(c.color); ❌ Error
    }
}
```
- Use when: You want data hiding (encapsulation).

---
2. default (no keyword)
If you don’t write any access specifier, it’s default (package-private).
Accessible only within the same package.
```
class Bike {
    String brand = "Hero"; // default access
}
class Test {
    public static void main(String[] args) {
        Bike b = new Bike();
        System.out.println(b.brand); // ✅ Works (same package)
    }
}
```
- If another class in a different package tries to access brand, ❌ it will cause an error.

✅ Use when: You want to keep things package-level visible.
---
3. protected
Accessible within the same package and also in subclasses (even in other packages).
```
package vehicles;
public class Vehicle {
    protected String type = "Car";
}
```
```
package cars;
import vehicles.Vehicle;

public class Car extends Vehicle {
    public void display() {
        System.out.println(type); // ✅ Accessible (through inheritance)
    }
}
```
Use when: You want to share data with subclasses safely.
---
4. public
The most open access level.
Members are accessible everywhere — in any class, any package.

```
public class Student {
    public String name = "Sandip";
    public void show() {
        System.out.println("Name: " + name);
    }
}

class Main {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name); // ✅ Works anywhere
    }
}
```

✅ Use when: You want the member or class to be universally available.