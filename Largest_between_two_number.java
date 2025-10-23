import java.util.*;
public class Largest_between_two_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b){
            System.out.println(a+" is greatest number");
        }
        else{
            System.out.println(b+" is greatest number");
        }
        sc.close();
    }
}
