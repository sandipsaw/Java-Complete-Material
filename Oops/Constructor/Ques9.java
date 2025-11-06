//9. Constructor Calling Order
// Create two classes Parent and Child.
// Each has a constructor printing a message.
// Create an object of Child and observe which constructor runs first.
// (Hint: inheritance concept → Parent constructor runs first)
import java.util.*;
class Parent{
    Parent(){
        System.out.println("Parent constructor");
    }
}
class Child extends Parent{
    Child(){
        System.out.println("Child constructor");
    }
}
public class Ques9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Child cd1 = new Child();
        sc.close();
    }
}
