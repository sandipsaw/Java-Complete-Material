import check.A;

public class Demo {
    public static void main(String[] args) {
        A obj1 = new A();
        // System.out.println(obj.marks); // here marks is not declared as a public so it cannot be access outside the package

        System.out.println(obj1.Roll_no); // here Roll_no is declared as a public so it can be access outside the package

        B obj2 = new B();
        System.out.println(obj2.marks); // here marks is declared as a default so it can be access becouse it is in the same package 
    }
}