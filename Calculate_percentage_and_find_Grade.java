import java.util.*;
public class Calculate_percentage_and_find_Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks of Hindi English Math Science Socal_science");
        int Hindi = sc.nextInt();
        int English = sc.nextInt();
        int Math = sc.nextInt();
        int Science = sc.nextInt();
        int Socal_science = sc.nextInt();

        int totalMarks = Hindi+English+Math+Science+Socal_science;

        double percentage = (totalMarks / 500.0) * 100;
        System.out.println("You get "+percentage+" % out of 100%");
        if(percentage>=90) System.out.println("A grade");
        else if (percentage>=80 && percentage<90) System.out.println("B grade");
        else if (percentage>=70 && percentage<80) System.out.println("C grade");
        else if (percentage>=60 && percentage<70) System.out.println("D grade");
        else System.out.println("F grade");
        sc.close();
    }
}