import java.util.*;
public class Eligibility_to_vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of voters");
        String name = sc.nextLine();
        System.out.println("Enter the age of voters : ");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println(name+" is Eligible for Voting");
        }
        else{
            System.out.println(name+" is not Eligible for Voting");
        }
        sc.close();
    }
}