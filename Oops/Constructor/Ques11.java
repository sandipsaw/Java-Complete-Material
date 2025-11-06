//11. Chaining Constructors (this keyword)
// Create a class Box with three constructors:
// Default constructor (prints “Default Box”)
// One-parameter constructor (sets side)
// Three-parameter constructor (sets length, breadth, height)
// Use constructor chaining using this() keyword.

import java.util.*;
class Box {
    int length, breadth, height;
    Box() {
        System.out.println("Default Box");
    }

    Box(int side) {
        this(); // Step 1: calls Default constructor
        length = breadth = height = side;
        System.out.println("Cube with side: " + side);
    }

    Box(int length, int breadth, int height) {
        this(length); // Step 1: calls One-parameter constructor
        this.breadth = breadth;
        this.height = height;
        System.out.println("Rectangle Box: " + length + " x " + breadth + " x " + height);
    }
}
public class Ques11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            Box b2 = new Box(10,20,30);
        sc.close();
    }
}