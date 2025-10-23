import java.util.*;
public class Largest_between_three_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println(a+" is a greatest number");
        }
        else if(b>a && b>c){
            System.out.println(b+" is a greatest number");
        }
        else{
            System.out.println(c+" is a greatest number");
        }
        sc.close();
    }
}
