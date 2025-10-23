import java.util.*;
public class Password_validation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a password : ");
        String password = sc.nextLine();
        boolean hasNumber = false;
        boolean hasSpecialChar = false;

        if(password.length()>=8){
            for(int i=0;i<password.length();i++){
                char ch = password.charAt(i);
                if(Character.isDigit(ch)){
                    hasNumber = true;
                }
                else if(!Character.isLetterOrDigit(ch)){
                    hasSpecialChar = true;
                }
            }
            if(hasNumber && hasSpecialChar){
                System.out.println("Strong Password : "+password);
            } else {
                System.out.println("Weak password ");
                if(!hasNumber) System.out.println("- Must contain at least one number");
                if(!hasSpecialChar) System.out.println("- Must contain at least one special character");
            }
        }
        else{
             System.out.println("Password too short! Must be at least 8 characters.");
        }
        
        sc.close();
    }
}
