// Constructor Overloading
// Create a class Rectangle having:
// one constructor with no parameters (default 0, 0),
// one constructor with one parameter (square),
// one constructor with two parameters (length and breadth).
// Calculate and display the area in each case.

import java.util.*;

class Rectangle {
    int length;
    int breadth;
    int Area;

    Rectangle() {
        length = 0;
        breadth = 0;
    }

    Rectangle(int length) {
        this.length = length;
        this.breadth = length;
    }

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int calculate() {
        Area = length * breadth;
        return Area;
    }

    void display() {
        System.out.println("The area of rectangle is : " + calculate());
    }
}

public class Ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle r1 = new Rectangle();
        r1.calculate();
        r1.display();
        Rectangle r2 = new Rectangle(10);
        r2.calculate();
        r2.display();
        Rectangle r3 = new Rectangle(10, 20);
        r3.calculate();
        r3.display();
        sc.close();
    }
}
