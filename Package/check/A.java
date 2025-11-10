package check;

class launch{
    public void abc(){
        A obj = new A();
        System.out.println(obj.data); // here data is declared as a protected and it can access in the same package
    }
}

// proocteted is accessible in the same class , same package , same package ka subclass

class F{
    public void str(){
        A obj6 = new A();
        System.out.println(obj6.data); 
    }
}
public class A {
    int marks = 10; // default
    public int Roll_no = 10;
   protected int data = 142006;

}
