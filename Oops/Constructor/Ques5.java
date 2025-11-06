// Check Constructor Execution
// Create a class Laptop and print a message ("Constructor called!")
// each time a constructor is executed.
// Observe how many times it’s printed when you create multiple objects.

import java.util.*;

class Laptop{
    static int count = 0;
    Laptop(){
         count++;
        System.out.println("Construction called!"+count);
    }
}
public class Ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Laptop lp1 = new Laptop();
        Laptop lp2 = new Laptop();
        Laptop lp3 = new Laptop();
        Laptop lp4 = new Laptop();
        
        sc.close();
    }
}
